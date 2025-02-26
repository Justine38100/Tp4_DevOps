/* $$ This file has been instrumented by Clover 4.4.0#2019092621413129 $$ */package datastruct;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyUnsortedListTest {static class __CLR4_4_03k3km7bqpsna{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_0();if(2019092621413129L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.0#2019092621413129,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004a\u0075\u0073\u0074\u0069\u006e\u0065\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0046\u0061\u0063\u005c\u005c\u004d\u0031\u005f\u0049\u004e\u0046\u004f\u005c\u005c\u0053\u0032\u005c\u005c\u0044\u0065\u0076\u004f\u0070\u0073\u005c\u005c\u0054\u0050\u005c\u005c\u0054\u0050\u0033\u005c\u005c\u0075\u006e\u0073\u006f\u0072\u0074\u0065\u0064\u005f\u006c\u0069\u0073\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1739959087903L,8589935092L,212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // On test la suppression et l'ajout d'\u00e9l\u00e9ments
    @Test
    void testPopSurListeVide() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_02gxqn3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testPopSurListeVide",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_02gxqn3k(){try{__CLR4_4_03k3km7bqpsna.R.inc(128);
        __CLR4_4_03k3km7bqpsna.R.inc(129);UnsortedList<Integer> list = MyUnsortedList.of();
        __CLR4_4_03k3km7bqpsna.R.inc(130);assertThrows(EmptyListException.class, () -> list.pop());  // V\u00e9rifie que pop() \u00e9choue sur une liste vide
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    // D\u00e9tection d'une erreur
    @Test
    void testPopLastSurListeVide() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0mxf89z3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testPopLastSurListeVide",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0mxf89z3n(){try{__CLR4_4_03k3km7bqpsna.R.inc(131);
        __CLR4_4_03k3km7bqpsna.R.inc(132);UnsortedList<Integer> list = MyUnsortedList.of();
        __CLR4_4_03k3km7bqpsna.R.inc(133);assertThrows(EmptyListException.class, () -> list.popLast());  // V\u00e9rifie que popLast() \u00e9choue sur une liste vide
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    @Test
    void testRemoveAvecIndiceInvalide() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0a5ox63q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testRemoveAvecIndiceInvalide",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0a5ox63q(){try{__CLR4_4_03k3km7bqpsna.R.inc(134);
        __CLR4_4_03k3km7bqpsna.R.inc(135);UnsortedList<Integer> list = MyUnsortedList.of(1, 2, 3);
        __CLR4_4_03k3km7bqpsna.R.inc(136);assertThrows(IndexOutOfBoundsException.class, () -> list.remove(5));  // V\u00e9rifie que remove() \u00e9choue sur un index hors limites
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    @Test
    void testPrependEtAppend() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0v2utqk3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testPrependEtAppend",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0v2utqk3t(){try{__CLR4_4_03k3km7bqpsna.R.inc(137);
        __CLR4_4_03k3km7bqpsna.R.inc(138);UnsortedList<Integer> list = MyUnsortedList.of();
        __CLR4_4_03k3km7bqpsna.R.inc(139);list.prepend(1);
        __CLR4_4_03k3km7bqpsna.R.inc(140);list.append(2);
        __CLR4_4_03k3km7bqpsna.R.inc(141);list.append(3);

        __CLR4_4_03k3km7bqpsna.R.inc(142);assertEquals(3, list.size());  // La taille doit \u00eatre 3
        __CLR4_4_03k3km7bqpsna.R.inc(143);assertEquals(1, list.pop());   // Le premier \u00e9l\u00e9ment doit \u00eatre 1
        __CLR4_4_03k3km7bqpsna.R.inc(144);assertEquals(2, list.pop());   // Le deuxi\u00e8me \u00e9l\u00e9ment doit \u00eatre 2
        __CLR4_4_03k3km7bqpsna.R.inc(145);assertEquals(3, list.pop());   // Le dernier \u00e9l\u00e9ment doit \u00eatre 3
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    // On test l'insertion d'un \u00e9l\u00e9ment avec des indices valides et invalides
    @Test
    void testInsererAPositionValide() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0n2tlus42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testInsererAPositionValide",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0n2tlus42(){try{__CLR4_4_03k3km7bqpsna.R.inc(146);
        __CLR4_4_03k3km7bqpsna.R.inc(147);UnsortedList<Integer> list = MyUnsortedList.of(1,2,3);
        __CLR4_4_03k3km7bqpsna.R.inc(148);list.insert(4,1);
        __CLR4_4_03k3km7bqpsna.R.inc(149);assertEquals(4, list.remove(1)); // On v\u00e9rifie qu'on a bien ajout\u00e9 4 en t\u00eate de liste (position 1)
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    @Test
    void testInsererAPositionInvalide() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0r2z35546();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testInsererAPositionInvalide",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0r2z35546(){try{__CLR4_4_03k3km7bqpsna.R.inc(150);
        __CLR4_4_03k3km7bqpsna.R.inc(151);UnsortedList<Integer> list = MyUnsortedList.of(1,2,3);
        __CLR4_4_03k3km7bqpsna.R.inc(152);assertThrows(IndexOutOfBoundsException.class, () ->list.insert(4,-1)); // On v\u00e9rifie qu'ins\u00e9rer un \u00e9l\u00e9ment \u00e0 une position non valide l\u00e8ve une exception
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    // On test la fonctionnalit\u00e9 d'\u00e9galit\u00e9 entre les listes
    @Test
    void testEgaliteAvecListesIdentiques() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0myimfo49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testEgaliteAvecListesIdentiques",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0myimfo49(){try{__CLR4_4_03k3km7bqpsna.R.inc(153);
        __CLR4_4_03k3km7bqpsna.R.inc(154);UnsortedList<Integer> liste1 = MyUnsortedList.of(1, 2, 3);
        __CLR4_4_03k3km7bqpsna.R.inc(155);UnsortedList<Integer> liste2 = MyUnsortedList.of(1, 2, 3);
        __CLR4_4_03k3km7bqpsna.R.inc(156);assertTrue(liste1.equals(liste2));  // V\u00e9rifie que les deux listes sont \u00e9gales
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    @Test
    void testEgaliteAvecListesDifferent() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_08ag64d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testEgaliteAvecListesDifferent",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_08ag64d(){try{__CLR4_4_03k3km7bqpsna.R.inc(157);
        __CLR4_4_03k3km7bqpsna.R.inc(158);UnsortedList<Integer> liste1 = MyUnsortedList.of(1, 2, 3);
        __CLR4_4_03k3km7bqpsna.R.inc(159);UnsortedList<Integer> liste2 = MyUnsortedList.of(3, 2, 1);
        __CLR4_4_03k3km7bqpsna.R.inc(160);assertFalse(liste1.equals(liste2));  // V\u00e9rifie que les deux listes sont diff\u00e9rentes
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    @Test
    void testEgaliteAvecListesDeTailleDifferent() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0rzbpt04h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testEgaliteAvecListesDeTailleDifferent",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0rzbpt04h(){try{__CLR4_4_03k3km7bqpsna.R.inc(161);
        __CLR4_4_03k3km7bqpsna.R.inc(162);UnsortedList<Integer> liste1 = MyUnsortedList.of(1, 2, 3);
        __CLR4_4_03k3km7bqpsna.R.inc(163);UnsortedList<Integer> liste2 = MyUnsortedList.of(1, 2);
        __CLR4_4_03k3km7bqpsna.R.inc(164);assertFalse(liste1.equals(liste2));  // V\u00e9rifie que les listes de tailles diff\u00e9rentes ne sont pas \u00e9gales
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    // On test la fonctionnalit\u00e9 toString
    @Test
    void testToString() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0hrxdid4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testToString",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0hrxdid4l(){try{__CLR4_4_03k3km7bqpsna.R.inc(165);
        __CLR4_4_03k3km7bqpsna.R.inc(166);UnsortedList<Integer> emptyList = MyUnsortedList.of();
        __CLR4_4_03k3km7bqpsna.R.inc(167);assertEquals("MyUnsortedList { size = 0, [] }", emptyList.toString());
    
        __CLR4_4_03k3km7bqpsna.R.inc(168);UnsortedList<Integer> oneElementList = MyUnsortedList.of(1);
        __CLR4_4_03k3km7bqpsna.R.inc(169);assertEquals("MyUnsortedList { size = 1, [1] }", oneElementList.toString());
    
        __CLR4_4_03k3km7bqpsna.R.inc(170);UnsortedList<Integer> multiElementList = MyUnsortedList.of(1, 2, 3);
        __CLR4_4_03k3km7bqpsna.R.inc(171);assertEquals("MyUnsortedList { size = 3, [1, 2, 3] }", multiElementList.toString());
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    @Test
    void testListeAvecUnSeulElement() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0n8ap9j4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testListeAvecUnSeulElement",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0n8ap9j4s(){try{__CLR4_4_03k3km7bqpsna.R.inc(172);
        __CLR4_4_03k3km7bqpsna.R.inc(173);UnsortedList<Integer> liste = MyUnsortedList.of(1);
        __CLR4_4_03k3km7bqpsna.R.inc(174);assertEquals(1, liste.size());  // La taille doit \u00eatre 1
        __CLR4_4_03k3km7bqpsna.R.inc(175);assertEquals(1, liste.pop());   // Le seul \u00e9l\u00e9ment de la liste doit \u00eatre 1
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    @Test
    void testListeAvecElementsIdentiques() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0ze7qsv4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testListeAvecElementsIdentiques",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0ze7qsv4w(){try{__CLR4_4_03k3km7bqpsna.R.inc(176);
        __CLR4_4_03k3km7bqpsna.R.inc(177);UnsortedList<Integer> liste = MyUnsortedList.of(1, 1, 1);
        __CLR4_4_03k3km7bqpsna.R.inc(178);assertEquals(3, liste.size());  // La taille doit \u00eatre 3
        __CLR4_4_03k3km7bqpsna.R.inc(179);assertEquals(1, liste.pop());   // Le premier \u00e9l\u00e9ment doit \u00eatre 1
        __CLR4_4_03k3km7bqpsna.R.inc(180);assertEquals(1, liste.pop());   // Le deuxi\u00e8me \u00e9l\u00e9ment doit \u00eatre 1
        __CLR4_4_03k3km7bqpsna.R.inc(181);assertEquals(1, liste.pop());   // Le dernier \u00e9l\u00e9ment doit \u00eatre 1
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}
    
    // D\u00e9tection d'une erreur
    @Test
    void testAppendNull() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0xsjm5652();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testAppendNull",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0xsjm5652(){try{__CLR4_4_03k3km7bqpsna.R.inc(182);
        __CLR4_4_03k3km7bqpsna.R.inc(183);UnsortedList<Integer> list = MyUnsortedList.of(1, 2);
        __CLR4_4_03k3km7bqpsna.R.inc(184);assertThrows(NullPointerException.class, () -> list.append(null));
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    // Erreur d\u00e9tect\u00e9! -> PB: La taille ne se mettait pas \u00e0 jour!
    @Test
    void testRemoveAUnePositionSpecifique() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0i9b9gf55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testRemoveAUnePositionSpecifique",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0i9b9gf55(){try{__CLR4_4_03k3km7bqpsna.R.inc(185);
        __CLR4_4_03k3km7bqpsna.R.inc(186);UnsortedList<Integer> list = MyUnsortedList.of(1, 2, 3, 4);
        __CLR4_4_03k3km7bqpsna.R.inc(187);assertEquals(2, list.remove(1));
        __CLR4_4_03k3km7bqpsna.R.inc(188);assertEquals("MyUnsortedList { size = 3, [1, 3, 4] }", list.toString());
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}
    
    @Test
    void testInsertAUnePositionInvalide() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0i15nec59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testInsertAUnePositionInvalide",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0i15nec59(){try{__CLR4_4_03k3km7bqpsna.R.inc(189);
        __CLR4_4_03k3km7bqpsna.R.inc(190);UnsortedList<Integer> list = MyUnsortedList.of(1, 2, 3);
        __CLR4_4_03k3km7bqpsna.R.inc(191);assertThrows(IndexOutOfBoundsException.class, () -> list.insert(4, -1));
        __CLR4_4_03k3km7bqpsna.R.inc(192);assertThrows(IndexOutOfBoundsException.class, () -> list.insert(4, 4));
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}


    @Test
    void testOrderAppend() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_03bkz315d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testOrderAppend",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_03bkz315d(){try{__CLR4_4_03k3km7bqpsna.R.inc(193);
        __CLR4_4_03k3km7bqpsna.R.inc(194);UnsortedList<Integer> list = MyUnsortedList.of();
        __CLR4_4_03k3km7bqpsna.R.inc(195);list.append(1);
        __CLR4_4_03k3km7bqpsna.R.inc(196);list.append(2);
        __CLR4_4_03k3km7bqpsna.R.inc(197);list.append(3);
        __CLR4_4_03k3km7bqpsna.R.inc(198);assertEquals("MyUnsortedList { size = 3, [1, 2, 3] }", list.toString());
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    @Test
    void testOrderPrepend() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0nkjn6h5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testOrderPrepend",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0nkjn6h5j(){try{__CLR4_4_03k3km7bqpsna.R.inc(199);
        __CLR4_4_03k3km7bqpsna.R.inc(200);UnsortedList<Integer> list = MyUnsortedList.of();
        __CLR4_4_03k3km7bqpsna.R.inc(201);list.prepend(3);
        __CLR4_4_03k3km7bqpsna.R.inc(202);list.prepend(2);
        __CLR4_4_03k3km7bqpsna.R.inc(203);list.prepend(1);
        __CLR4_4_03k3km7bqpsna.R.inc(204);assertEquals("MyUnsortedList { size = 3, [1, 2, 3] }", list.toString());
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}

    // Test sur un grand nombre d'\u00e9l\u00e9ments
    @Test
    void testGrandeListe() {__CLR4_4_03k3km7bqpsna.R.globalSliceStart(getClass().getName(),205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_092nc3h5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_03k3km7bqpsna.R.rethrow($CLV_t2$);}finally{__CLR4_4_03k3km7bqpsna.R.globalSliceEnd(getClass().getName(),"datastruct.MyUnsortedListTest.testGrandeListe",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_092nc3h5p(){try{__CLR4_4_03k3km7bqpsna.R.inc(205);
        __CLR4_4_03k3km7bqpsna.R.inc(206);UnsortedList<Integer> list = MyUnsortedList.of();
        __CLR4_4_03k3km7bqpsna.R.inc(207);for (int i = 0; (((i < 100000)&&(__CLR4_4_03k3km7bqpsna.R.iget(208)!=0|true))||(__CLR4_4_03k3km7bqpsna.R.iget(209)==0&false)); i++) {{
            __CLR4_4_03k3km7bqpsna.R.inc(210);list.append(i);
        }
        }__CLR4_4_03k3km7bqpsna.R.inc(211);assertEquals(100000, list.size());
    }finally{__CLR4_4_03k3km7bqpsna.R.flushNeeded();}}
}
