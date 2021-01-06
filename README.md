# keepalive
A simple command line utility that prevents automatic screen locking by wobbling the mouse cursor at regular intervals.

In reality, this utility is only useful to users who's security policy has removed their ability to configure their screen saver and locking options.

Run this application in the background to wobble the mouse every couple minutes when it detects that your session is idle. Its that simple and it works!

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
