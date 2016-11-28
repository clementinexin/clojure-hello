(ns clojure-hello.learn)


(+)

(def x 1)

(cond
  (> x 0) "greater"
  (= x 0) "equals zero"
  (< x 0) "lesser")


(+ 1 2 3)
(+ 1, 2, 3)
(+ 1,,,, 2 3,,)

(def a-map {:a 1 :b 2 :c 3})
a-map

;;add function
(defn add [x y]
      (+ x y))

(def add-function
  (fn [x y] (+ x y)))

(.contains "clojure in action" "-")
(.endsWith "joy in clojure" "e")


(keyword "aaa")

(symbol "xxx" "aaa")

(name :xxx/aaa)

(namespace :xxx)

(list 1 2 3)

(list? *1)

(conj (list 1 2 3) 4)

(peek (list 1 2 3))

(pop (list 1 2 3))

(peek (list))
(pop (list))

(count (list))
(count (list 1 2 3))

(def three-numbers (1 2 3))

(def three-numbers '(1 2 3))

(vector 1 2 3)

(def the-vector [1 3 5])

(get the-vector 2)
(nth the-vector 2)
(get the-vector 3)
(nth the-vector 3)
(assoc the-vector 2 10)
(assoc the-vector 3 11)
(assoc the-vector 4 12)

(conj [2 4 6] 8)

(conj 8 [2 4 6])
(peek [5 10])
(pop [5 10])
(peek [])
(pop [])

(hash-map :a 1 :b 2 :c 3)
(hash-map :b)
(a-map :b)
(:c a-map)
(:d a-map 4)

(def updated-map (assoc a-map :d 4))
updated-map
(dissoc updated-map :b)

(def users {:apple {
                    :date-joined "1980-01-01"
                    :summary     {
                                  :average {
                                            :monthly 1000
                                            :yearly  12000
                                            }
                                  }}})
(assoc-in users [:apple :summary :average :monthly] 2000)

(get-in users [:apple :summary :average :monthly])

(update-in users [:apple :summary :average :monthly] + 1500)

(first (list 1 2 3))
(rest (list 1 2 3))
(first [1 2 3])
(rest [1 2 3])
(first {:a 1 :b 2})
(rest {:a 1 :b 2})
(first [])
(rest [])
(cons 1 [2 3 4])

(list? (cons 1 (list 2 3 4)))

(let [
      x 1
      y 2
      z (+ x y)]
     z)

(defn average-pets [] (/ (apply + (map :number-pets (vals users))) (count users)))

(defn average-pets []
      (let [
            user-data (vals users)
            pets-count (map :number-pets user-data)
            total (apply + pets-count)]
           (/ total (count users))))

(if (> 1 0)
  "y"
  "n")
(if-not (> 1 0)
        "n"
        "y")

(when (> 1 0)
      (println "one")
      (println "is")
      (println "greater")
      "done")

(when-not (< 1 0)
          (println "zero")
          (println "is")
          (println "smaller")
          "done")



