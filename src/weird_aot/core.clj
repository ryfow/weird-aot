(ns weird-aot.core
  (:require [ring.adapter.jetty :as jetty]
            [clojure.core.async])
  (:gen-class))

(defn -main [] (println "hello"))
