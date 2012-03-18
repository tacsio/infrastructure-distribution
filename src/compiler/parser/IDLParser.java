package compiler.parser;

// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/tarcisio/Desktop/IDL/IDL.g 2010-10-19 18:21:59

import org.antlr.runtime.BitSet;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

public class IDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "T_PUBLIC", "T_INTEFACE", "T_INT", "T_BOOLEAN", "T_STRING", "T_BYTE", "T_CHAR", "T_FLOAT", "T_DOUBLE", "T_VOID", "T_LCHAVE", "T_RCHAVE", "T_PONTOVIRG", "T_VIRGULA", "T_LPAREN", "T_RPAREN", "INTERFACE", "METODO", "LIST_PARAM", "PARAM", "ID", "INT", "EXPONENT", "FLOAT", "COMMENT", "WS", "ESC_SEQ", "STRING", "CHAR", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC"
    };
    public static final int T_PUBLIC=4;
    public static final int EXPONENT=26;
    public static final int T_PONTOVIRG=16;
    public static final int T_INTEFACE=5;
    public static final int T_BYTE=9;
    public static final int T_STRING=8;
    public static final int T_LPAREN=18;
    public static final int UNICODE_ESC=34;
    public static final int T_LCHAVE=14;
    public static final int OCTAL_ESC=35;
    public static final int CHAR=32;
    public static final int T_FLOAT=11;
    public static final int HEX_DIGIT=33;
    public static final int T_DOUBLE=12;
    public static final int T_RCHAVE=15;
    public static final int PARAM=23;
    public static final int FLOAT=27;
    public static final int INT=25;
    public static final int ID=24;
    public static final int EOF=-1;
    public static final int T_VOID=13;
    public static final int T_RPAREN=19;
    public static final int T_VIRGULA=17;
    public static final int T_BOOLEAN=7;
    public static final int ESC_SEQ=30;
    public static final int WS=29;
    public static final int METODO=21;
    public static final int T_CHAR=10;
    public static final int T_INT=6;
    public static final int INTERFACE=20;
    public static final int COMMENT=28;
    public static final int STRING=31;
    public static final int LIST_PARAM=22;

    // delegates
    // delegators


        public IDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return IDLParser.tokenNames; }
    public String getGrammarFileName() { return "/home/tarcisio/Desktop/IDL/IDL.g"; }


    public static class interface__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interface_"
    // /home/tarcisio/Desktop/IDL/IDL.g:36:1: interface_ : T_PUBLIC T_INTEFACE ID T_LCHAVE methods T_RCHAVE -> ^( INTERFACE methods ) ;
    @SuppressWarnings("unused")
	public final IDLParser.interface__return interface_() throws RecognitionException {
        IDLParser.interface__return retval = new IDLParser.interface__return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token T_PUBLIC1=null;
        Token T_INTEFACE2=null;
        Token ID3=null;
        Token T_LCHAVE4=null;
        Token T_RCHAVE6=null;
        IDLParser.methods_return methods5 = null;


        CommonTree T_PUBLIC1_tree=null;
        CommonTree T_INTEFACE2_tree=null;
        CommonTree ID3_tree=null;
        CommonTree T_LCHAVE4_tree=null;
        CommonTree T_RCHAVE6_tree=null;
        RewriteRuleTokenStream stream_T_PUBLIC=new RewriteRuleTokenStream(adaptor,"token T_PUBLIC");
        RewriteRuleTokenStream stream_T_RCHAVE=new RewriteRuleTokenStream(adaptor,"token T_RCHAVE");
        RewriteRuleTokenStream stream_T_INTEFACE=new RewriteRuleTokenStream(adaptor,"token T_INTEFACE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_T_LCHAVE=new RewriteRuleTokenStream(adaptor,"token T_LCHAVE");
        RewriteRuleSubtreeStream stream_methods=new RewriteRuleSubtreeStream(adaptor,"rule methods");
        try {
            // /home/tarcisio/Desktop/IDL/IDL.g:37:2: ( T_PUBLIC T_INTEFACE ID T_LCHAVE methods T_RCHAVE -> ^( INTERFACE methods ) )
            // /home/tarcisio/Desktop/IDL/IDL.g:37:5: T_PUBLIC T_INTEFACE ID T_LCHAVE methods T_RCHAVE
            {
            T_PUBLIC1=(Token)match(input,T_PUBLIC,FOLLOW_T_PUBLIC_in_interface_168);  
            stream_T_PUBLIC.add(T_PUBLIC1);

            T_INTEFACE2=(Token)match(input,T_INTEFACE,FOLLOW_T_INTEFACE_in_interface_170);  
            stream_T_INTEFACE.add(T_INTEFACE2);

            ID3=(Token)match(input,ID,FOLLOW_ID_in_interface_172);  
            stream_ID.add(ID3);

            T_LCHAVE4=(Token)match(input,T_LCHAVE,FOLLOW_T_LCHAVE_in_interface_174);  
            stream_T_LCHAVE.add(T_LCHAVE4);

            pushFollow(FOLLOW_methods_in_interface_179);
            methods5=methods();

            state._fsp--;

            stream_methods.add(methods5.getTree());
            T_RCHAVE6=(Token)match(input,T_RCHAVE,FOLLOW_T_RCHAVE_in_interface_184);  
            stream_T_RCHAVE.add(T_RCHAVE6);



            // AST REWRITE
            // elements: methods
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 41:2: -> ^( INTERFACE methods )
            {
                // /home/tarcisio/Desktop/IDL/IDL.g:41:4: ^( INTERFACE methods )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INTERFACE, "INTERFACE"), root_1);

                adaptor.addChild(root_1, stream_methods.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interface_"

    public static class methods_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methods"
    // /home/tarcisio/Desktop/IDL/IDL.g:45:1: methods : ( method )* ;
    public final IDLParser.methods_return methods() throws RecognitionException {
        IDLParser.methods_return retval = new IDLParser.methods_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        IDLParser.method_return method7 = null;



        try {
            // /home/tarcisio/Desktop/IDL/IDL.g:46:2: ( ( method )* )
            // /home/tarcisio/Desktop/IDL/IDL.g:46:4: ( method )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/tarcisio/Desktop/IDL/IDL.g:46:4: ( method )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==T_PUBLIC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/tarcisio/Desktop/IDL/IDL.g:46:4: method
            	    {
            	    pushFollow(FOLLOW_method_in_methods211);
            	    method7=method();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method7.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methods"

    public static class method_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method"
    // /home/tarcisio/Desktop/IDL/IDL.g:49:1: method : T_PUBLIC type ID T_LPAREN ( params )? T_RPAREN T_PONTOVIRG -> ^( METODO ^( ID ) ^( type ) ( ^( LIST_PARAM params ) )? ) ;
    @SuppressWarnings("unused")
	public final IDLParser.method_return method() throws RecognitionException {
        IDLParser.method_return retval = new IDLParser.method_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token T_PUBLIC8=null;
        Token ID10=null;
        Token T_LPAREN11=null;
        Token T_RPAREN13=null;
        Token T_PONTOVIRG14=null;
        IDLParser.type_return type9 = null;

        IDLParser.params_return params12 = null;


        CommonTree T_PUBLIC8_tree=null;
        CommonTree ID10_tree=null;
        CommonTree T_LPAREN11_tree=null;
        CommonTree T_RPAREN13_tree=null;
        CommonTree T_PONTOVIRG14_tree=null;
        RewriteRuleTokenStream stream_T_PUBLIC=new RewriteRuleTokenStream(adaptor,"token T_PUBLIC");
        RewriteRuleTokenStream stream_T_PONTOVIRG=new RewriteRuleTokenStream(adaptor,"token T_PONTOVIRG");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_T_LPAREN=new RewriteRuleTokenStream(adaptor,"token T_LPAREN");
        RewriteRuleTokenStream stream_T_RPAREN=new RewriteRuleTokenStream(adaptor,"token T_RPAREN");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/tarcisio/Desktop/IDL/IDL.g:50:2: ( T_PUBLIC type ID T_LPAREN ( params )? T_RPAREN T_PONTOVIRG -> ^( METODO ^( ID ) ^( type ) ( ^( LIST_PARAM params ) )? ) )
            // /home/tarcisio/Desktop/IDL/IDL.g:50:4: T_PUBLIC type ID T_LPAREN ( params )? T_RPAREN T_PONTOVIRG
            {
            T_PUBLIC8=(Token)match(input,T_PUBLIC,FOLLOW_T_PUBLIC_in_method224);  
            stream_T_PUBLIC.add(T_PUBLIC8);

            pushFollow(FOLLOW_type_in_method226);
            type9=type();

            state._fsp--;

            stream_type.add(type9.getTree());
            ID10=(Token)match(input,ID,FOLLOW_ID_in_method228);  
            stream_ID.add(ID10);

            T_LPAREN11=(Token)match(input,T_LPAREN,FOLLOW_T_LPAREN_in_method230);  
            stream_T_LPAREN.add(T_LPAREN11);

            // /home/tarcisio/Desktop/IDL/IDL.g:50:30: ( params )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=T_INT && LA2_0<=T_VOID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:50:30: params
                    {
                    pushFollow(FOLLOW_params_in_method232);
                    params12=params();

                    state._fsp--;

                    stream_params.add(params12.getTree());

                    }
                    break;

            }

            T_RPAREN13=(Token)match(input,T_RPAREN,FOLLOW_T_RPAREN_in_method235);  
            stream_T_RPAREN.add(T_RPAREN13);

            T_PONTOVIRG14=(Token)match(input,T_PONTOVIRG,FOLLOW_T_PONTOVIRG_in_method237);  
            stream_T_PONTOVIRG.add(T_PONTOVIRG14);



            // AST REWRITE
            // elements: params, ID, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 53:2: -> ^( METODO ^( ID ) ^( type ) ( ^( LIST_PARAM params ) )? )
            {
                // /home/tarcisio/Desktop/IDL/IDL.g:53:4: ^( METODO ^( ID ) ^( type ) ( ^( LIST_PARAM params ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METODO, "METODO"), root_1);

                // /home/tarcisio/Desktop/IDL/IDL.g:54:2: ^( ID )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // /home/tarcisio/Desktop/IDL/IDL.g:55:2: ^( type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_type.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // /home/tarcisio/Desktop/IDL/IDL.g:56:2: ( ^( LIST_PARAM params ) )?
                if ( stream_params.hasNext() ) {
                    // /home/tarcisio/Desktop/IDL/IDL.g:56:2: ^( LIST_PARAM params )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_PARAM, "LIST_PARAM"), root_2);

                    adaptor.addChild(root_2, stream_params.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_params.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method"

    public static class params_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // /home/tarcisio/Desktop/IDL/IDL.g:60:1: params : param ( T_VIRGULA param )* -> ( ^( PARAM param ) )* ;
    @SuppressWarnings("unused")
	public final IDLParser.params_return params() throws RecognitionException {
        IDLParser.params_return retval = new IDLParser.params_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token T_VIRGULA16=null;
        IDLParser.param_return param15 = null;

        IDLParser.param_return param17 = null;


        CommonTree T_VIRGULA16_tree=null;
        RewriteRuleTokenStream stream_T_VIRGULA=new RewriteRuleTokenStream(adaptor,"token T_VIRGULA");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            // /home/tarcisio/Desktop/IDL/IDL.g:61:2: ( param ( T_VIRGULA param )* -> ( ^( PARAM param ) )* )
            // /home/tarcisio/Desktop/IDL/IDL.g:61:4: param ( T_VIRGULA param )*
            {
            pushFollow(FOLLOW_param_in_params277);
            param15=param();

            state._fsp--;

            stream_param.add(param15.getTree());
            // /home/tarcisio/Desktop/IDL/IDL.g:61:10: ( T_VIRGULA param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==T_VIRGULA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/tarcisio/Desktop/IDL/IDL.g:61:11: T_VIRGULA param
            	    {
            	    T_VIRGULA16=(Token)match(input,T_VIRGULA,FOLLOW_T_VIRGULA_in_params280);  
            	    stream_T_VIRGULA.add(T_VIRGULA16);

            	    pushFollow(FOLLOW_param_in_params282);
            	    param17=param();

            	    state._fsp--;

            	    stream_param.add(param17.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);



            // AST REWRITE
            // elements: param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 64:2: -> ( ^( PARAM param ) )*
            {
                // /home/tarcisio/Desktop/IDL/IDL.g:64:4: ( ^( PARAM param ) )*
                while ( stream_param.hasNext() ) {
                    // /home/tarcisio/Desktop/IDL/IDL.g:64:4: ^( PARAM param )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);

                    adaptor.addChild(root_1, stream_param.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_param.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "params"

    public static class param_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // /home/tarcisio/Desktop/IDL/IDL.g:67:1: param : type ID -> ^( type ) ^( ID ) ;
    @SuppressWarnings("unused")
	public final IDLParser.param_return param() throws RecognitionException {
        IDLParser.param_return retval = new IDLParser.param_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID19=null;
        IDLParser.type_return type18 = null;


        CommonTree ID19_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/tarcisio/Desktop/IDL/IDL.g:68:2: ( type ID -> ^( type ) ^( ID ) )
            // /home/tarcisio/Desktop/IDL/IDL.g:68:4: type ID
            {
            pushFollow(FOLLOW_type_in_param309);
            type18=type();

            state._fsp--;

            stream_type.add(type18.getTree());
            ID19=(Token)match(input,ID,FOLLOW_ID_in_param311);  
            stream_ID.add(ID19);



            // AST REWRITE
            // elements: type, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 71:2: -> ^( type ) ^( ID )
            {
                // /home/tarcisio/Desktop/IDL/IDL.g:71:5: ^( type )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_type.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }
                // /home/tarcisio/Desktop/IDL/IDL.g:72:3: ^( ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/tarcisio/Desktop/IDL/IDL.g:75:1: type : ( T_INT | T_STRING | T_BOOLEAN | T_BYTE | T_CHAR | T_FLOAT | T_DOUBLE | T_VOID );
    @SuppressWarnings("unused")
	public final IDLParser.type_return type() throws RecognitionException {
        IDLParser.type_return retval = new IDLParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set20=null;

        CommonTree set20_tree=null;

        try {
            // /home/tarcisio/Desktop/IDL/IDL.g:76:2: ( T_INT | T_STRING | T_BOOLEAN | T_BYTE | T_CHAR | T_FLOAT | T_DOUBLE | T_VOID )
            // /home/tarcisio/Desktop/IDL/IDL.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set20=(Token)input.LT(1);
            if ( (input.LA(1)>=T_INT && input.LA(1)<=T_VOID) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set20));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_T_PUBLIC_in_interface_168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_T_INTEFACE_in_interface_170 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_interface_172 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_T_LCHAVE_in_interface_174 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_methods_in_interface_179 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_T_RCHAVE_in_interface_184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_methods211 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_T_PUBLIC_in_method224 = new BitSet(new long[]{0x0000000000003FC0L});
    public static final BitSet FOLLOW_type_in_method226 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_method228 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_T_LPAREN_in_method230 = new BitSet(new long[]{0x0000000000083FC0L});
    public static final BitSet FOLLOW_params_in_method232 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_T_RPAREN_in_method235 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_T_PONTOVIRG_in_method237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_params277 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_T_VIRGULA_in_params280 = new BitSet(new long[]{0x0000000000003FC0L});
    public static final BitSet FOLLOW_param_in_params282 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_type_in_param309 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_param311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});

}