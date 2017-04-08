(defn toss-coin []
  (rand-int 2))

(defn start [ite]
  (loop [n 1 total 0 avg []]
    (if (> n ite)
      (map float avg)
      (do
        (let [outcome (toss-coin)]
          (recur (+ n 1) (+ total outcome) (conj avg (/ total n))))))))

(defn write-data [col]
  (let [vec (map-indexed (fn [idx item]
                           (str idx " " item)) col)
        data (clojure.string/join "\n" vec)
        header "avg\n"
        file "/tmp/coin-toss-result.txt"]
    (spit file header)
    (spit file data :append true)
    (spit file "\n" :append true)))

(write-data (start 1000))
