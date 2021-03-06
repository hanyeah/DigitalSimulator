/*
 * Copyright (c) 2003 JGoodies Karsten Lentzsch. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  o Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer. 
 *     
 *  o Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution. 
 *     
 *  o Neither the name of JGoodies Karsten Lentzsch nor the names of 
 *    its contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission. 
 *     
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */

package com.jgoodies.forms.tutorial.building;

import java.awt.Component;

import javax.swing.*;

import com.jgoodies.forms.builder.ButtonStackBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Demonstrates how to build button stacks using the ButtonStackBuilder.
 *
 * @author  Karsten Lentzsch
 * @version $Revision: 1.1 $
 * @see     ButtonStackBuilder
 */
public final class ButtonStacksExample {
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jgoodies.plaf.plastic.PlasticXPLookAndFeel");
        } catch (Exception e) {
            // Likely PlasticXP is not in the class path; ignore.
        }
        JFrame frame = new JFrame();
        frame.setTitle("Forms Tutorial :: Button Stacks");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JComponent panel = new ButtonStacksExample().buildPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.show();
    }


    public JComponent buildPanel() {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.putClientProperty("jgoodies.noContentBorder", Boolean.TRUE);

        tabbedPane.add(buildButtonStackNoBuilder(),    "No Builder");
        tabbedPane.add(buildButtonStackWithBuilder(),  "With Builder");
        tabbedPane.add(buildButtonStackRelated(),      "Related");
        tabbedPane.add(buildButtonStackUnrelated(),    "Unrelated ");
        tabbedPane.add(buildButtonStackMixedDefault(), "Mix Default");
        tabbedPane.add(buildButtonStackMixedNarrow(),  "Mix Narrow");
        return tabbedPane;
    }
    
    private Component buildButtonStackNoBuilder() {
        JPanel buttonStack = new JPanel(
            new FormLayout("p", "p, 4px, p"));
        buttonStack.add(new JButton("Yes"), "1, 1");                      
        buttonStack.add(new JButton("No"),  "1, 3");   
        
        return wrap(buttonStack, 
            "\nThis stack has been built without a ButtonStackBuilder.\n" +
            " o The buttons have no minimum width and\n" +
            " o The gaps use pixel sizes and do not scale with the font\n" +            " o The gaps may become inconsisten in a team.");
    }

    private Component buildButtonStackWithBuilder() {
        ButtonStackBuilder builder = new ButtonStackBuilder();
        builder.addGridded(new JButton("Yes"));                      
        builder.addRelatedGap();                   
        builder.addGridded(new JButton("No"));   
        return wrap(builder.getPanel(),
            "\nThis stack has been built with a ButtonStackBuilder.\n" +
            " o The buttons have a minimum width and\n" +
            " o The button gap is a logical size that follows a style guide.");
    }
    
    private Component buildButtonStackRelated() {
        ButtonStackBuilder builder = new ButtonStackBuilder();
        builder.addGridded(new JButton("Related"));   
        builder.addRelatedGap();                   
        builder.addGridded(new JButton("Related"));   
        builder.addRelatedGap();                   
        builder.addGridded(new JButton("Related"));   

        return wrap(builder.getPanel(),
            "\nThis stack uses the logical gap for related buttons.\n");
    }
    
    private Component buildButtonStackUnrelated() {
        ButtonStackBuilder builder = new ButtonStackBuilder();
        builder.addGridded(new JButton("Unrelated"));   
        builder.addUnrelatedGap();                   
        builder.addGridded(new JButton("Unrelated"));   
        builder.addUnrelatedGap();                   
        builder.addGridded(new JButton("Unrelated"));   

        return wrap(builder.getPanel(),
            "\nThis stack uses the logical gap for unrelated buttons.\n");
    }
    
    private Component buildButtonStackMixedDefault() {
        ButtonStackBuilder builder = new ButtonStackBuilder();
        builder.addGridded(new JButton("OK"));   
        builder.addRelatedGap();                   
        builder.addGridded(new JButton("Cancel"));   
        builder.addUnrelatedGap();
        builder.addGridded(new JButton("Help"));
        builder.addUnrelatedGap();
        builder.addGlue();
        builder.addFixed(new JButton("Copy to Clipboard"));

        return wrap(builder.getPanel(),
            "\nDemonstrates a glue (between Help and Copy),\n" +
            "has related and unrelated buttons and\n" +            "a button with long label with the default margin.");
    }
    
    private Component buildButtonStackMixedNarrow() {
        ButtonStackBuilder builder = new ButtonStackBuilder();
        builder.addGridded(new JButton("OK"));   
        builder.addRelatedGap();                   
        builder.addGridded(new JButton("Cancel"));   
        builder.addUnrelatedGap();
        builder.addGridded(new JButton("Help"));
        builder.addUnrelatedGap();
        builder.addGlue();
        builder.addGriddedNarrow(new JButton("Copy to Clipboard"));

        return wrap(builder.getPanel(),
            "\nDemonstrates a glue (between Help and Copy),\n" +
            "has related and unrelated buttons and\n" +
            "a button with long label with a narrow margin.");
    }
    
    
    // Helper Code ************************************************************
    
    private Component wrap(Component buttonStack, String text) {
        Component textPane = new JScrollPane(new JTextArea(text));
        
        FormLayout layout = new FormLayout(
                        "fill:p:grow, 6dlu, p",
                        "fill:p:grow");
        JPanel panel = new JPanel(layout);
        CellConstraints cc = new CellConstraints();
        panel.setBorder(Borders.DIALOG_BORDER);
        panel.add(textPane,     cc.xy(1, 1));
        panel.add(buttonStack,  cc.xy(3, 1));                   
        return panel;
    }

    
}

