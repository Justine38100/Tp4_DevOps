/* $$ This file has been instrumented by Clover 4.4.0#2019092621413129 $$ */package datastruct;

import java.util.Arrays;

public class MyUnsortedList<E> implements UnsortedList<E> {public static class __CLR4_4_0bbm7bqpsk9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_0();if(2019092621413129L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.0#2019092621413129,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004a\u0075\u0073\u0074\u0069\u006e\u0065\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0046\u0061\u0063\u005c\u005c\u004d\u0031\u005f\u0049\u004e\u0046\u004f\u005c\u005c\u0053\u0032\u005c\u005c\u0044\u0065\u0076\u004f\u0070\u0073\u005c\u005c\u0054\u0050\u005c\u005c\u0054\u0050\u0033\u005c\u005c\u0075\u006e\u0073\u006f\u0072\u0074\u0065\u0064\u005f\u006c\u0069\u0073\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1739959087737L,8589935092L,128,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class Link<E> {
        final E element;
        Link<E> next;

        private Link(E element) {try{__CLR4_4_0bbm7bqpsk9.R.inc(11);
            __CLR4_4_0bbm7bqpsk9.R.inc(12);this.element = element;
        }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}
    }

    private Link<E> head;
    private int size;

    private MyUnsortedList() {try{__CLR4_4_0bbm7bqpsk9.R.inc(13);
        __CLR4_4_0bbm7bqpsk9.R.inc(14);this.head = null;
        __CLR4_4_0bbm7bqpsk9.R.inc(15);this.size = 0;
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}

    @SafeVarargs
    public static <E> MyUnsortedList<E> of(E... elements) {try{__CLR4_4_0bbm7bqpsk9.R.inc(16);
        __CLR4_4_0bbm7bqpsk9.R.inc(17);return of(Arrays.asList(elements));
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}

    public static <E> MyUnsortedList<E> of(Iterable<E> elements) {try{__CLR4_4_0bbm7bqpsk9.R.inc(18);
        __CLR4_4_0bbm7bqpsk9.R.inc(19);MyUnsortedList<E> list = new MyUnsortedList<>();
        __CLR4_4_0bbm7bqpsk9.R.inc(20);for (E element : elements) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(21);list.append(element);
        }
        }__CLR4_4_0bbm7bqpsk9.R.inc(22);return list;
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}

    @Override
    public boolean isEmpty() {try{__CLR4_4_0bbm7bqpsk9.R.inc(23);
        __CLR4_4_0bbm7bqpsk9.R.inc(24);return size == 0;
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_4_0bbm7bqpsk9.R.inc(25);
        __CLR4_4_0bbm7bqpsk9.R.inc(26);return size;
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}

    @Override
    public void prepend(E element) {try{__CLR4_4_0bbm7bqpsk9.R.inc(27);
        __CLR4_4_0bbm7bqpsk9.R.inc(28);size++;
        __CLR4_4_0bbm7bqpsk9.R.inc(29);Link<E> newHead = new Link<>(element);
        __CLR4_4_0bbm7bqpsk9.R.inc(30);newHead.next = head;
        __CLR4_4_0bbm7bqpsk9.R.inc(31);head = newHead;
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}

    @Override
    public void append(E element) {try{__CLR4_4_0bbm7bqpsk9.R.inc(32);
        __CLR4_4_0bbm7bqpsk9.R.inc(33);if ((((element == null)&&(__CLR4_4_0bbm7bqpsk9.R.iget(34)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(35)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(36);throw new NullPointerException("L'\u00e9l\u00e9ment ne peut pas \u00eatre null");
        }
        }__CLR4_4_0bbm7bqpsk9.R.inc(37);insert(element, size);
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}

    @Override
    public void insert(E elem, int pos) throws IndexOutOfBoundsException {try{__CLR4_4_0bbm7bqpsk9.R.inc(38);
        __CLR4_4_0bbm7bqpsk9.R.inc(39);if ((((pos < 0 || pos > size)&&(__CLR4_4_0bbm7bqpsk9.R.iget(40)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(41)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(42);throw new IndexOutOfBoundsException();
        }
        }__CLR4_4_0bbm7bqpsk9.R.inc(43);if ((((pos == 0)&&(__CLR4_4_0bbm7bqpsk9.R.iget(44)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(45)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(46);prepend(elem);
            __CLR4_4_0bbm7bqpsk9.R.inc(47);return;
        }

        }__CLR4_4_0bbm7bqpsk9.R.inc(48);Link<E> prevLink = head;
        __CLR4_4_0bbm7bqpsk9.R.inc(49);while ((((pos-- > 1)&&(__CLR4_4_0bbm7bqpsk9.R.iget(50)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(51)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(52);prevLink = prevLink.next;
        }

        }__CLR4_4_0bbm7bqpsk9.R.inc(53);size++;
        __CLR4_4_0bbm7bqpsk9.R.inc(54);Link<E> inserted = new Link<>(elem);
        __CLR4_4_0bbm7bqpsk9.R.inc(55);Link<E> nextLink = prevLink.next;
        __CLR4_4_0bbm7bqpsk9.R.inc(56);prevLink.next = inserted;
        __CLR4_4_0bbm7bqpsk9.R.inc(57);inserted.next = nextLink;
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}

    @Override
    public E pop() {try{__CLR4_4_0bbm7bqpsk9.R.inc(58);
        __CLR4_4_0bbm7bqpsk9.R.inc(59);if ((((isEmpty())&&(__CLR4_4_0bbm7bqpsk9.R.iget(60)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(61)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(62);throw new EmptyListException();
        }

        }__CLR4_4_0bbm7bqpsk9.R.inc(63);size--;
        __CLR4_4_0bbm7bqpsk9.R.inc(64);Link<E> oldHead = head;
        __CLR4_4_0bbm7bqpsk9.R.inc(65);head = oldHead.next;

        __CLR4_4_0bbm7bqpsk9.R.inc(66);return oldHead.element;
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}

    @Override
    public E popLast() {try{__CLR4_4_0bbm7bqpsk9.R.inc(67);
        __CLR4_4_0bbm7bqpsk9.R.inc(68);if ((((isEmpty())&&(__CLR4_4_0bbm7bqpsk9.R.iget(69)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(70)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(71);throw new EmptyListException("La liste est vide, impossible de retirer le dernier \u00e9l\u00e9ment.");
        }
        }__CLR4_4_0bbm7bqpsk9.R.inc(72);return remove(size - 1);  // Si la liste n'est pas vide, on supprime le dernier \u00e9l\u00e9ment
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}
    

    @Override
    public E remove(int pos) throws IndexOutOfBoundsException {try{__CLR4_4_0bbm7bqpsk9.R.inc(73);
        __CLR4_4_0bbm7bqpsk9.R.inc(74);if ((((pos < 0 || pos >= size)&&(__CLR4_4_0bbm7bqpsk9.R.iget(75)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(76)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(77);throw new IndexOutOfBoundsException();
        }
        }__CLR4_4_0bbm7bqpsk9.R.inc(78);if ((((pos == 0)&&(__CLR4_4_0bbm7bqpsk9.R.iget(79)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(80)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(81);return pop();
        }
    
        }__CLR4_4_0bbm7bqpsk9.R.inc(82);Link<E> prevLink = head;
        __CLR4_4_0bbm7bqpsk9.R.inc(83);while ((((--pos > 0)&&(__CLR4_4_0bbm7bqpsk9.R.iget(84)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(85)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(86);prevLink = prevLink.next;
        }
    
        }__CLR4_4_0bbm7bqpsk9.R.inc(87);Link<E> removed = prevLink.next;
        __CLR4_4_0bbm7bqpsk9.R.inc(88);prevLink.next = removed.next;
    
        __CLR4_4_0bbm7bqpsk9.R.inc(89);size--;  // D\u00e9cr\u00e9menter la taille de la liste apr\u00e8s la suppression.
    
        __CLR4_4_0bbm7bqpsk9.R.inc(90);return removed.element;
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}
    

    @Override
    public boolean equals(Object obj) {try{__CLR4_4_0bbm7bqpsk9.R.inc(91);
        __CLR4_4_0bbm7bqpsk9.R.inc(92);if ((((!(obj instanceof MyUnsortedList))&&(__CLR4_4_0bbm7bqpsk9.R.iget(93)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(94)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(95);return false;
        }

        }__CLR4_4_0bbm7bqpsk9.R.inc(96);@SuppressWarnings("unchecked")
        MyUnsortedList<E> that = (MyUnsortedList<E>) obj;
        __CLR4_4_0bbm7bqpsk9.R.inc(97);if ((((this.size != that.size)&&(__CLR4_4_0bbm7bqpsk9.R.iget(98)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(99)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(100);return false;
        }

        }__CLR4_4_0bbm7bqpsk9.R.inc(101);Link<E> thisLink = this.head;
        __CLR4_4_0bbm7bqpsk9.R.inc(102);Link<E> thatLink = that.head;
        __CLR4_4_0bbm7bqpsk9.R.inc(103);while ((((thisLink != null)&&(__CLR4_4_0bbm7bqpsk9.R.iget(104)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(105)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(106);if ((((thatLink == null || !thisLink.element.equals(thatLink.element))&&(__CLR4_4_0bbm7bqpsk9.R.iget(107)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(108)==0&false))) {{
                __CLR4_4_0bbm7bqpsk9.R.inc(109);return false;
            }
            }__CLR4_4_0bbm7bqpsk9.R.inc(110);thisLink = thisLink.next;
            __CLR4_4_0bbm7bqpsk9.R.inc(111);thatLink = thatLink.next;
        }

        }__CLR4_4_0bbm7bqpsk9.R.inc(112);return thatLink == null;
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_0bbm7bqpsk9.R.inc(113);
        __CLR4_4_0bbm7bqpsk9.R.inc(114);StringBuilder builder = new StringBuilder("MyUnsortedList { size = ");
        __CLR4_4_0bbm7bqpsk9.R.inc(115);builder.append(size);
        __CLR4_4_0bbm7bqpsk9.R.inc(116);builder.append(", [");

        __CLR4_4_0bbm7bqpsk9.R.inc(117);MyUnsortedList.Link<E> link = head;
        __CLR4_4_0bbm7bqpsk9.R.inc(118);while ((((link != null)&&(__CLR4_4_0bbm7bqpsk9.R.iget(119)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(120)==0&false))) {{
            __CLR4_4_0bbm7bqpsk9.R.inc(121);builder.append(link.element);
            __CLR4_4_0bbm7bqpsk9.R.inc(122);link = link.next;
            __CLR4_4_0bbm7bqpsk9.R.inc(123);if ((((link != null)&&(__CLR4_4_0bbm7bqpsk9.R.iget(124)!=0|true))||(__CLR4_4_0bbm7bqpsk9.R.iget(125)==0&false))) {{
                __CLR4_4_0bbm7bqpsk9.R.inc(126);builder.append(", ");
            }
        }}

        }__CLR4_4_0bbm7bqpsk9.R.inc(127);return builder.append("] }").toString();
    }finally{__CLR4_4_0bbm7bqpsk9.R.flushNeeded();}}
}
