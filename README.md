# hdfjava-eclipse-plugin

An Eclipse plugin to provide HDF support in OSGI and Eclipse RCP
applications.

## Install

The most recent version of the plugin is for HDF Java 2.11.

To install the plugin, add the following URL to the list of available
software sites in eclipse.

```
https://raw.githubusercontent.com/wiki/markroyer/hdfjava-eclipse-plugin/ncsa.hdf.hdfjava.repository/updates
```

Alternatively, you may want to add the following composite repository
which contains a number of related libraries.


```
https://rawgit.com/markroyer/p2-repositories/master
```

## Building

The project can be built most easily using maven from the
`ncsa.hdf.hdfjava.parent` directory. Typing

```bash
mvn clean verify
```

will compile the project and create a repository containing all of the
related libraries in

```bash
../../hdfjava-eclipse-plugin.wiki/
```

## LICENSE

See included LICENSE file.

## Thanks

The ant build scripts are based on code from:

[http://www.lorenzobettini.it/2015/01/creating-p2-composite-repositories-during-the-build/](http://www.lorenzobettini.it/2015/01/creating-p2-composite-repositories-during-the-build/)


<!--  LocalWords:  hdfjava HDF OSGI RCP mvn
 -->
