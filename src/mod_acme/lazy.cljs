(ns mod-acme.lazy
  (:require-macros
   [mod-base.macros :refer [defxmod]])
  (:require
   [cljs.loader :as loader]))

(defxmod hi-acme :mod-acme 'mod-acme.main/hi-acme)
