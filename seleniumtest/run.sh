#!/usr/bin/env bash
mvn clean package
java -Dfirefox="/Users/stallman/Applications/Firefox.app/Contents/MacOS/firefox" -Dsugarurl="http://gnuhub.local:8080/sugarcrm/" -jar target/seleniumtest-1.0-SNAPSHOT.jar