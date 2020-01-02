# FrameworkshopBackend

Repo containing a basic framework containing backend tests. It uses RestAssured to communicate with
the Valori Webshop webservice. Currently only contains tests that check for valid response codes when
calling API endpoints using GET requests.

Running tests on Mac / Linux:
``` shell script
./gradlew test
```

Running tests on Windows:
``` shell script
gradlew test
```