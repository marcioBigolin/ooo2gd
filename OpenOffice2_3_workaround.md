**This page describe steps needed to proper work of older AddOn versions with !OOo 2.3.
Instead of read how to make older versions work you better download newest possible version of AddOn from [here](http://code.google.com/p/ooo2gd/downloads/list)**


In OpenOffice.org 2.3 AddOn doesn't work after simple installing of OXT file.

Until more comfortable solution won't be available pleas use this workaround.

Install AddOn (from [here](http://code.google.com/p/ooo2gd/downloads/list))

Download file [libs.zip](http://ooo2gd.googlecode.com/files/libs.zip) and extract it into some directory (assume that it will be (under Windows) C:\Program Files\GDOCS\), after this you should have in this directory files:
  * gdata-client-1.0.jar
  * gdata-docs-1.0.jar
  * gdata-spreadsheet-1.0.jar
  * mail-1.4.jar

Start OpenOffice.org Writer.

From menu choose Tools -> Options -> Java -> Class Path. Add all files from libs.zip to Class Path (as a result you should see 4 JAR files in Window with Class Path). Click OK and OK, and restart OpenOffice.org (you must also exit from Quickstarter).

After this start again OpenOffice.org, everything should works well.


[Here you may find presentation describing whole process of workaround](http://docs.google.com/TeamPresent?fs=true&docid=ajg23wkfz9qn_449gt2kn8&skipauth=true) - presentation hosted on Google Docs







