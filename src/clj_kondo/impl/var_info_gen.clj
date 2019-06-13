(ns clj-kondo.impl.var-info-gen
  "GENERATED, DO NOT EDIT. EXTRACTED FROM EASTWOOD WITH PERMISSION."
  {:no-doc true})
  (in-ns 'clj-kondo.impl.var-info)
  (def predicates '{clojure.core #{decimal? contains? every? satisfies? seq? fn? = vector? thread-bound? < char? some? future-done? pos? sequential? neg? reduced? float? set? <= reversible? bound? map? volatile? var? empty? string? map-entry? > associative? keyword? even? tagged-literal? extends? counted? future? zero? not-every? class? future-cancelled? sorted? nil? instance? record? identical? true? reader-conditional? >= integer? special-symbol? ratio? delay? ifn? chunked-seq? distinct? odd? false? list? == rational? realized? number? not-any? symbol? coll?}, clojure.string #{ends-with? starts-with? includes? blank?}, clojure.set #{superset? subset?}})


  (def clojure-core-syms '#{primitives-classnames +' decimal? restart-agent sort-by macroexpand ensure chunk-first eduction tree-seq unchecked-remainder-int seq reduce when-first find-ns get-thread-bindings contains? every? proxy-mappings keep-indexed cond->> subs ref-min-history set take-last bit-set reader-conditional gen-class qualified-keyword? while butlast satisfies? line-seq unchecked-subtract-int *print-namespace-maps* take-nth first re-groups seq? dec' ns-unmap println-str with-bindings* inst-ms iterator-seq iterate slurp newline short-array fn? doall prefers enumeration-seq dedupe pr-on dissoc atom import bit-shift-right print-method peek aget pvalues bound-fn mk-bound-fn vswap! last pr namespace push-thread-bindings bases = read+string dosync remove-ns take vector? thread-bound? send-via boolean bit-shift-left any? find-var rand-int aclone PrintWriter-on vreset! chunk dec future-call resultset-seq struct map juxt ns-publics < *source-path* with-loading-context test rest ex-data compile isa? boolean? .. munge delay set-error-mode! re-seq char? make-hierarchy set-agent-send-executor! swap-vals! keep char mapcat unchecked-long aset-long some? unchecked-negate remove-tap gen-interface *command-line-args* reverse inst? range sort -cache-protocol-fn unchecked-inc-int map-indexed with-bindings rand-nth comp await spit future-done? *read-eval* dorun simple-symbol? disj *2 eval cons refer print-dup -reset-methods floats pos? fnil merge-with nthrest load if-not *verbose-defrecords* sequential? *print-level* shuffle boolean-array find alength bit-xor deliver doseq unsigned-bit-shift-right neg? var-set global-hierarchy unchecked-float pmap error-mode num reduced? disj! float? aset-float deftype bean booleans ns-unalias when-let int-array set? inc' process-annotation cat StackTraceElement->vec flush take-while vary-meta <= alter -' if-some conj! repeatedly zipmap reset-vals! alter-var-root biginteger remove * re-pattern min pop! chunk-append prn-str with-precision format reversible? shutdown-agents conj bound? transduce lazy-seq *print-length* *file* compare-and-set! *use-context-classloader* await1 let ref-set pop-thread-bindings interleave printf map? -> defstruct *err* assert-same-protocol get doto identity into areduce long double volatile? definline nfirst meta find-protocol-impl bit-and-not *default-data-reader-fn* var? method-sig unchecked-add-int unquote-splicing hash-ordered-coll future reset-meta! cycle fn seque empty? short definterface add-tap filterv hash quot ns-aliases read unchecked-double key longs not= string? uri? aset-double unchecked-multiply-int chunk-rest pcalls *allow-unresolved-vars* remove-all-methods ns-resolve as-> aset-boolean trampoline double? when-not *1 vec *print-meta* when int map-entry? ns-refers rand second vector-of hash-combine > replace int? associative? unchecked-int set-error-handler! inst-ms* keyword? force bound-fn* namespace-munge group-by prn extend unchecked-multiply some->> default-data-readers ->VecSeq even? unchecked-dec Inst tagged-literal? double-array in-ns create-ns re-matcher defn ref bigint extends? spread promise aset-char rseq ex-cause construct-proxy agent-errors *compile-files* ex-message *math-context* float pr-str concat aset-short set-agent-send-off-executor! ns mk-am symbol to-array-2d mod amap pop use unquote declare dissoc! reductions aset-byte indexed? ref-history-count - assoc! hash-set reduce-kv or cast reset! name ffirst sorted-set counted? byte-array tagged-literal println extend-type macroexpand-1 assoc-in char-name-string bit-test defmethod requiring-resolve EMPTY-NODE time memoize alter-meta! future? zero? simple-keyword? require unchecked-dec-int persistent! nnext add-watch not-every? class? rem agent-error some future-cancelled? memfn neg-int? struct-map drop *data-readers* nth sorted? nil? extend-protocol split-at *e load-reader random-sample cond-> dotimes select-keys bit-and bounded-count update list* reify update-in prefer-method aset-int *clojure-version* ensure-reduced *' instance? with-open mix-collection-hash re-find run! val defonce unchecked-add loaded-libs ->Vec bytes? not with-meta unreduced the-ns record? type identical? unchecked-divide-int ns-name max-key *unchecked-math* defn- *out* file-seq agent ns-map set-validator! ident? defprotocol swap! vals unchecked-subtract tap> *warn-on-reflection* sorted-set-by sync qualified-ident? assert *compile-path* true? release-pending-sends print empty remove-method *in* print-ctor letfn volatile! / read-line binding-conveyor-fn reader-conditional? bit-or clear-agent-errors vector proxy-super >= drop-last not-empty distinct partition loop add-classpath bit-flip long-array descendants merge accessor integer? mapv partition-all partition-by numerator object-array with-out-str condp derive load-string special-symbol? ancestors subseq error-handler gensym cond ratio? delay? intern print-simple flatten doubles halt-when with-in-str remove-watch ex-info ifn? some-> nat-int? proxy-name ns-interns all-ns find-protocol-method subvec for binding partial chunked-seq? find-keyword replicate min-key reduced char-escape-string re-matches array-map unchecked-byte with-local-vars ns-imports send-off defmacro every-pred keys rationalize load-file distinct? pos-int? extenders unchecked-short methods odd? ->ArrayChunk float-array *3 alias frequencies read-string proxy rsubseq inc get-method with-redefs uuid? bit-clear filter locking list + split-with aset ->VecNode keyword *ns* destructure *assert* defmulti chars str next hash-map if-let underive ref-max-history Throwable->map false? *print-readably* ints class some-fn case *flush-on-newline* to-array bigdec list? simple-ident? bit-not io! xml-seq byte max == *agent* lazy-cat comment parents count supers *fn-loader* sorted-map-by apply add-doc-and-meta interpose deref assoc rational? transient clojure-version chunk-cons comparator sorted-map send drop-while proxy-call-with-super realized? char-array resolve compare complement *compiler-options* *print-dup* defrecord with-redefs-fn sequence constantly get-proxy-class make-array shorts completing update-proxy unchecked-negate-int hash-unordered-coll repeat unchecked-inc nthnext and create-struct get-validator number? await-for chunk-next print-str not-any? into-array qualified-symbol? init-proxy chunk-buffer seqable? symbol? when-some unchecked-char ->> future-cancel var-get commute coll? get-in fnext denominator bytes gen-and-load-class refer-clojure})

  (def cljs-core-syms '#{js->clj unsafe-bit-and sort-by macroexpand ITransientAssociative chunk-first print-meta? m3-hash-int pr-str* eduction tree-seq unchecked-remainder-int uuid seq reduce IUUID INIT when-first find-ns contains? every? keep-indexed cond->> subs IFind set MODULE_URIS take-last IndexedSeq bit-set import-macros string-hash-cache-count qualified-keyword? while -with-meta butlast satisfies? unchecked-subtract-int -iterator *print-namespace-maps* take-nth first native-satisfies? seq? -sorted-seq-from ns-unmap println-str inst-ms iterate -empty newline ILookup -chunked-rest write-all fn? -prefer-method -assoc doall keyword-identical? *print-err-fn* prefers -js->clj dedupe dissoc atom import bit-shift-right MapEntry *clojurescript-version* -first peek IKVReduce aget -write iter mk-bound-fn specify vswap! last -default-dispatch-val pr namespace obj-map -conj = ITransientMap take vector? caching-hash boolean IChunk bit-shift-left random-uuid any? coercive-not rand-int aclone BlackNode vreset! chunk dec unchecked-get APersistentVector map juxt ns-publics < *eval* test rest ex-data this-as -drop-first isa? boolean? .. -clone munge delay DEMUNGE_MAP re-seq char? make-hierarchy Symbol PROTOCOL_SENTINEL -reduce -count swap-vals! keep char mapcat unchecked-long m3-seed some? unchecked-negate remove-tap symbol-identical? simple-benchmark *command-line-args* reverse inst? range bit-count create-node sort unchecked-inc-int -compare map-indexed unchecked-set array-list js-str rand-nth comp array-chunk dispatch-fn bit-shift-right-zero-fill -as-transient dorun implements? pr-sequential-writer simple-symbol? IIndexed disj IPrintWithWriter IVector IIterable *2 eval cons goog-define floats TransientVector pos? specify! fnil merge-with nthrest *warn-on-infer* -find if-not sequential? m3-mix-H1 prim-seq *print-level* shuffle ChunkedSeq hash-keyword find alength bit-xor doseq unsigned-bit-shift-right neg? -remove-method js-invoke m3-mix-K1 unchecked-float undefined? IMeta reduced? disj! -lookup float? deftype ICloneable IEncodeClojure booleans RSeq mask when-let int-array set? iterable? cat divide -pr-writer flush coercive-boolean set-from-indexed-seq take-while vary-meta INext is_proto_ START ICounted IMapEntry <= MODULE_INFOS if-some conj! -pop repeatedly zipmap reset-vals! IStack -remove-watch IVolatile remove * re-pattern min -persistent! -nth pop! chunk-append *unchecked-arrays* prn-str IReversible reversible? -realized? -add-watch -deref-with-timeout conj -sorted-seq transduce lazy-seq -swap! *print-length* js-delete truth_ array-index-of key->js IEncodeJS compare-and-set! array-seq js-debugger let interleave print-map map? -> coercive-not= m3-C1 get doto identity into areduce long double volatile? -key nfirst meta tv-editable-tail -kv-reduce IHash bit-and-not var? -comparator unchecked-add-int hash-ordered-coll reset-meta! IEquiv cycle fn -deref empty? short -clj->js -chunked-first add-tap filterv tv-editable-root hash quot ns-interns* unchecked-double ranged-iterator ITransientVector key longs not= set-print-err-fn! fast-path-protocols string? uri? es6-iterator pr-str-with-opts m3-C2 js-arguments *print-newline* unchecked-multiply-int chunk-rest remove-all-methods as-> trampoline double? when-not *1 vec *print-meta* -notify-watches when int map-entry? rand second find-ns-obj IEditableCollection hash-combine > -name replace int? associative? unchecked-int js-keys inst-ms* keyword? array-iter force group-by -rseq prn default-dispatch-val use-macros PersistentHashMap unchecked-multiply gen-apply-to some->> even? es6-iterator-seq unchecked-dec Inst persistent-array-map-seq tagged-literal? double-array create-ns defn seq-reduce spread rseq ex-cause IReset IEmptyableCollection ex-message *print-fn-bodies* string-print float IRecord pr-str es6-set-entries-iterator concat -methods js-reserved IDerefWithTimeout js-in ns symbol es6-iterable to-array-2d ExceptionInfo mod amap ISet pop IPending use -entry-key declare CHAR_MAP dissoc! reductions fast-path-protocol-partitions-count indexed? - -equiv assoc! hash-set reduce-kv or reset! name Fn ffirst sorted-set counted? tagged-literal println extend-type macroexpand-1 assoc-in bit-test defmethod TransientHashMap ISwap ChunkedCons time memoize alter-meta! zero? simple-keyword? *main-cli-fn* require -assoc-n unchecked-dec-int persistent! set-print-fn! nnext add-watch not-every? rem ifind? some INamed IReduce memfn neg-int? drop js-obj ITransientCollection nth sorted? nil? extend-protocol split-at TransientHashSet *e prn-str-with-opts not-native js* random-sample cond-> dotimes select-keys bit-and bounded-count update gensym_counter find-macros-ns list* reify update-in prefer-method ensure-reduced instance? mix-collection-hash load-file* re-find run! val defonce unchecked-add transformer-iterator not -vreset! with-meta unreduced record? type identical? -namespace unchecked-divide-int ns-name max-key defn- *out* hash-string -prefers set-validator! ident? -meta RedNode -dispatch-fn defprotocol -add-method swap! vals -chunked-next unchecked-subtract tap> IMap sorted-set-by cloneable? qualified-ident? hash-string* key-test assert -reset true? array print -peek ISeq empty remove-method letfn volatile! / bitpos bit-or m3-fmix vector hash-coll array->transient-hash-map >= drop-last object? not-empty distinct partition IMultiFn DEMUNGE_PATTERN loop IAssociative bit-flip long-array descendants imul merge ISeqable js-mod integer? NS_CACHE mapv infinite? partition-all partition-by ISequential equiv-map object-array with-out-str Keyword condp derive seq-iter IChunkedSeq special-symbol? ancestors subseq gensym -next cond delay? create-inode-seq flatten -dissoc doubles halt-when -contains-key? remove-watch ex-info ifn? some-> IAtom nat-int? ns-interns IWatchable subvec -pop! for binding partial chunked-seq? replicate min-key reduced re-matches array-map ITransientSet ITER_SYMBOL unchecked-byte ns-imports ArrayNode defmacro every-pred keys missing-protocol load-file PersistentArrayMap distinct? pos-int? unchecked-short methods odd? *3 -get-method frequencies reduceable? string-hash-cache rsubseq inc type->str get-method with-redefs uuid? es6-entries-iterator bit-clear filter locking create-array-node-seq -assoc-n! IWithMeta list + split-with aset int-rotate-left keyword *ns* destructure *assert* defmulti ICollection chars str next ASeq pr-seq-writer coercive-= IFn regexp? hash-map *exec-tap-fn* gen-apply-to-simple if-let underive -reset! -rest nil-iter pr-writer false? *print-readably* ints some-fn case *flush-on-newline* to-array build-subvec list? array? simple-ident? exists? clone demunge bit-not byte max IComparable == lazy-cat comment parents count -disjoin! *loaded-libs* ArrayChunk sorted-map-by apply add-to-string-hash-cache clj->js copy-arguments TransientArrayMap unsafe-cast IChunkedNext interpose deref assoc transient -disjoin chunk-cons comparator print-prefix-map sorted-map drop-while IWriter realized? resolve *print-fn* compare complement -assoc! *print-dup* defrecord string-iter -key->js IDeref sequence constantly chunked-seq ISorted make-array shorts *unchecked-if* enable-console-print! -flush completing unchecked-negate-int equiv-sequential hash-unordered-coll repeat unchecked-inc nthnext and get-validator number? -conj! chunk-next print-str not-any? into-array -hash qualified-symbol? -dissoc! js-comment chunk-buffer seqable? symbol? m3-hash-unencoded-chars when-some unchecked-char require-macros system-time ->> -invoke js-inline-comment coll? get-in fnext dt->et IList List -val bytes refer-clojure -seq})

  (def default-import->qname '{Enum java.lang.Enum, InternalError java.lang.InternalError, NullPointerException java.lang.NullPointerException, InheritableThreadLocal java.lang.InheritableThreadLocal, Class java.lang.Class, Error java.lang.Error, NoSuchFieldException java.lang.NoSuchFieldException, Runtime java.lang.Runtime, Cloneable java.lang.Cloneable, StringIndexOutOfBoundsException java.lang.StringIndexOutOfBoundsException, Object java.lang.Object, VerifyError java.lang.VerifyError, LinkageError java.lang.LinkageError, Process java.lang.Process, ClassLoader java.lang.ClassLoader, Double java.lang.Double, ThreadGroup java.lang.ThreadGroup, ThreadDeath java.lang.ThreadDeath, Callable java.util.concurrent.Callable, UnknownError java.lang.UnknownError, ClassCircularityError java.lang.ClassCircularityError, String java.lang.String, Void java.lang.Void, EnumConstantNotPresentException java.lang.EnumConstantNotPresentException, AbstractMethodError java.lang.AbstractMethodError, StrictMath java.lang.StrictMath, ArrayStoreException java.lang.ArrayStoreException, IllegalArgumentException java.lang.IllegalArgumentException, StackOverflowError java.lang.StackOverflowError, Override java.lang.Override, IllegalAccessError java.lang.IllegalAccessError, Iterable java.lang.Iterable, Runnable java.lang.Runnable, CloneNotSupportedException java.lang.CloneNotSupportedException, NoClassDefFoundError java.lang.NoClassDefFoundError, System java.lang.System, NumberFormatException java.lang.NumberFormatException, Throwable java.lang.Throwable, IllegalThreadStateException java.lang.IllegalThreadStateException, NoSuchMethodException java.lang.NoSuchMethodException, Deprecated java.lang.Deprecated, VirtualMachineError java.lang.VirtualMachineError, ArrayIndexOutOfBoundsException java.lang.ArrayIndexOutOfBoundsException, ClassNotFoundException java.lang.ClassNotFoundException, InstantiationError java.lang.InstantiationError, ClassFormatError java.lang.ClassFormatError, InterruptedException java.lang.InterruptedException, UnsupportedOperationException java.lang.UnsupportedOperationException, RuntimePermission java.lang.RuntimePermission, NoSuchMethodError java.lang.NoSuchMethodError, Thread java.lang.Thread, StringBuffer java.lang.StringBuffer, Package java.lang.Package, IncompatibleClassChangeError java.lang.IncompatibleClassChangeError, UnsatisfiedLinkError java.lang.UnsatisfiedLinkError, NegativeArraySizeException java.lang.NegativeArraySizeException, Readable java.lang.Readable, Boolean java.lang.Boolean, BigInteger java.math.BigInteger, ClassCastException java.lang.ClassCastException, IndexOutOfBoundsException java.lang.IndexOutOfBoundsException, Math java.lang.Math, Thread$UncaughtExceptionHandler java.lang.Thread$UncaughtExceptionHandler, Comparable java.lang.Comparable, Thread$State java.lang.Thread$State, SecurityException java.lang.SecurityException, Integer java.lang.Integer, Short java.lang.Short, StackTraceElement java.lang.StackTraceElement, ExceptionInInitializerError java.lang.ExceptionInInitializerError, Number java.lang.Number, TypeNotPresentException java.lang.TypeNotPresentException, NoSuchFieldError java.lang.NoSuchFieldError, Character java.lang.Character, UnsupportedClassVersionError java.lang.UnsupportedClassVersionError, Exception java.lang.Exception, InstantiationException java.lang.InstantiationException, ProcessBuilder java.lang.ProcessBuilder, BigDecimal java.math.BigDecimal, IllegalAccessException java.lang.IllegalAccessException, Float java.lang.Float, CharSequence java.lang.CharSequence, SecurityManager java.lang.SecurityManager, StringBuilder java.lang.StringBuilder, OutOfMemoryError java.lang.OutOfMemoryError, IllegalMonitorStateException java.lang.IllegalMonitorStateException, ThreadLocal java.lang.ThreadLocal, ArithmeticException java.lang.ArithmeticException, Long java.lang.Long, IllegalStateException java.lang.IllegalStateException, Compiler clojure.lang.Compiler, RuntimeException java.lang.RuntimeException, SuppressWarnings java.lang.SuppressWarnings, Appendable java.lang.Appendable, AssertionError java.lang.AssertionError, Byte java.lang.Byte})

  