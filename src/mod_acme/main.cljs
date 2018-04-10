(ns mod-acme.main
  (:require
    [cljs.loader :as loader]
    [mod-one.lazy :as one]
    [mod-two.lazy :as two]
    [mod-three.lazy :as three]
    [mod-four.main :as four]))



;; provides

(defn hi-acme [n]
  (println "hi-acme got:" n)
  (inc n))


(enable-console-print!)

(println "mod-acme.main started")

(one/hi-one "mod-acme")

(two/hi-two 100)

(three/hi-three "mod-acme")

(four/hi-four)

(println "mod-acme.main finished")

(loader/set-loaded! :mod-acme)
