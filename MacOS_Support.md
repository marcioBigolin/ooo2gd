OK, it looks that currently OOo2GD doesn't work on newest MacOS (don't ask me for version, I don't know how versions works in Mac OS ;-) ).

Last known for me version of Mac OS X where it works without problems is OS X 10.4 aka Tiger. In Tiger and earlier versions it worked well with NeoOffice, in newest versions it works, but windows looks bad, and because of this they are almost unusable. This problem is visible in all Java extensions for OO.org (or on Mac rather to NeoOffice and LiberOffice) which are using Java to create windows.
If you want anybody to fix this problem complain to Apple, its theirs call.

Additionally it will not work in Mac version of OpenOffice.org because Mac version of OpenOffice.org has bug which doesn't let to use AWT/Swing in OO.org extensions. More details here http://www.openoffice.org/issues/show_bug.cgi?id=92926
This problem isn't present in NeoOffice and from this what I know also isn't present in LibreOffice.
But still, with newest versions of Mac OS X it will look bad.

I don't have Mac OS X so I'm not able even to try if it is possible to write special handling of windows for Mac OS X......

Extension works well on Windows and Linux, only newest versions of Mac OS X have some bug which cause that Java extensions of NeoOffice/LibreOffice cannot present good looking windows to user.

Yeah, I know that for example LanguageTool has most of windows looking good on newest Mac OS X, but those are "native" for OO.org windows, so extensions are only using windows of OpenOffice.org, but theirs one window which is created by Java, so Configuration looks also bad.