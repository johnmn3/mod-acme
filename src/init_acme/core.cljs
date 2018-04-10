(ns init-acme.core
  (:require
    [cljs.loader :as loader]
    [mod-acme.lazy :as acme]))

(enable-console-print!)

(loader/set-loaded! :init-acme)

(println "init-acme.core started")

(acme/hi-acme 1010)

(println "init-acme.core finished")
