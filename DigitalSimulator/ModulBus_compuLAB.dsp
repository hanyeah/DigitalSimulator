# Microsoft Developer Studio Project File - Name="ModulBus_compuLAB" - Package Owner=<4>
# Microsoft Developer Studio Generated Build File, Format Version 6.00
# ** DO NOT EDIT **

# TARGTYPE "Win32 (x86) Dynamic-Link Library" 0x0102

CFG=ModulBus_compuLAB - Win32 Debug
!MESSAGE This is not a valid makefile. To build this project using NMAKE,
!MESSAGE use the Export Makefile command and run
!MESSAGE 
!MESSAGE NMAKE /f "ModulBus_compuLAB.mak".
!MESSAGE 
!MESSAGE You can specify a configuration when running NMAKE
!MESSAGE by defining the macro CFG on the command line. For example:
!MESSAGE 
!MESSAGE NMAKE /f "ModulBus_compuLAB.mak" CFG="ModulBus_compuLAB - Win32 Debug"
!MESSAGE 
!MESSAGE Possible choices for configuration are:
!MESSAGE 
!MESSAGE "ModulBus_compuLAB - Win32 Release" (based on "Win32 (x86) Dynamic-Link Library")
!MESSAGE "ModulBus_compuLAB - Win32 Debug" (based on "Win32 (x86) Dynamic-Link Library")
!MESSAGE 

# Begin Project
# PROP AllowPerConfigDependencies 0
# PROP Scc_ProjName ""
# PROP Scc_LocalPath ""
CPP=cl.exe
MTL=midl.exe
RSC=rc.exe

!IF  "$(CFG)" == "ModulBus_compuLAB - Win32 Release"

# PROP BASE Use_MFC 5
# PROP BASE Use_Debug_Libraries 0
# PROP BASE Output_Dir "Release"
# PROP BASE Intermediate_Dir "Release"
# PROP BASE Target_Dir ""
# PROP Use_MFC 6
# PROP Use_Debug_Libraries 0
# PROP Output_Dir "Release/Modulbus_compuLAB"
# PROP Intermediate_Dir "Release/Modulbus_compuLAB"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /MT /W3 /GX /O2 /D "WIN32" /D "NDEBUG" /D "_WINDOWS" /D "_WINDLL" /Yu"stdafx.h" /FD /c
# ADD CPP /nologo /MD /W3 /GX /O2 /D "WIN32" /D "NDEBUG" /D "_WINDLL" /D "_AFXDLL" /YX /FD /c
# ADD BASE MTL /nologo /D "NDEBUG" /mktyplib203 /o "NUL" /win32
# ADD MTL /nologo /D "NDEBUG" /mktyplib203 /o "NUL" /win32
# ADD BASE RSC /l 0x407 /d "NDEBUG"
# ADD RSC /l 0x407 /d "NDEBUG" /d "_AFXDLL"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LINK32=link.exe
# ADD BASE LINK32 /nologo /subsystem:windows /dll /machine:I386
# ADD LINK32 /nologo /subsystem:windows /dll /machine:I386 /out:"bin\plugins\ModulBus_compuLAB.dll"

!ELSEIF  "$(CFG)" == "ModulBus_compuLAB - Win32 Debug"

# PROP BASE Use_MFC 5
# PROP BASE Use_Debug_Libraries 1
# PROP BASE Output_Dir "ModulBus"
# PROP BASE Intermediate_Dir "ModulBus"
# PROP BASE Target_Dir ""
# PROP Use_MFC 6
# PROP Use_Debug_Libraries 1
# PROP Output_Dir "Debug/Modulbus_compuLAB"
# PROP Intermediate_Dir "Debug/Modulbus_compuLAB"
# PROP Ignore_Export_Lib 0
# PROP Target_Dir ""
# ADD BASE CPP /nologo /MTd /W3 /Gm /GX /Zi /Od /D "WIN32" /D "_DEBUG" /D "_WINDOWS" /D "_WINDLL" /Yu"stdafx.h" /FD /c
# ADD CPP /nologo /MDd /W3 /Gm /GX /ZI /Od /D "WIN32" /D "_DEBUG" /D "_WINDLL" /D "_AFXDLL" /FR /YX /FD /c
# ADD BASE MTL /nologo /D "_DEBUG" /mktyplib203 /o "NUL" /win32
# ADD MTL /nologo /D "_DEBUG" /mktyplib203 /o "NUL" /win32
# ADD BASE RSC /l 0x407 /d "_DEBUG"
# ADD RSC /l 0x407 /d "_DEBUG" /d "_AFXDLL"
BSC32=bscmake.exe
# ADD BASE BSC32 /nologo
# ADD BSC32 /nologo
LINK32=link.exe
# ADD BASE LINK32 /nologo /subsystem:windows /dll /debug /machine:I386 /pdbtype:sept
# ADD LINK32 /nologo /subsystem:windows /dll /debug /machine:I386 /pdbtype:sept

!ENDIF 

# Begin Target

# Name "ModulBus_compuLAB - Win32 Release"
# Name "ModulBus_compuLAB - Win32 Debug"
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\ModulBus_compuLAB\DialogOption.cpp
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\ModulBus_compuLAB\DialogOption.h
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\IInputContext.h
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\IOutputContext.h
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\IPluginInfo.h
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\ModulBus_compuLAB\ModulBus_compuLAB.rc
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\PluginInterface.h
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\ModulBus_compuLAB\resource.h
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\SerialPort.cpp
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\SerialPort.h
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\ModulBus_compuLAB\SerialPortContext.cpp
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\StdAfx.cpp
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\StdAfx.h
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\SysColorStatic.cpp
# End Source File
# Begin Source File

SOURCE=.\sources\Plugins\DLL\SerialPort\SysColorStatic.h
# End Source File
# End Target
# End Project
