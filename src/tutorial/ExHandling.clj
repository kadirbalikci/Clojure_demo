(ns tutorial.ExHandling)

(defn Exceptions
  [x]
  (try
    (inc x)
    (catch ClassCastException e (println "Caught Exception: " (.getMessage e)))
    (catch Exception e (println "Caught generic exception"))
    (finally (println "cleanup and move on")))
  )

(Exceptions "hello")