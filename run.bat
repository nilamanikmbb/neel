set projectLocation=C:\Users\Datascience\Desktop\Driver\POM_hrms
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml