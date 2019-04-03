# -POC-Streams
## Version 1.0.2

Version | Changes
------------ | -------------
 Version 1.0.2 |Added a new method in PersonController, now Person implements comparable and remove warnings in classes
 Version 1.0.1 |Added Builder Design Pattern.
 Version 1.0.0 |Proof of concept of Streams in jdk 1.8

## Methods

* .executeOver21() //Show person Over 21
* .executeUnder18() //Show person Under 18
* .executeOver21WithSSN() //Show person Over 21 with SSN > 20.000.000
* .showNamesofOnly2Over21() // Take the local list, filter by age over 21, map only the firstName, sorted reversed alphabetical, limit the result to 2 and collect into a list
