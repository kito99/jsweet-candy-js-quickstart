## Description

To be usable by JSweet programs, JavaScript libraries need to be accessible from Java. To make them available, we need to package the Java APIs in Maven artifacts (so-called candies).

Most well-known JavaScript libraries are already available as candies in the JSweet repository. However, you may want to package (and maybe publish) your own candy because the right library (or library version) is not available, or simply because you are not happy with the existing candy.

This project defines a template and can be used as a starting point to create your own candy from an existing JavaScript library.

For the sake of example, we will use a very simple library: [sprintf-js](https://www.npmjs.com/package/sprintf-js).

## How to build

Install with Maven:

```bash
> mvn install
```

This command performs the following Maven phases:
- ``compile``: compile with Java the Java APIs sources found in ``src/main/java``
- ``generate-sources``: create the ``.d.ts`` TypeScript definitions bundle and puts it as a resource in ``src/typings``
- ``package``: create the jar with the compiled Java APIs, and all the resources (including the TypeScript definitions, the JavaScript bundle, and the ``candy-metadata.json`` file filtered to set the targeted transpiler version)
- ``install``: install the Maven artifact in your local Maven repository

