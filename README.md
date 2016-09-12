# hdfjava-eclipse-plugin

**HDFJava-Eclipse-Plugin** is an Eclipse plugin that provides HDF support in OSGI and Eclipse RCP
applications.  This makes it easy to deploy applications that use the HDFJava library to 64 bit Linux, Mac, and Windows systems.  If the developer bundles are also installed to your Eclipse IDE, then the Javadoc is added along with linked source code.

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
