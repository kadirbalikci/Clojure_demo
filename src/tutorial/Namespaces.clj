(ns tutorial.Namespaces
  (:require [clojure.string :refer [capitalize]])) "if we say :all instead of capitalize here it imports all functions, which is not recommended"


(defn -main
  []
  (println (capitalize "hello") )
  )
(-main)