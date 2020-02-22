keytool --genkey -alias appsecurity -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore appsecurity.p12
#Kill running instance on the port
netstat -ano|findstr "PID :8081"