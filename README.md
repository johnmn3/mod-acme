# mod-acme
Testing of closure module based code splitting with the clj/cljs.main tools

This is a "downstream" module that depends on upstream modules.

Look in the `co.edn` file to see the inherited modules and the ones locally
specified.

To run, first clone this repo and `cd` into the project directory.

Run `clj -m cljs.main -co co.edn -c`

And then, in another terminal, run `clj -m cljs.main -r`
