/*
 * generated by Xtext 2.10.0
 */
package ac.soton.eventb.xtext.context.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class XContextGrammarAccess extends AbstractGrammarElementFinder {
	
	public class XContextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ac.soton.eventb.xtext.context.XContext.XContext");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cContextAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cCommentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cCommentAlternatives_1_0 = (Alternatives)cCommentAssignment_1.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_1_0_0 = (RuleCall)cCommentAlternatives_1_0.eContents().get(0);
		private final RuleCall cCommentSL_COMMENTTerminalRuleCall_1_0_1 = (RuleCall)cCommentAlternatives_1_0.eContents().get(1);
		private final Keyword cContextKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cExtendsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cExtendsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cExtendsContextCrossReference_4_1_0 = (CrossReference)cExtendsAssignment_4_1.eContents().get(0);
		private final RuleCall cExtendsContextIDTerminalRuleCall_4_1_0_1 = (RuleCall)cExtendsContextCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cSetsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cSetsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cSetsXCarrierSetParserRuleCall_5_1_0 = (RuleCall)cSetsAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cConstantsKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cConstantsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cConstantsXConstantParserRuleCall_6_1_0 = (RuleCall)cConstantsAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cAxiomsKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cAxiomsAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cAxiomsXAxiomParserRuleCall_7_1_0 = (RuleCall)cAxiomsAssignment_7_1.eContents().get(0);
		private final Keyword cEndKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//XContext econtext::Context:
		//	{econtext::Context} comment=(ML_COMMENT | SL_COMMENT)?
		//	'context' name=ID ('extends' extends+=[econtext::Context]+)? ('sets' sets+=XCarrierSet+)? ('constants'
		//	constants+=XConstant+)? ('axioms' axioms+=XAxiom+)?
		//	'end'
		@Override public ParserRule getRule() { return rule; }
		
		//{econtext::Context} comment=(ML_COMMENT | SL_COMMENT)? 'context' name=ID ('extends' extends+=[econtext::Context]+)?
		//('sets' sets+=XCarrierSet+)? ('constants' constants+=XConstant+)? ('axioms' axioms+=XAxiom+)? 'end'
		public Group getGroup() { return cGroup; }
		
		//{econtext::Context}
		public Action getContextAction_0() { return cContextAction_0; }
		
		//comment=(ML_COMMENT | SL_COMMENT)?
		public Assignment getCommentAssignment_1() { return cCommentAssignment_1; }
		
		//(ML_COMMENT | SL_COMMENT)
		public Alternatives getCommentAlternatives_1_0() { return cCommentAlternatives_1_0; }
		
		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_1_0_0() { return cCommentML_COMMENTTerminalRuleCall_1_0_0; }
		
		//SL_COMMENT
		public RuleCall getCommentSL_COMMENTTerminalRuleCall_1_0_1() { return cCommentSL_COMMENTTerminalRuleCall_1_0_1; }
		
		//'context'
		public Keyword getContextKeyword_2() { return cContextKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//('extends' extends+=[econtext::Context]+)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'extends'
		public Keyword getExtendsKeyword_4_0() { return cExtendsKeyword_4_0; }
		
		//extends+=[econtext::Context]+
		public Assignment getExtendsAssignment_4_1() { return cExtendsAssignment_4_1; }
		
		//[econtext::Context]
		public CrossReference getExtendsContextCrossReference_4_1_0() { return cExtendsContextCrossReference_4_1_0; }
		
		//ID
		public RuleCall getExtendsContextIDTerminalRuleCall_4_1_0_1() { return cExtendsContextIDTerminalRuleCall_4_1_0_1; }
		
		//('sets' sets+=XCarrierSet+)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'sets'
		public Keyword getSetsKeyword_5_0() { return cSetsKeyword_5_0; }
		
		//sets+=XCarrierSet+
		public Assignment getSetsAssignment_5_1() { return cSetsAssignment_5_1; }
		
		//XCarrierSet
		public RuleCall getSetsXCarrierSetParserRuleCall_5_1_0() { return cSetsXCarrierSetParserRuleCall_5_1_0; }
		
		//('constants' constants+=XConstant+)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'constants'
		public Keyword getConstantsKeyword_6_0() { return cConstantsKeyword_6_0; }
		
		//constants+=XConstant+
		public Assignment getConstantsAssignment_6_1() { return cConstantsAssignment_6_1; }
		
		//XConstant
		public RuleCall getConstantsXConstantParserRuleCall_6_1_0() { return cConstantsXConstantParserRuleCall_6_1_0; }
		
		//('axioms' axioms+=XAxiom+)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'axioms'
		public Keyword getAxiomsKeyword_7_0() { return cAxiomsKeyword_7_0; }
		
		//axioms+=XAxiom+
		public Assignment getAxiomsAssignment_7_1() { return cAxiomsAssignment_7_1; }
		
		//XAxiom
		public RuleCall getAxiomsXAxiomParserRuleCall_7_1_0() { return cAxiomsXAxiomParserRuleCall_7_1_0; }
		
		//'end'
		public Keyword getEndKeyword_8() { return cEndKeyword_8; }
	}
	public class XCarrierSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ac.soton.eventb.xtext.context.XContext.XCarrierSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCarrierSetAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cCommentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cCommentAlternatives_1_0 = (Alternatives)cCommentAssignment_1.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_1_0_0 = (RuleCall)cCommentAlternatives_1_0.eContents().get(0);
		private final RuleCall cCommentSL_COMMENTTerminalRuleCall_1_0_1 = (RuleCall)cCommentAlternatives_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//XCarrierSet econtext::CarrierSet:
		//	{econtext::CarrierSet} comment=(ML_COMMENT | SL_COMMENT)?
		//	name=ID
		@Override public ParserRule getRule() { return rule; }
		
		//{econtext::CarrierSet} comment=(ML_COMMENT | SL_COMMENT)? name=ID
		public Group getGroup() { return cGroup; }
		
		//{econtext::CarrierSet}
		public Action getCarrierSetAction_0() { return cCarrierSetAction_0; }
		
		//comment=(ML_COMMENT | SL_COMMENT)?
		public Assignment getCommentAssignment_1() { return cCommentAssignment_1; }
		
		//(ML_COMMENT | SL_COMMENT)
		public Alternatives getCommentAlternatives_1_0() { return cCommentAlternatives_1_0; }
		
		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_1_0_0() { return cCommentML_COMMENTTerminalRuleCall_1_0_0; }
		
		//SL_COMMENT
		public RuleCall getCommentSL_COMMENTTerminalRuleCall_1_0_1() { return cCommentSL_COMMENTTerminalRuleCall_1_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class XConstantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ac.soton.eventb.xtext.context.XContext.XConstant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConstantAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cCommentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cCommentAlternatives_1_0 = (Alternatives)cCommentAssignment_1.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_1_0_0 = (RuleCall)cCommentAlternatives_1_0.eContents().get(0);
		private final RuleCall cCommentSL_COMMENTTerminalRuleCall_1_0_1 = (RuleCall)cCommentAlternatives_1_0.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//XConstant econtext::Constant:
		//	{econtext::Constant} comment=(ML_COMMENT | SL_COMMENT)?
		//	name=ID
		@Override public ParserRule getRule() { return rule; }
		
		//{econtext::Constant} comment=(ML_COMMENT | SL_COMMENT)? name=ID
		public Group getGroup() { return cGroup; }
		
		//{econtext::Constant}
		public Action getConstantAction_0() { return cConstantAction_0; }
		
		//comment=(ML_COMMENT | SL_COMMENT)?
		public Assignment getCommentAssignment_1() { return cCommentAssignment_1; }
		
		//(ML_COMMENT | SL_COMMENT)
		public Alternatives getCommentAlternatives_1_0() { return cCommentAlternatives_1_0; }
		
		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_1_0_0() { return cCommentML_COMMENTTerminalRuleCall_1_0_0; }
		
		//SL_COMMENT
		public RuleCall getCommentSL_COMMENTTerminalRuleCall_1_0_1() { return cCommentSL_COMMENTTerminalRuleCall_1_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class XAxiomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ac.soton.eventb.xtext.context.XContext.XAxiom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAxiomAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cCommentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cCommentAlternatives_1_0 = (Alternatives)cCommentAssignment_1.eContents().get(0);
		private final RuleCall cCommentML_COMMENTTerminalRuleCall_1_0_0 = (RuleCall)cCommentAlternatives_1_0.eContents().get(0);
		private final RuleCall cCommentSL_COMMENTTerminalRuleCall_1_0_1 = (RuleCall)cCommentAlternatives_1_0.eContents().get(1);
		private final Keyword cCommercialAtKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cPredicateAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPredicateSTRINGTerminalRuleCall_4_0 = (RuleCall)cPredicateAssignment_4.eContents().get(0);
		private final Assignment cTheoremAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final Keyword cTheoremTheoremKeyword_5_0 = (Keyword)cTheoremAssignment_5.eContents().get(0);
		
		//XAxiom econtext::Axiom:
		//	{econtext::Axiom} comment=(ML_COMMENT | SL_COMMENT)?
		//	'@' name=ID predicate=STRING theorem?='theorem'?
		@Override public ParserRule getRule() { return rule; }
		
		//{econtext::Axiom} comment=(ML_COMMENT | SL_COMMENT)? '@' name=ID predicate=STRING theorem?='theorem'?
		public Group getGroup() { return cGroup; }
		
		//{econtext::Axiom}
		public Action getAxiomAction_0() { return cAxiomAction_0; }
		
		//comment=(ML_COMMENT | SL_COMMENT)?
		public Assignment getCommentAssignment_1() { return cCommentAssignment_1; }
		
		//(ML_COMMENT | SL_COMMENT)
		public Alternatives getCommentAlternatives_1_0() { return cCommentAlternatives_1_0; }
		
		//ML_COMMENT
		public RuleCall getCommentML_COMMENTTerminalRuleCall_1_0_0() { return cCommentML_COMMENTTerminalRuleCall_1_0_0; }
		
		//SL_COMMENT
		public RuleCall getCommentSL_COMMENTTerminalRuleCall_1_0_1() { return cCommentSL_COMMENTTerminalRuleCall_1_0_1; }
		
		//'@'
		public Keyword getCommercialAtKeyword_2() { return cCommercialAtKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//predicate=STRING
		public Assignment getPredicateAssignment_4() { return cPredicateAssignment_4; }
		
		//STRING
		public RuleCall getPredicateSTRINGTerminalRuleCall_4_0() { return cPredicateSTRINGTerminalRuleCall_4_0; }
		
		//theorem?='theorem'?
		public Assignment getTheoremAssignment_5() { return cTheoremAssignment_5; }
		
		//'theorem'
		public Keyword getTheoremTheoremKeyword_5_0() { return cTheoremTheoremKeyword_5_0; }
	}
	
	
	private final XContextElements pXContext;
	private final XCarrierSetElements pXCarrierSet;
	private final XConstantElements pXConstant;
	private final XAxiomElements pXAxiom;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public XContextGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pXContext = new XContextElements();
		this.pXCarrierSet = new XCarrierSetElements();
		this.pXConstant = new XConstantElements();
		this.pXAxiom = new XAxiomElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("ac.soton.eventb.xtext.context.XContext".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//XContext econtext::Context:
	//	{econtext::Context} comment=(ML_COMMENT | SL_COMMENT)?
	//	'context' name=ID ('extends' extends+=[econtext::Context]+)? ('sets' sets+=XCarrierSet+)? ('constants'
	//	constants+=XConstant+)? ('axioms' axioms+=XAxiom+)?
	//	'end'
	public XContextElements getXContextAccess() {
		return pXContext;
	}
	
	public ParserRule getXContextRule() {
		return getXContextAccess().getRule();
	}
	
	//XCarrierSet econtext::CarrierSet:
	//	{econtext::CarrierSet} comment=(ML_COMMENT | SL_COMMENT)?
	//	name=ID
	public XCarrierSetElements getXCarrierSetAccess() {
		return pXCarrierSet;
	}
	
	public ParserRule getXCarrierSetRule() {
		return getXCarrierSetAccess().getRule();
	}
	
	//XConstant econtext::Constant:
	//	{econtext::Constant} comment=(ML_COMMENT | SL_COMMENT)?
	//	name=ID
	public XConstantElements getXConstantAccess() {
		return pXConstant;
	}
	
	public ParserRule getXConstantRule() {
		return getXConstantAccess().getRule();
	}
	
	//XAxiom econtext::Axiom:
	//	{econtext::Axiom} comment=(ML_COMMENT | SL_COMMENT)?
	//	'@' name=ID predicate=STRING theorem?='theorem'?
	public XAxiomElements getXAxiomAccess() {
		return pXAxiom;
	}
	
	public ParserRule getXAxiomRule() {
		return getXAxiomAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}