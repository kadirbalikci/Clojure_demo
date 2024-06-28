(ns tutorial.BankTransactions)

(def BuyerAccount (ref 100))
(def merchantAccount (ref 0))
(def prices {'pen 1, 'notebook 5, 'backpack 10})
(def items (ref []))

(defn printInfo
  []
  (println "\nPrintInfo:")
  (println "buyerAccount: " @BuyerAccount)
  (println "merchantAccount: " @merchantAccount)
  (println "items:" @items)
  )

(defn buy
  [item]
  (def itemPrice (get prices item))
  (if (<= itemPrice @BuyerAccount)
    (dosync
      (ref-set merchantAccount (+ @merchantAccount itemPrice))
      (ref-set BuyerAccount (- @BuyerAccount itemPrice))
      (def newItems (cons item @items))
      (ref-set items newItems))
    (println "Insufficient Funds")
    )

  (printInfo)
  )

(buy 'pen)
(buy 'notebook)
(buy 'backpack)
(buy 'notebook)
(buy 'notebook)
(buy 'backpack)
(buy 'backpack)
(buy 'backpack)
(buy 'backpack)
(buy 'backpack)
(buy 'backpack)
(buy 'backpack)
(buy 'backpack)
(buy 'backpack)
(buy 'backpack)


