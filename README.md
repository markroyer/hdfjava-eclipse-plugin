# hdfjava-eclipse-plugin

An Eclipse plugin to provide HDF support in OSGI and Eclipse RCP
applications.

## Install

The most recent version of the plugin is for HDF Java 2.11.

To install the plugin, add the following URL to the list of available
software sites in eclipse.
[https://cdn.rawgit.com/markroyer/p2-repositories/master](https://cdn.rawgit.com/markroyer/p2-repositories/master)

## Building

The project can be built most easily using maven from the
`ncsa.hdf.hdfjava.parent` directory. Typing

```bash
mvn clean verify
```

will build the project and place the built project in

```bash
../../p2.repositories/
```

You can check out all the p2 repository projects by adding the URL

```
https://cdn.rawgit.com/markroyer/p2-repositories/master
```

to your Eclipse repository locations.

## LICENSE

See included LICENSE file.

## Thanks

The ant build scripts are based on code from:

http://www.lorenzobettini.it/2015/01/creating-p2-composite-repositories-during-the-build/


<!--  LocalWords:  hdfjava HDF OSGI RCP mvn Prelease
 -->
