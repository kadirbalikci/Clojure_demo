(ns tutorial.functions
  (:gen-class))


(defn -main
  "First Function"
  []
  (println "my name is Kadir")
  (println "loving learn new things")
  (+ 2 5))

#(println "Hello" %)

(#(println "Hello" %1 "how are you" %2) "John" "today")

(def increment (fn [x] (+ x 1)))

(defn increment_set
  []
  (map increment [1 2 3]))

(defn increment_set1
  [x]
  (map increment x))

(defn DataTypes []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12)
  (def d 0xfbfc)
  (def e nil)
  (def f true)
  (def g "Hello")
  (def h 'thanks)

  (println a)
  (println b)
  (println c)
  (println d)
  (println e)
  (println f)
  (println g)
  (println h)
  )
(DataTypes)