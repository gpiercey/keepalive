# keepalive
A simple command line application that prevents automatic screen locking by wobbling the mouse cursor at regular intervals.

I wrote this application when I am working from home because the corporate security policy that locks my computer when the screen saver runs is very counter-productive and I am unable to change the settings.

To address this issue I needed something to prevent the session from going idle. I didn't trust the sources of similar applications available on the internet so I wrote my own and the source code is available for full disclosure. Examine it yourself to be sure it is not doing something bad.

## Make Windows Binaries

```
mvn package
cd target
.\keepalive.exe
```

## Make Linux/Mac Binaries

```
$ cd scripts
$ cat make-linux-binary.sh ../target/keepalive-1.0.0-SNAPSHOT.jar > keepalive
$ chmod +x keepalive
$ ./keepalive
```
