#!/bin/sh

# cat make-linux-binary.sh ../target/keepalive-1.0.0-SNAPSHOT-shaded.jar > ../target/keepalive
# chmod +x ../target/keepalive

SELF=`which "$0" 2>/dev/null`
[ $? -gt  0 -a -f "$0" ] && SELF="./$0"

JAVA_OPT=""
PROG_OPT=""

while [ $# -gt 0 ] ; do
    case $1 in
        -Xm*) JAVA_OPT="$JAVA_OPT $1" ;;
        -D*)  JAVA_OPT="$JAVA_OPT $1" ;;
        *)    PROG_OPT="$PROG_OPT $1" ;;
    esac
    shift
done

exec java $JAVA_OPT -jar $SELF $PROG_OPT
