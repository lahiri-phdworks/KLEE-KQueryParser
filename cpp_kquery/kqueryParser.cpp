
// Generated from kquery.g4 by ANTLR 4.9.2


#include "kqueryListener.h"
#include "kqueryVisitor.h"

#include "kqueryParser.h"


using namespace antlrcpp;
using namespace antlr4;

kqueryParser::kqueryParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

kqueryParser::~kqueryParser() {
  delete _interpreter;
}

std::string kqueryParser::getGrammarFileName() const {
  return "kquery.g4";
}

const std::vector<std::string>& kqueryParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& kqueryParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- KqueryExpressionContext ------------------------------------------------------------------

kqueryParser::KqueryExpressionContext::KqueryExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

kqueryParser::ArrayDeclarationContext* kqueryParser::KqueryExpressionContext::arrayDeclaration() {
  return getRuleContext<kqueryParser::ArrayDeclarationContext>(0);
}


size_t kqueryParser::KqueryExpressionContext::getRuleIndex() const {
  return kqueryParser::RuleKqueryExpression;
}

void kqueryParser::KqueryExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterKqueryExpression(this);
}

void kqueryParser::KqueryExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitKqueryExpression(this);
}


antlrcpp::Any kqueryParser::KqueryExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitKqueryExpression(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::KqueryExpressionContext* kqueryParser::kqueryExpression() {
  KqueryExpressionContext *_localctx = _tracker.createInstance<KqueryExpressionContext>(_ctx, getState());
  enterRule(_localctx, 0, kqueryParser::RuleKqueryExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(44);
    arrayDeclaration();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrayDeclarationContext ------------------------------------------------------------------

kqueryParser::ArrayDeclarationContext::ArrayDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

kqueryParser::ArrNameContext* kqueryParser::ArrayDeclarationContext::arrName() {
  return getRuleContext<kqueryParser::ArrNameContext>(0);
}

tree::TerminalNode* kqueryParser::ArrayDeclarationContext::LeftBracket() {
  return getToken(kqueryParser::LeftBracket, 0);
}

tree::TerminalNode* kqueryParser::ArrayDeclarationContext::RightBracket() {
  return getToken(kqueryParser::RightBracket, 0);
}

kqueryParser::DomainContext* kqueryParser::ArrayDeclarationContext::domain() {
  return getRuleContext<kqueryParser::DomainContext>(0);
}

kqueryParser::RangeLimitContext* kqueryParser::ArrayDeclarationContext::rangeLimit() {
  return getRuleContext<kqueryParser::RangeLimitContext>(0);
}

kqueryParser::ArrayInitializerContext* kqueryParser::ArrayDeclarationContext::arrayInitializer() {
  return getRuleContext<kqueryParser::ArrayInitializerContext>(0);
}

kqueryParser::DecConstantContext* kqueryParser::ArrayDeclarationContext::decConstant() {
  return getRuleContext<kqueryParser::DecConstantContext>(0);
}


size_t kqueryParser::ArrayDeclarationContext::getRuleIndex() const {
  return kqueryParser::RuleArrayDeclaration;
}

void kqueryParser::ArrayDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrayDeclaration(this);
}

void kqueryParser::ArrayDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrayDeclaration(this);
}


antlrcpp::Any kqueryParser::ArrayDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitArrayDeclaration(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::ArrayDeclarationContext* kqueryParser::arrayDeclaration() {
  ArrayDeclarationContext *_localctx = _tracker.createInstance<ArrayDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 2, kqueryParser::RuleArrayDeclaration);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(46);
    match(kqueryParser::T__0);
    setState(47);
    arrName();
    setState(48);
    match(kqueryParser::LeftBracket);

    setState(49);
    decConstant();
    setState(50);
    match(kqueryParser::RightBracket);
    setState(51);
    match(kqueryParser::T__1);
    setState(52);
    domain();
    setState(53);
    match(kqueryParser::T__2);
    setState(54);
    rangeLimit();
    setState(55);
    match(kqueryParser::T__3);
    setState(56);
    arrayInitializer();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrayInitializerContext ------------------------------------------------------------------

kqueryParser::ArrayInitializerContext::ArrayInitializerContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* kqueryParser::ArrayInitializerContext::LeftBracket() {
  return getToken(kqueryParser::LeftBracket, 0);
}

kqueryParser::NumberListContext* kqueryParser::ArrayInitializerContext::numberList() {
  return getRuleContext<kqueryParser::NumberListContext>(0);
}

tree::TerminalNode* kqueryParser::ArrayInitializerContext::RightBracket() {
  return getToken(kqueryParser::RightBracket, 0);
}


size_t kqueryParser::ArrayInitializerContext::getRuleIndex() const {
  return kqueryParser::RuleArrayInitializer;
}

void kqueryParser::ArrayInitializerContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrayInitializer(this);
}

void kqueryParser::ArrayInitializerContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrayInitializer(this);
}


antlrcpp::Any kqueryParser::ArrayInitializerContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitArrayInitializer(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::ArrayInitializerContext* kqueryParser::arrayInitializer() {
  ArrayInitializerContext *_localctx = _tracker.createInstance<ArrayInitializerContext>(_ctx, getState());
  enterRule(_localctx, 4, kqueryParser::RuleArrayInitializer);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(63);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case kqueryParser::T__4: {
        enterOuterAlt(_localctx, 1);
        setState(58);
        match(kqueryParser::T__4);
        break;
      }

      case kqueryParser::LeftBracket: {
        enterOuterAlt(_localctx, 2);
        setState(59);
        match(kqueryParser::LeftBracket);
        setState(60);
        numberList();
        setState(61);
        match(kqueryParser::RightBracket);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionContext ------------------------------------------------------------------

kqueryParser::ExpressionContext::ExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

kqueryParser::IdentifierContext* kqueryParser::ExpressionContext::identifier() {
  return getRuleContext<kqueryParser::IdentifierContext>(0);
}

std::vector<kqueryParser::ExpressionContext *> kqueryParser::ExpressionContext::expression() {
  return getRuleContexts<kqueryParser::ExpressionContext>();
}

kqueryParser::ExpressionContext* kqueryParser::ExpressionContext::expression(size_t i) {
  return getRuleContext<kqueryParser::ExpressionContext>(i);
}

kqueryParser::NumberContext* kqueryParser::ExpressionContext::number() {
  return getRuleContext<kqueryParser::NumberContext>(0);
}

tree::TerminalNode* kqueryParser::ExpressionContext::LeftParen() {
  return getToken(kqueryParser::LeftParen, 0);
}

tree::TerminalNode* kqueryParser::ExpressionContext::TYPE() {
  return getToken(kqueryParser::TYPE, 0);
}

tree::TerminalNode* kqueryParser::ExpressionContext::RightParen() {
  return getToken(kqueryParser::RightParen, 0);
}

kqueryParser::ArithmeticExprContext* kqueryParser::ExpressionContext::arithmeticExpr() {
  return getRuleContext<kqueryParser::ArithmeticExprContext>(0);
}

tree::TerminalNode* kqueryParser::ExpressionContext::LeftBracket() {
  return getToken(kqueryParser::LeftBracket, 0);
}

tree::TerminalNode* kqueryParser::ExpressionContext::RightBracket() {
  return getToken(kqueryParser::RightBracket, 0);
}

kqueryParser::BitwiseExprContext* kqueryParser::ExpressionContext::bitwiseExpr() {
  return getRuleContext<kqueryParser::BitwiseExprContext>(0);
}

kqueryParser::ComparisonExprContext* kqueryParser::ExpressionContext::comparisonExpr() {
  return getRuleContext<kqueryParser::ComparisonExprContext>(0);
}

kqueryParser::VersionContext* kqueryParser::ExpressionContext::version() {
  return getRuleContext<kqueryParser::VersionContext>(0);
}


size_t kqueryParser::ExpressionContext::getRuleIndex() const {
  return kqueryParser::RuleExpression;
}

void kqueryParser::ExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExpression(this);
}

void kqueryParser::ExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExpression(this);
}


antlrcpp::Any kqueryParser::ExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitExpression(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::ExpressionContext* kqueryParser::expression() {
  ExpressionContext *_localctx = _tracker.createInstance<ExpressionContext>(_ctx, getState());
  enterRule(_localctx, 6, kqueryParser::RuleExpression);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(187);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(65);
      identifier();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(66);
      identifier();
      setState(67);
      match(kqueryParser::T__1);
      setState(68);
      expression();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(70);
      number();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(71);
      match(kqueryParser::LeftParen);
      setState(72);
      match(kqueryParser::TYPE);
      setState(73);
      number();
      setState(74);
      match(kqueryParser::RightParen);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(76);
      match(kqueryParser::LeftParen);
      setState(77);
      arithmeticExpr();
      setState(78);
      match(kqueryParser::TYPE);
      setState(79);
      expression();
      setState(80);
      expression();
      setState(81);
      match(kqueryParser::RightParen);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(83);
      match(kqueryParser::LeftParen);
      setState(84);
      match(kqueryParser::T__5);
      setState(85);
      match(kqueryParser::LeftBracket);
      setState(86);
      match(kqueryParser::TYPE);
      setState(87);
      match(kqueryParser::RightBracket);
      setState(88);
      expression();
      setState(89);
      match(kqueryParser::RightParen);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(91);
      match(kqueryParser::LeftParen);
      setState(92);
      bitwiseExpr();
      setState(93);
      match(kqueryParser::TYPE);
      setState(94);
      expression();
      setState(95);
      expression();
      setState(96);
      match(kqueryParser::RightParen);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(98);
      match(kqueryParser::LeftParen);
      setState(99);
      match(kqueryParser::T__6);
      setState(100);
      match(kqueryParser::TYPE);
      setState(101);
      expression();
      setState(102);
      expression();
      setState(103);
      match(kqueryParser::RightParen);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(105);
      match(kqueryParser::LeftParen);
      setState(106);
      match(kqueryParser::T__7);
      setState(107);
      match(kqueryParser::TYPE);
      setState(108);
      expression();
      setState(109);
      expression();
      setState(110);
      match(kqueryParser::RightParen);
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(112);
      match(kqueryParser::LeftParen);
      setState(113);
      match(kqueryParser::T__8);
      setState(114);
      match(kqueryParser::TYPE);
      setState(115);
      expression();
      setState(116);
      expression();
      setState(117);
      match(kqueryParser::RightParen);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(119);
      match(kqueryParser::LeftParen);
      setState(120);
      comparisonExpr();

      setState(121);
      match(kqueryParser::TYPE);
      setState(122);
      expression();
      setState(123);
      expression();
      setState(124);
      match(kqueryParser::RightParen);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(126);
      match(kqueryParser::LeftParen);
      setState(127);
      match(kqueryParser::T__9);

      setState(128);
      match(kqueryParser::TYPE);
      setState(129);
      expression();
      setState(130);
      expression();
      setState(131);
      match(kqueryParser::RightParen);
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(133);
      match(kqueryParser::LeftParen);
      setState(134);
      match(kqueryParser::T__10);
      setState(135);
      match(kqueryParser::TYPE);
      setState(136);
      number();
      setState(137);
      expression();
      setState(138);
      match(kqueryParser::RightParen);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(140);
      match(kqueryParser::LeftParen);
      setState(141);
      match(kqueryParser::T__11);
      setState(142);
      match(kqueryParser::TYPE);
      setState(143);
      expression();
      setState(144);
      match(kqueryParser::RightParen);
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(146);
      match(kqueryParser::LeftParen);
      setState(147);
      match(kqueryParser::T__12);
      setState(148);
      match(kqueryParser::TYPE);
      setState(149);
      expression();
      setState(150);
      match(kqueryParser::RightParen);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(152);
      match(kqueryParser::LeftParen);
      setState(153);
      match(kqueryParser::T__13);
      setState(154);
      match(kqueryParser::TYPE);
      setState(155);
      expression();
      setState(156);
      version();
      setState(157);
      match(kqueryParser::RightParen);
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(159);
      match(kqueryParser::LeftParen);
      setState(160);
      match(kqueryParser::T__14);
      setState(161);
      match(kqueryParser::TYPE);
      setState(162);
      expression();
      setState(163);
      expression();
      setState(164);
      expression();
      setState(165);
      match(kqueryParser::RightParen);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(167);
      match(kqueryParser::LeftParen);
      setState(168);
      match(kqueryParser::T__15);

      setState(169);
      match(kqueryParser::TYPE);
      setState(170);
      expression();
      setState(171);
      match(kqueryParser::RightParen);
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(173);
      match(kqueryParser::LeftParen);
      setState(174);
      match(kqueryParser::T__16);
      setState(175);
      match(kqueryParser::TYPE);
      setState(176);
      expression();
      setState(177);
      version();
      setState(178);
      match(kqueryParser::RightParen);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(180);
      match(kqueryParser::LeftParen);
      setState(181);
      match(kqueryParser::T__17);
      setState(182);
      match(kqueryParser::TYPE);
      setState(183);
      expression();
      setState(184);
      version();
      setState(185);
      match(kqueryParser::RightParen);
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BitwiseExprContext ------------------------------------------------------------------

kqueryParser::BitwiseExprContext::BitwiseExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t kqueryParser::BitwiseExprContext::getRuleIndex() const {
  return kqueryParser::RuleBitwiseExpr;
}

void kqueryParser::BitwiseExprContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBitwiseExpr(this);
}

void kqueryParser::BitwiseExprContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBitwiseExpr(this);
}


antlrcpp::Any kqueryParser::BitwiseExprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitBitwiseExpr(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::BitwiseExprContext* kqueryParser::bitwiseExpr() {
  BitwiseExprContext *_localctx = _tracker.createInstance<BitwiseExprContext>(_ctx, getState());
  enterRule(_localctx, 8, kqueryParser::RuleBitwiseExpr);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(189);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << kqueryParser::T__6)
      | (1ULL << kqueryParser::T__7)
      | (1ULL << kqueryParser::T__8)
      | (1ULL << kqueryParser::T__18)
      | (1ULL << kqueryParser::T__19)
      | (1ULL << kqueryParser::T__20))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ComparisonExprContext ------------------------------------------------------------------

kqueryParser::ComparisonExprContext::ComparisonExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t kqueryParser::ComparisonExprContext::getRuleIndex() const {
  return kqueryParser::RuleComparisonExpr;
}

void kqueryParser::ComparisonExprContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterComparisonExpr(this);
}

void kqueryParser::ComparisonExprContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitComparisonExpr(this);
}


antlrcpp::Any kqueryParser::ComparisonExprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitComparisonExpr(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::ComparisonExprContext* kqueryParser::comparisonExpr() {
  ComparisonExprContext *_localctx = _tracker.createInstance<ComparisonExprContext>(_ctx, getState());
  enterRule(_localctx, 10, kqueryParser::RuleComparisonExpr);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(191);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << kqueryParser::T__21)
      | (1ULL << kqueryParser::T__22)
      | (1ULL << kqueryParser::T__23)
      | (1ULL << kqueryParser::T__24)
      | (1ULL << kqueryParser::T__25)
      | (1ULL << kqueryParser::T__26)
      | (1ULL << kqueryParser::T__27)
      | (1ULL << kqueryParser::T__28)
      | (1ULL << kqueryParser::T__29)
      | (1ULL << kqueryParser::T__30))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArithmeticExprContext ------------------------------------------------------------------

kqueryParser::ArithmeticExprContext::ArithmeticExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t kqueryParser::ArithmeticExprContext::getRuleIndex() const {
  return kqueryParser::RuleArithmeticExpr;
}

void kqueryParser::ArithmeticExprContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArithmeticExpr(this);
}

void kqueryParser::ArithmeticExprContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArithmeticExpr(this);
}


antlrcpp::Any kqueryParser::ArithmeticExprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitArithmeticExpr(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::ArithmeticExprContext* kqueryParser::arithmeticExpr() {
  ArithmeticExprContext *_localctx = _tracker.createInstance<ArithmeticExprContext>(_ctx, getState());
  enterRule(_localctx, 12, kqueryParser::RuleArithmeticExpr);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(193);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << kqueryParser::T__31)
      | (1ULL << kqueryParser::T__32)
      | (1ULL << kqueryParser::T__33)
      | (1ULL << kqueryParser::T__34)
      | (1ULL << kqueryParser::T__35)
      | (1ULL << kqueryParser::T__36)
      | (1ULL << kqueryParser::T__37))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DomainContext ------------------------------------------------------------------

kqueryParser::DomainContext::DomainContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* kqueryParser::DomainContext::TYPE() {
  return getToken(kqueryParser::TYPE, 0);
}


size_t kqueryParser::DomainContext::getRuleIndex() const {
  return kqueryParser::RuleDomain;
}

void kqueryParser::DomainContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDomain(this);
}

void kqueryParser::DomainContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDomain(this);
}


antlrcpp::Any kqueryParser::DomainContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitDomain(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::DomainContext* kqueryParser::domain() {
  DomainContext *_localctx = _tracker.createInstance<DomainContext>(_ctx, getState());
  enterRule(_localctx, 14, kqueryParser::RuleDomain);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(195);
    match(kqueryParser::TYPE);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- RangeLimitContext ------------------------------------------------------------------

kqueryParser::RangeLimitContext::RangeLimitContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* kqueryParser::RangeLimitContext::TYPE() {
  return getToken(kqueryParser::TYPE, 0);
}


size_t kqueryParser::RangeLimitContext::getRuleIndex() const {
  return kqueryParser::RuleRangeLimit;
}

void kqueryParser::RangeLimitContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterRangeLimit(this);
}

void kqueryParser::RangeLimitContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitRangeLimit(this);
}


antlrcpp::Any kqueryParser::RangeLimitContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitRangeLimit(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::RangeLimitContext* kqueryParser::rangeLimit() {
  RangeLimitContext *_localctx = _tracker.createInstance<RangeLimitContext>(_ctx, getState());
  enterRule(_localctx, 16, kqueryParser::RuleRangeLimit);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(197);
    match(kqueryParser::TYPE);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrNameContext ------------------------------------------------------------------

kqueryParser::ArrNameContext::ArrNameContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

kqueryParser::IdentifierContext* kqueryParser::ArrNameContext::identifier() {
  return getRuleContext<kqueryParser::IdentifierContext>(0);
}


size_t kqueryParser::ArrNameContext::getRuleIndex() const {
  return kqueryParser::RuleArrName;
}

void kqueryParser::ArrNameContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrName(this);
}

void kqueryParser::ArrNameContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrName(this);
}


antlrcpp::Any kqueryParser::ArrNameContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitArrName(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::ArrNameContext* kqueryParser::arrName() {
  ArrNameContext *_localctx = _tracker.createInstance<ArrNameContext>(_ctx, getState());
  enterRule(_localctx, 18, kqueryParser::RuleArrName);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(199);
    identifier();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- NumberListContext ------------------------------------------------------------------

kqueryParser::NumberListContext::NumberListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

kqueryParser::NumberContext* kqueryParser::NumberListContext::number() {
  return getRuleContext<kqueryParser::NumberContext>(0);
}

kqueryParser::NumberListContext* kqueryParser::NumberListContext::numberList() {
  return getRuleContext<kqueryParser::NumberListContext>(0);
}


size_t kqueryParser::NumberListContext::getRuleIndex() const {
  return kqueryParser::RuleNumberList;
}

void kqueryParser::NumberListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterNumberList(this);
}

void kqueryParser::NumberListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitNumberList(this);
}


antlrcpp::Any kqueryParser::NumberListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitNumberList(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::NumberListContext* kqueryParser::numberList() {
  NumberListContext *_localctx = _tracker.createInstance<NumberListContext>(_ctx, getState());
  enterRule(_localctx, 20, kqueryParser::RuleNumberList);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(206);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(201);
      number();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(202);
      number();
      setState(203);
      match(kqueryParser::T__38);
      setState(204);
      numberList();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- NumberContext ------------------------------------------------------------------

kqueryParser::NumberContext::NumberContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

kqueryParser::SignedConstantContext* kqueryParser::NumberContext::signedConstant() {
  return getRuleContext<kqueryParser::SignedConstantContext>(0);
}


size_t kqueryParser::NumberContext::getRuleIndex() const {
  return kqueryParser::RuleNumber;
}

void kqueryParser::NumberContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterNumber(this);
}

void kqueryParser::NumberContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitNumber(this);
}


antlrcpp::Any kqueryParser::NumberContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitNumber(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::NumberContext* kqueryParser::number() {
  NumberContext *_localctx = _tracker.createInstance<NumberContext>(_ctx, getState());
  enterRule(_localctx, 22, kqueryParser::RuleNumber);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(211);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case kqueryParser::T__39: {
        enterOuterAlt(_localctx, 1);
        setState(208);
        match(kqueryParser::T__39);
        break;
      }

      case kqueryParser::T__40: {
        enterOuterAlt(_localctx, 2);
        setState(209);
        match(kqueryParser::T__40);
        break;
      }

      case kqueryParser::T__41:
      case kqueryParser::T__42: {
        enterOuterAlt(_localctx, 3);
        setState(210);
        signedConstant();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SignedConstantContext ------------------------------------------------------------------

kqueryParser::SignedConstantContext::SignedConstantContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

kqueryParser::DecConstantContext* kqueryParser::SignedConstantContext::decConstant() {
  return getRuleContext<kqueryParser::DecConstantContext>(0);
}

kqueryParser::BinConstantContext* kqueryParser::SignedConstantContext::binConstant() {
  return getRuleContext<kqueryParser::BinConstantContext>(0);
}

kqueryParser::OctConstantContext* kqueryParser::SignedConstantContext::octConstant() {
  return getRuleContext<kqueryParser::OctConstantContext>(0);
}

kqueryParser::HexConstantContext* kqueryParser::SignedConstantContext::hexConstant() {
  return getRuleContext<kqueryParser::HexConstantContext>(0);
}


size_t kqueryParser::SignedConstantContext::getRuleIndex() const {
  return kqueryParser::RuleSignedConstant;
}

void kqueryParser::SignedConstantContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSignedConstant(this);
}

void kqueryParser::SignedConstantContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSignedConstant(this);
}


antlrcpp::Any kqueryParser::SignedConstantContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitSignedConstant(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::SignedConstantContext* kqueryParser::signedConstant() {
  SignedConstantContext *_localctx = _tracker.createInstance<SignedConstantContext>(_ctx, getState());
  enterRule(_localctx, 24, kqueryParser::RuleSignedConstant);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(213);
    _la = _input->LA(1);
    if (!(_la == kqueryParser::T__41

    || _la == kqueryParser::T__42)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
    setState(218);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case kqueryParser::Digit: {
        setState(214);
        decConstant();
        break;
      }

      case kqueryParser::T__43: {
        setState(215);
        binConstant();
        break;
      }

      case kqueryParser::T__44: {
        setState(216);
        octConstant();
        break;
      }

      case kqueryParser::T__45: {
        setState(217);
        hexConstant();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DecConstantContext ------------------------------------------------------------------

kqueryParser::DecConstantContext::DecConstantContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> kqueryParser::DecConstantContext::Digit() {
  return getTokens(kqueryParser::Digit);
}

tree::TerminalNode* kqueryParser::DecConstantContext::Digit(size_t i) {
  return getToken(kqueryParser::Digit, i);
}


size_t kqueryParser::DecConstantContext::getRuleIndex() const {
  return kqueryParser::RuleDecConstant;
}

void kqueryParser::DecConstantContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDecConstant(this);
}

void kqueryParser::DecConstantContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDecConstant(this);
}


antlrcpp::Any kqueryParser::DecConstantContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitDecConstant(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::DecConstantContext* kqueryParser::decConstant() {
  DecConstantContext *_localctx = _tracker.createInstance<DecConstantContext>(_ctx, getState());
  enterRule(_localctx, 26, kqueryParser::RuleDecConstant);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(221); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(220);
      match(kqueryParser::Digit);
      setState(223); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == kqueryParser::Digit);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BinConstantContext ------------------------------------------------------------------

kqueryParser::BinConstantContext::BinConstantContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> kqueryParser::BinConstantContext::BinExtend() {
  return getTokens(kqueryParser::BinExtend);
}

tree::TerminalNode* kqueryParser::BinConstantContext::BinExtend(size_t i) {
  return getToken(kqueryParser::BinExtend, i);
}


size_t kqueryParser::BinConstantContext::getRuleIndex() const {
  return kqueryParser::RuleBinConstant;
}

void kqueryParser::BinConstantContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBinConstant(this);
}

void kqueryParser::BinConstantContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBinConstant(this);
}


antlrcpp::Any kqueryParser::BinConstantContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitBinConstant(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::BinConstantContext* kqueryParser::binConstant() {
  BinConstantContext *_localctx = _tracker.createInstance<BinConstantContext>(_ctx, getState());
  enterRule(_localctx, 28, kqueryParser::RuleBinConstant);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(225);
    match(kqueryParser::T__43);
    setState(227); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(226);
      match(kqueryParser::BinExtend);
      setState(229); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == kqueryParser::BinExtend);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- OctConstantContext ------------------------------------------------------------------

kqueryParser::OctConstantContext::OctConstantContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> kqueryParser::OctConstantContext::OctalExtend() {
  return getTokens(kqueryParser::OctalExtend);
}

tree::TerminalNode* kqueryParser::OctConstantContext::OctalExtend(size_t i) {
  return getToken(kqueryParser::OctalExtend, i);
}


size_t kqueryParser::OctConstantContext::getRuleIndex() const {
  return kqueryParser::RuleOctConstant;
}

void kqueryParser::OctConstantContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterOctConstant(this);
}

void kqueryParser::OctConstantContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitOctConstant(this);
}


antlrcpp::Any kqueryParser::OctConstantContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitOctConstant(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::OctConstantContext* kqueryParser::octConstant() {
  OctConstantContext *_localctx = _tracker.createInstance<OctConstantContext>(_ctx, getState());
  enterRule(_localctx, 30, kqueryParser::RuleOctConstant);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(231);
    match(kqueryParser::T__44);
    setState(233); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(232);
      match(kqueryParser::OctalExtend);
      setState(235); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == kqueryParser::OctalExtend);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- HexConstantContext ------------------------------------------------------------------

kqueryParser::HexConstantContext::HexConstantContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> kqueryParser::HexConstantContext::HexExtend() {
  return getTokens(kqueryParser::HexExtend);
}

tree::TerminalNode* kqueryParser::HexConstantContext::HexExtend(size_t i) {
  return getToken(kqueryParser::HexExtend, i);
}


size_t kqueryParser::HexConstantContext::getRuleIndex() const {
  return kqueryParser::RuleHexConstant;
}

void kqueryParser::HexConstantContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterHexConstant(this);
}

void kqueryParser::HexConstantContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitHexConstant(this);
}


antlrcpp::Any kqueryParser::HexConstantContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitHexConstant(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::HexConstantContext* kqueryParser::hexConstant() {
  HexConstantContext *_localctx = _tracker.createInstance<HexConstantContext>(_ctx, getState());
  enterRule(_localctx, 32, kqueryParser::RuleHexConstant);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(237);
    match(kqueryParser::T__45);
    setState(239); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(238);
      match(kqueryParser::HexExtend);
      setState(241); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == kqueryParser::HexExtend);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IdentifierContext ------------------------------------------------------------------

kqueryParser::IdentifierContext::IdentifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* kqueryParser::IdentifierContext::StartLetter() {
  return getToken(kqueryParser::StartLetter, 0);
}

std::vector<tree::TerminalNode *> kqueryParser::IdentifierContext::AlphaNumericSpl() {
  return getTokens(kqueryParser::AlphaNumericSpl);
}

tree::TerminalNode* kqueryParser::IdentifierContext::AlphaNumericSpl(size_t i) {
  return getToken(kqueryParser::AlphaNumericSpl, i);
}


size_t kqueryParser::IdentifierContext::getRuleIndex() const {
  return kqueryParser::RuleIdentifier;
}

void kqueryParser::IdentifierContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIdentifier(this);
}

void kqueryParser::IdentifierContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIdentifier(this);
}


antlrcpp::Any kqueryParser::IdentifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitIdentifier(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::IdentifierContext* kqueryParser::identifier() {
  IdentifierContext *_localctx = _tracker.createInstance<IdentifierContext>(_ctx, getState());
  enterRule(_localctx, 34, kqueryParser::RuleIdentifier);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(243);
    match(kqueryParser::StartLetter);
    setState(247);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == kqueryParser::AlphaNumericSpl) {
      setState(244);
      match(kqueryParser::AlphaNumericSpl);
      setState(249);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FloatingPointTypeContext ------------------------------------------------------------------

kqueryParser::FloatingPointTypeContext::FloatingPointTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> kqueryParser::FloatingPointTypeContext::Digit() {
  return getTokens(kqueryParser::Digit);
}

tree::TerminalNode* kqueryParser::FloatingPointTypeContext::Digit(size_t i) {
  return getToken(kqueryParser::Digit, i);
}


size_t kqueryParser::FloatingPointTypeContext::getRuleIndex() const {
  return kqueryParser::RuleFloatingPointType;
}

void kqueryParser::FloatingPointTypeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFloatingPointType(this);
}

void kqueryParser::FloatingPointTypeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFloatingPointType(this);
}


antlrcpp::Any kqueryParser::FloatingPointTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitFloatingPointType(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::FloatingPointTypeContext* kqueryParser::floatingPointType() {
  FloatingPointTypeContext *_localctx = _tracker.createInstance<FloatingPointTypeContext>(_ctx, getState());
  enterRule(_localctx, 36, kqueryParser::RuleFloatingPointType);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(250);
    match(kqueryParser::T__46);
    setState(252); 
    _errHandler->sync(this);
    alt = 1;
    do {
      switch (alt) {
        case 1: {
              setState(251);
              match(kqueryParser::Digit);
              break;
            }

      default:
        throw NoViableAltException(this);
      }
      setState(254); 
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx);
    } while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER);
    setState(263);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << kqueryParser::T__0)
      | (1ULL << kqueryParser::T__1)
      | (1ULL << kqueryParser::T__2)
      | (1ULL << kqueryParser::T__3)
      | (1ULL << kqueryParser::T__4)
      | (1ULL << kqueryParser::T__5)
      | (1ULL << kqueryParser::T__6)
      | (1ULL << kqueryParser::T__7)
      | (1ULL << kqueryParser::T__8)
      | (1ULL << kqueryParser::T__9)
      | (1ULL << kqueryParser::T__10)
      | (1ULL << kqueryParser::T__11)
      | (1ULL << kqueryParser::T__12)
      | (1ULL << kqueryParser::T__13)
      | (1ULL << kqueryParser::T__14)
      | (1ULL << kqueryParser::T__15)
      | (1ULL << kqueryParser::T__16)
      | (1ULL << kqueryParser::T__17)
      | (1ULL << kqueryParser::T__18)
      | (1ULL << kqueryParser::T__19)
      | (1ULL << kqueryParser::T__20)
      | (1ULL << kqueryParser::T__21)
      | (1ULL << kqueryParser::T__22)
      | (1ULL << kqueryParser::T__23)
      | (1ULL << kqueryParser::T__24)
      | (1ULL << kqueryParser::T__25)
      | (1ULL << kqueryParser::T__26)
      | (1ULL << kqueryParser::T__27)
      | (1ULL << kqueryParser::T__28)
      | (1ULL << kqueryParser::T__29)
      | (1ULL << kqueryParser::T__30)
      | (1ULL << kqueryParser::T__31)
      | (1ULL << kqueryParser::T__32)
      | (1ULL << kqueryParser::T__33)
      | (1ULL << kqueryParser::T__34)
      | (1ULL << kqueryParser::T__35)
      | (1ULL << kqueryParser::T__36)
      | (1ULL << kqueryParser::T__37)
      | (1ULL << kqueryParser::T__38)
      | (1ULL << kqueryParser::T__39)
      | (1ULL << kqueryParser::T__40)
      | (1ULL << kqueryParser::T__41)
      | (1ULL << kqueryParser::T__42)
      | (1ULL << kqueryParser::T__43)
      | (1ULL << kqueryParser::T__44)
      | (1ULL << kqueryParser::T__45)
      | (1ULL << kqueryParser::T__46)
      | (1ULL << kqueryParser::T__47)
      | (1ULL << kqueryParser::T__48)
      | (1ULL << kqueryParser::TYPE)
      | (1ULL << kqueryParser::LeftParen)
      | (1ULL << kqueryParser::RightParen)
      | (1ULL << kqueryParser::LeftBracket)
      | (1ULL << kqueryParser::RightBracket)
      | (1ULL << kqueryParser::LeftBrace)
      | (1ULL << kqueryParser::RightBrace)
      | (1ULL << kqueryParser::HexExtend)
      | (1ULL << kqueryParser::OctalExtend)
      | (1ULL << kqueryParser::BinExtend)
      | (1ULL << kqueryParser::Digit)
      | (1ULL << kqueryParser::StartLetter)
      | (1ULL << kqueryParser::AlphaNumericSpl))) != 0)) {
      setState(256);
      matchWildcard();
      setState(260);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx);
      while (alt != 1 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1 + 1) {
          setState(257);
          matchWildcard(); 
        }
        setState(262);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx);
      }
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- IntegerTypeContext ------------------------------------------------------------------

kqueryParser::IntegerTypeContext::IntegerTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> kqueryParser::IntegerTypeContext::Digit() {
  return getTokens(kqueryParser::Digit);
}

tree::TerminalNode* kqueryParser::IntegerTypeContext::Digit(size_t i) {
  return getToken(kqueryParser::Digit, i);
}


size_t kqueryParser::IntegerTypeContext::getRuleIndex() const {
  return kqueryParser::RuleIntegerType;
}

void kqueryParser::IntegerTypeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIntegerType(this);
}

void kqueryParser::IntegerTypeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIntegerType(this);
}


antlrcpp::Any kqueryParser::IntegerTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitIntegerType(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::IntegerTypeContext* kqueryParser::integerType() {
  IntegerTypeContext *_localctx = _tracker.createInstance<IntegerTypeContext>(_ctx, getState());
  enterRule(_localctx, 38, kqueryParser::RuleIntegerType);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(265);
    match(kqueryParser::T__47);
    setState(267); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(266);
      match(kqueryParser::Digit);
      setState(269); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == kqueryParser::Digit);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VersionContext ------------------------------------------------------------------

kqueryParser::VersionContext::VersionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

kqueryParser::IdentifierContext* kqueryParser::VersionContext::identifier() {
  return getRuleContext<kqueryParser::IdentifierContext>(0);
}

tree::TerminalNode* kqueryParser::VersionContext::LeftBracket() {
  return getToken(kqueryParser::LeftBracket, 0);
}

tree::TerminalNode* kqueryParser::VersionContext::RightBracket() {
  return getToken(kqueryParser::RightBracket, 0);
}

kqueryParser::VersionContext* kqueryParser::VersionContext::version() {
  return getRuleContext<kqueryParser::VersionContext>(0);
}

kqueryParser::UpdateListContext* kqueryParser::VersionContext::updateList() {
  return getRuleContext<kqueryParser::UpdateListContext>(0);
}


size_t kqueryParser::VersionContext::getRuleIndex() const {
  return kqueryParser::RuleVersion;
}

void kqueryParser::VersionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVersion(this);
}

void kqueryParser::VersionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVersion(this);
}


antlrcpp::Any kqueryParser::VersionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitVersion(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::VersionContext* kqueryParser::version() {
  VersionContext *_localctx = _tracker.createInstance<VersionContext>(_ctx, getState());
  enterRule(_localctx, 40, kqueryParser::RuleVersion);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(278);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case kqueryParser::StartLetter: {
        enterOuterAlt(_localctx, 1);
        setState(271);
        identifier();
        break;
      }

      case kqueryParser::LeftBracket: {
        enterOuterAlt(_localctx, 2);
        setState(272);
        match(kqueryParser::LeftBracket);

        setState(273);
        updateList();
        setState(274);
        match(kqueryParser::RightBracket);
        setState(275);
        match(kqueryParser::T__48);
        setState(276);
        version();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UpdateListContext ------------------------------------------------------------------

kqueryParser::UpdateListContext::UpdateListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<kqueryParser::ExpressionContext *> kqueryParser::UpdateListContext::expression() {
  return getRuleContexts<kqueryParser::ExpressionContext>();
}

kqueryParser::ExpressionContext* kqueryParser::UpdateListContext::expression(size_t i) {
  return getRuleContext<kqueryParser::ExpressionContext>(i);
}

kqueryParser::UpdateListContext* kqueryParser::UpdateListContext::updateList() {
  return getRuleContext<kqueryParser::UpdateListContext>(0);
}


size_t kqueryParser::UpdateListContext::getRuleIndex() const {
  return kqueryParser::RuleUpdateList;
}

void kqueryParser::UpdateListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterUpdateList(this);
}

void kqueryParser::UpdateListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<kqueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitUpdateList(this);
}


antlrcpp::Any kqueryParser::UpdateListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<kqueryVisitor*>(visitor))
    return parserVisitor->visitUpdateList(this);
  else
    return visitor->visitChildren(this);
}

kqueryParser::UpdateListContext* kqueryParser::updateList() {
  UpdateListContext *_localctx = _tracker.createInstance<UpdateListContext>(_ctx, getState());
  enterRule(_localctx, 42, kqueryParser::RuleUpdateList);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(280);
    expression();
    setState(281);
    match(kqueryParser::T__3);
    setState(282);
    expression();

    setState(283);
    match(kqueryParser::T__38);
    setState(284);
    updateList();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> kqueryParser::_decisionToDFA;
atn::PredictionContextCache kqueryParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN kqueryParser::_atn;
std::vector<uint16_t> kqueryParser::_serializedATN;

std::vector<std::string> kqueryParser::_ruleNames = {
  "kqueryExpression", "arrayDeclaration", "arrayInitializer", "expression", 
  "bitwiseExpr", "comparisonExpr", "arithmeticExpr", "domain", "rangeLimit", 
  "arrName", "numberList", "number", "signedConstant", "decConstant", "binConstant", 
  "octConstant", "hexConstant", "identifier", "floatingPointType", "integerType", 
  "version", "updateList"
};

std::vector<std::string> kqueryParser::_literalNames = {
  "", "'array'", "':'", "'->'", "'='", "'symbolic'", "'Not'", "'Shl'", "'LShr'", 
  "'AShr'", "'Concat'", "'Extract'", "'ZExt'", "'SExt'", "'Read'", "'Select'", 
  "'Neg'", "'ReadLSB'", "'ReadMSB'", "'And'", "'Or'", "'Xor'", "'Eq'", "'Ne'", 
  "'Ult'", "'Ule'", "'Ugt'", "'Uge'", "'Slt'", "'Sle'", "'Sgt'", "'Sge'", 
  "'Add'", "'Sub'", "'Mul'", "'UDiv'", "'URem'", "'SDiv'", "'SRem'", "','", 
  "'true'", "'false'", "'+'", "'-'", "'0b'", "'0o'", "'0x'", "'fp'", "'i'", 
  "'@'", "'w(0-9)+'", "'('", "')'", "'['", "']'", "'{'", "'}'"
};

std::vector<std::string> kqueryParser::_symbolicNames = {
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 
  "", "", "", "", "", "", "", "", "", "", "", "", "", "", "TYPE", "LeftParen", 
  "RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
  "HexExtend", "OctalExtend", "BinExtend", "Digit", "StartLetter", "AlphaNumericSpl"
};

dfa::Vocabulary kqueryParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> kqueryParser::_tokenNames;

kqueryParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  static const uint16_t serializedATNSegment0[] = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
       0x3, 0x40, 0x121, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
       0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 
       0x7, 0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 
       0x4, 0xb, 0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 
       0xe, 0x9, 0xe, 0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 
       0x9, 0x11, 0x4, 0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 
       0x9, 0x14, 0x4, 0x15, 0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 
       0x9, 0x17, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
       0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
       0x3, 0x3, 0x3, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 
       0x4, 0x5, 0x4, 0x42, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 
       0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 
       0x5, 0x3, 0x5, 0x5, 0x5, 0xbe, 0xa, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 
       0x7, 0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0xa, 
       0x3, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
       0xc, 0x3, 0xc, 0x5, 0xc, 0xd1, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 
       0xd, 0x5, 0xd, 0xd6, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 
       0xe, 0x3, 0xe, 0x5, 0xe, 0xdd, 0xa, 0xe, 0x3, 0xf, 0x6, 0xf, 0xe0, 
       0xa, 0xf, 0xd, 0xf, 0xe, 0xf, 0xe1, 0x3, 0x10, 0x3, 0x10, 0x6, 0x10, 
       0xe6, 0xa, 0x10, 0xd, 0x10, 0xe, 0x10, 0xe7, 0x3, 0x11, 0x3, 0x11, 
       0x6, 0x11, 0xec, 0xa, 0x11, 0xd, 0x11, 0xe, 0x11, 0xed, 0x3, 0x12, 
       0x3, 0x12, 0x6, 0x12, 0xf2, 0xa, 0x12, 0xd, 0x12, 0xe, 0x12, 0xf3, 
       0x3, 0x13, 0x3, 0x13, 0x7, 0x13, 0xf8, 0xa, 0x13, 0xc, 0x13, 0xe, 
       0x13, 0xfb, 0xb, 0x13, 0x3, 0x14, 0x3, 0x14, 0x6, 0x14, 0xff, 0xa, 
       0x14, 0xd, 0x14, 0xe, 0x14, 0x100, 0x3, 0x14, 0x3, 0x14, 0x7, 0x14, 
       0x105, 0xa, 0x14, 0xc, 0x14, 0xe, 0x14, 0x108, 0xb, 0x14, 0x5, 0x14, 
       0x10a, 0xa, 0x14, 0x3, 0x15, 0x3, 0x15, 0x6, 0x15, 0x10e, 0xa, 0x15, 
       0xd, 0x15, 0xe, 0x15, 0x10f, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 
       0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x5, 0x16, 0x119, 0xa, 0x16, 
       0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 
       0x3, 0x17, 0x3, 0x106, 0x2, 0x18, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 
       0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 0x24, 
       0x26, 0x28, 0x2a, 0x2c, 0x2, 0x6, 0x4, 0x2, 0x9, 0xb, 0x15, 0x17, 
       0x3, 0x2, 0x18, 0x21, 0x3, 0x2, 0x22, 0x28, 0x3, 0x2, 0x2c, 0x2d, 
       0x2, 0x12e, 0x2, 0x2e, 0x3, 0x2, 0x2, 0x2, 0x4, 0x30, 0x3, 0x2, 0x2, 
       0x2, 0x6, 0x41, 0x3, 0x2, 0x2, 0x2, 0x8, 0xbd, 0x3, 0x2, 0x2, 0x2, 
       0xa, 0xbf, 0x3, 0x2, 0x2, 0x2, 0xc, 0xc1, 0x3, 0x2, 0x2, 0x2, 0xe, 
       0xc3, 0x3, 0x2, 0x2, 0x2, 0x10, 0xc5, 0x3, 0x2, 0x2, 0x2, 0x12, 0xc7, 
       0x3, 0x2, 0x2, 0x2, 0x14, 0xc9, 0x3, 0x2, 0x2, 0x2, 0x16, 0xd0, 0x3, 
       0x2, 0x2, 0x2, 0x18, 0xd5, 0x3, 0x2, 0x2, 0x2, 0x1a, 0xd7, 0x3, 0x2, 
       0x2, 0x2, 0x1c, 0xdf, 0x3, 0x2, 0x2, 0x2, 0x1e, 0xe3, 0x3, 0x2, 0x2, 
       0x2, 0x20, 0xe9, 0x3, 0x2, 0x2, 0x2, 0x22, 0xef, 0x3, 0x2, 0x2, 0x2, 
       0x24, 0xf5, 0x3, 0x2, 0x2, 0x2, 0x26, 0xfc, 0x3, 0x2, 0x2, 0x2, 0x28, 
       0x10b, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x118, 0x3, 0x2, 0x2, 0x2, 0x2c, 
       0x11a, 0x3, 0x2, 0x2, 0x2, 0x2e, 0x2f, 0x5, 0x4, 0x3, 0x2, 0x2f, 
       0x3, 0x3, 0x2, 0x2, 0x2, 0x30, 0x31, 0x7, 0x3, 0x2, 0x2, 0x31, 0x32, 
       0x5, 0x14, 0xb, 0x2, 0x32, 0x33, 0x7, 0x37, 0x2, 0x2, 0x33, 0x34, 
       0x5, 0x1c, 0xf, 0x2, 0x34, 0x35, 0x7, 0x38, 0x2, 0x2, 0x35, 0x36, 
       0x7, 0x4, 0x2, 0x2, 0x36, 0x37, 0x5, 0x10, 0x9, 0x2, 0x37, 0x38, 
       0x7, 0x5, 0x2, 0x2, 0x38, 0x39, 0x5, 0x12, 0xa, 0x2, 0x39, 0x3a, 
       0x7, 0x6, 0x2, 0x2, 0x3a, 0x3b, 0x5, 0x6, 0x4, 0x2, 0x3b, 0x5, 0x3, 
       0x2, 0x2, 0x2, 0x3c, 0x42, 0x7, 0x7, 0x2, 0x2, 0x3d, 0x3e, 0x7, 0x37, 
       0x2, 0x2, 0x3e, 0x3f, 0x5, 0x16, 0xc, 0x2, 0x3f, 0x40, 0x7, 0x38, 
       0x2, 0x2, 0x40, 0x42, 0x3, 0x2, 0x2, 0x2, 0x41, 0x3c, 0x3, 0x2, 0x2, 
       0x2, 0x41, 0x3d, 0x3, 0x2, 0x2, 0x2, 0x42, 0x7, 0x3, 0x2, 0x2, 0x2, 
       0x43, 0xbe, 0x5, 0x24, 0x13, 0x2, 0x44, 0x45, 0x5, 0x24, 0x13, 0x2, 
       0x45, 0x46, 0x7, 0x4, 0x2, 0x2, 0x46, 0x47, 0x5, 0x8, 0x5, 0x2, 0x47, 
       0xbe, 0x3, 0x2, 0x2, 0x2, 0x48, 0xbe, 0x5, 0x18, 0xd, 0x2, 0x49, 
       0x4a, 0x7, 0x35, 0x2, 0x2, 0x4a, 0x4b, 0x7, 0x34, 0x2, 0x2, 0x4b, 
       0x4c, 0x5, 0x18, 0xd, 0x2, 0x4c, 0x4d, 0x7, 0x36, 0x2, 0x2, 0x4d, 
       0xbe, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x4f, 0x7, 0x35, 0x2, 0x2, 0x4f, 
       0x50, 0x5, 0xe, 0x8, 0x2, 0x50, 0x51, 0x7, 0x34, 0x2, 0x2, 0x51, 
       0x52, 0x5, 0x8, 0x5, 0x2, 0x52, 0x53, 0x5, 0x8, 0x5, 0x2, 0x53, 0x54, 
       0x7, 0x36, 0x2, 0x2, 0x54, 0xbe, 0x3, 0x2, 0x2, 0x2, 0x55, 0x56, 
       0x7, 0x35, 0x2, 0x2, 0x56, 0x57, 0x7, 0x8, 0x2, 0x2, 0x57, 0x58, 
       0x7, 0x37, 0x2, 0x2, 0x58, 0x59, 0x7, 0x34, 0x2, 0x2, 0x59, 0x5a, 
       0x7, 0x38, 0x2, 0x2, 0x5a, 0x5b, 0x5, 0x8, 0x5, 0x2, 0x5b, 0x5c, 
       0x7, 0x36, 0x2, 0x2, 0x5c, 0xbe, 0x3, 0x2, 0x2, 0x2, 0x5d, 0x5e, 
       0x7, 0x35, 0x2, 0x2, 0x5e, 0x5f, 0x5, 0xa, 0x6, 0x2, 0x5f, 0x60, 
       0x7, 0x34, 0x2, 0x2, 0x60, 0x61, 0x5, 0x8, 0x5, 0x2, 0x61, 0x62, 
       0x5, 0x8, 0x5, 0x2, 0x62, 0x63, 0x7, 0x36, 0x2, 0x2, 0x63, 0xbe, 
       0x3, 0x2, 0x2, 0x2, 0x64, 0x65, 0x7, 0x35, 0x2, 0x2, 0x65, 0x66, 
       0x7, 0x9, 0x2, 0x2, 0x66, 0x67, 0x7, 0x34, 0x2, 0x2, 0x67, 0x68, 
       0x5, 0x8, 0x5, 0x2, 0x68, 0x69, 0x5, 0x8, 0x5, 0x2, 0x69, 0x6a, 0x7, 
       0x36, 0x2, 0x2, 0x6a, 0xbe, 0x3, 0x2, 0x2, 0x2, 0x6b, 0x6c, 0x7, 
       0x35, 0x2, 0x2, 0x6c, 0x6d, 0x7, 0xa, 0x2, 0x2, 0x6d, 0x6e, 0x7, 
       0x34, 0x2, 0x2, 0x6e, 0x6f, 0x5, 0x8, 0x5, 0x2, 0x6f, 0x70, 0x5, 
       0x8, 0x5, 0x2, 0x70, 0x71, 0x7, 0x36, 0x2, 0x2, 0x71, 0xbe, 0x3, 
       0x2, 0x2, 0x2, 0x72, 0x73, 0x7, 0x35, 0x2, 0x2, 0x73, 0x74, 0x7, 
       0xb, 0x2, 0x2, 0x74, 0x75, 0x7, 0x34, 0x2, 0x2, 0x75, 0x76, 0x5, 
       0x8, 0x5, 0x2, 0x76, 0x77, 0x5, 0x8, 0x5, 0x2, 0x77, 0x78, 0x7, 0x36, 
       0x2, 0x2, 0x78, 0xbe, 0x3, 0x2, 0x2, 0x2, 0x79, 0x7a, 0x7, 0x35, 
       0x2, 0x2, 0x7a, 0x7b, 0x5, 0xc, 0x7, 0x2, 0x7b, 0x7c, 0x7, 0x34, 
       0x2, 0x2, 0x7c, 0x7d, 0x5, 0x8, 0x5, 0x2, 0x7d, 0x7e, 0x5, 0x8, 0x5, 
       0x2, 0x7e, 0x7f, 0x7, 0x36, 0x2, 0x2, 0x7f, 0xbe, 0x3, 0x2, 0x2, 
       0x2, 0x80, 0x81, 0x7, 0x35, 0x2, 0x2, 0x81, 0x82, 0x7, 0xc, 0x2, 
       0x2, 0x82, 0x83, 0x7, 0x34, 0x2, 0x2, 0x83, 0x84, 0x5, 0x8, 0x5, 
       0x2, 0x84, 0x85, 0x5, 0x8, 0x5, 0x2, 0x85, 0x86, 0x7, 0x36, 0x2, 
       0x2, 0x86, 0xbe, 0x3, 0x2, 0x2, 0x2, 0x87, 0x88, 0x7, 0x35, 0x2, 
       0x2, 0x88, 0x89, 0x7, 0xd, 0x2, 0x2, 0x89, 0x8a, 0x7, 0x34, 0x2, 
       0x2, 0x8a, 0x8b, 0x5, 0x18, 0xd, 0x2, 0x8b, 0x8c, 0x5, 0x8, 0x5, 
       0x2, 0x8c, 0x8d, 0x7, 0x36, 0x2, 0x2, 0x8d, 0xbe, 0x3, 0x2, 0x2, 
       0x2, 0x8e, 0x8f, 0x7, 0x35, 0x2, 0x2, 0x8f, 0x90, 0x7, 0xe, 0x2, 
       0x2, 0x90, 0x91, 0x7, 0x34, 0x2, 0x2, 0x91, 0x92, 0x5, 0x8, 0x5, 
       0x2, 0x92, 0x93, 0x7, 0x36, 0x2, 0x2, 0x93, 0xbe, 0x3, 0x2, 0x2, 
       0x2, 0x94, 0x95, 0x7, 0x35, 0x2, 0x2, 0x95, 0x96, 0x7, 0xf, 0x2, 
       0x2, 0x96, 0x97, 0x7, 0x34, 0x2, 0x2, 0x97, 0x98, 0x5, 0x8, 0x5, 
       0x2, 0x98, 0x99, 0x7, 0x36, 0x2, 0x2, 0x99, 0xbe, 0x3, 0x2, 0x2, 
       0x2, 0x9a, 0x9b, 0x7, 0x35, 0x2, 0x2, 0x9b, 0x9c, 0x7, 0x10, 0x2, 
       0x2, 0x9c, 0x9d, 0x7, 0x34, 0x2, 0x2, 0x9d, 0x9e, 0x5, 0x8, 0x5, 
       0x2, 0x9e, 0x9f, 0x5, 0x2a, 0x16, 0x2, 0x9f, 0xa0, 0x7, 0x36, 0x2, 
       0x2, 0xa0, 0xbe, 0x3, 0x2, 0x2, 0x2, 0xa1, 0xa2, 0x7, 0x35, 0x2, 
       0x2, 0xa2, 0xa3, 0x7, 0x11, 0x2, 0x2, 0xa3, 0xa4, 0x7, 0x34, 0x2, 
       0x2, 0xa4, 0xa5, 0x5, 0x8, 0x5, 0x2, 0xa5, 0xa6, 0x5, 0x8, 0x5, 0x2, 
       0xa6, 0xa7, 0x5, 0x8, 0x5, 0x2, 0xa7, 0xa8, 0x7, 0x36, 0x2, 0x2, 
       0xa8, 0xbe, 0x3, 0x2, 0x2, 0x2, 0xa9, 0xaa, 0x7, 0x35, 0x2, 0x2, 
       0xaa, 0xab, 0x7, 0x12, 0x2, 0x2, 0xab, 0xac, 0x7, 0x34, 0x2, 0x2, 
       0xac, 0xad, 0x5, 0x8, 0x5, 0x2, 0xad, 0xae, 0x7, 0x36, 0x2, 0x2, 
       0xae, 0xbe, 0x3, 0x2, 0x2, 0x2, 0xaf, 0xb0, 0x7, 0x35, 0x2, 0x2, 
       0xb0, 0xb1, 0x7, 0x13, 0x2, 0x2, 0xb1, 0xb2, 0x7, 0x34, 0x2, 0x2, 
       0xb2, 0xb3, 0x5, 0x8, 0x5, 0x2, 0xb3, 0xb4, 0x5, 0x2a, 0x16, 0x2, 
       0xb4, 0xb5, 0x7, 0x36, 0x2, 0x2, 0xb5, 0xbe, 0x3, 0x2, 0x2, 0x2, 
       0xb6, 0xb7, 0x7, 0x35, 0x2, 0x2, 0xb7, 0xb8, 0x7, 0x14, 0x2, 0x2, 
       0xb8, 0xb9, 0x7, 0x34, 0x2, 0x2, 0xb9, 0xba, 0x5, 0x8, 0x5, 0x2, 
       0xba, 0xbb, 0x5, 0x2a, 0x16, 0x2, 0xbb, 0xbc, 0x7, 0x36, 0x2, 0x2, 
       0xbc, 0xbe, 0x3, 0x2, 0x2, 0x2, 0xbd, 0x43, 0x3, 0x2, 0x2, 0x2, 0xbd, 
       0x44, 0x3, 0x2, 0x2, 0x2, 0xbd, 0x48, 0x3, 0x2, 0x2, 0x2, 0xbd, 0x49, 
       0x3, 0x2, 0x2, 0x2, 0xbd, 0x4e, 0x3, 0x2, 0x2, 0x2, 0xbd, 0x55, 0x3, 
       0x2, 0x2, 0x2, 0xbd, 0x5d, 0x3, 0x2, 0x2, 0x2, 0xbd, 0x64, 0x3, 0x2, 
       0x2, 0x2, 0xbd, 0x6b, 0x3, 0x2, 0x2, 0x2, 0xbd, 0x72, 0x3, 0x2, 0x2, 
       0x2, 0xbd, 0x79, 0x3, 0x2, 0x2, 0x2, 0xbd, 0x80, 0x3, 0x2, 0x2, 0x2, 
       0xbd, 0x87, 0x3, 0x2, 0x2, 0x2, 0xbd, 0x8e, 0x3, 0x2, 0x2, 0x2, 0xbd, 
       0x94, 0x3, 0x2, 0x2, 0x2, 0xbd, 0x9a, 0x3, 0x2, 0x2, 0x2, 0xbd, 0xa1, 
       0x3, 0x2, 0x2, 0x2, 0xbd, 0xa9, 0x3, 0x2, 0x2, 0x2, 0xbd, 0xaf, 0x3, 
       0x2, 0x2, 0x2, 0xbd, 0xb6, 0x3, 0x2, 0x2, 0x2, 0xbe, 0x9, 0x3, 0x2, 
       0x2, 0x2, 0xbf, 0xc0, 0x9, 0x2, 0x2, 0x2, 0xc0, 0xb, 0x3, 0x2, 0x2, 
       0x2, 0xc1, 0xc2, 0x9, 0x3, 0x2, 0x2, 0xc2, 0xd, 0x3, 0x2, 0x2, 0x2, 
       0xc3, 0xc4, 0x9, 0x4, 0x2, 0x2, 0xc4, 0xf, 0x3, 0x2, 0x2, 0x2, 0xc5, 
       0xc6, 0x7, 0x34, 0x2, 0x2, 0xc6, 0x11, 0x3, 0x2, 0x2, 0x2, 0xc7, 
       0xc8, 0x7, 0x34, 0x2, 0x2, 0xc8, 0x13, 0x3, 0x2, 0x2, 0x2, 0xc9, 
       0xca, 0x5, 0x24, 0x13, 0x2, 0xca, 0x15, 0x3, 0x2, 0x2, 0x2, 0xcb, 
       0xd1, 0x5, 0x18, 0xd, 0x2, 0xcc, 0xcd, 0x5, 0x18, 0xd, 0x2, 0xcd, 
       0xce, 0x7, 0x29, 0x2, 0x2, 0xce, 0xcf, 0x5, 0x16, 0xc, 0x2, 0xcf, 
       0xd1, 0x3, 0x2, 0x2, 0x2, 0xd0, 0xcb, 0x3, 0x2, 0x2, 0x2, 0xd0, 0xcc, 
       0x3, 0x2, 0x2, 0x2, 0xd1, 0x17, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xd6, 0x7, 
       0x2a, 0x2, 0x2, 0xd3, 0xd6, 0x7, 0x2b, 0x2, 0x2, 0xd4, 0xd6, 0x5, 
       0x1a, 0xe, 0x2, 0xd5, 0xd2, 0x3, 0x2, 0x2, 0x2, 0xd5, 0xd3, 0x3, 
       0x2, 0x2, 0x2, 0xd5, 0xd4, 0x3, 0x2, 0x2, 0x2, 0xd6, 0x19, 0x3, 0x2, 
       0x2, 0x2, 0xd7, 0xdc, 0x9, 0x5, 0x2, 0x2, 0xd8, 0xdd, 0x5, 0x1c, 
       0xf, 0x2, 0xd9, 0xdd, 0x5, 0x1e, 0x10, 0x2, 0xda, 0xdd, 0x5, 0x20, 
       0x11, 0x2, 0xdb, 0xdd, 0x5, 0x22, 0x12, 0x2, 0xdc, 0xd8, 0x3, 0x2, 
       0x2, 0x2, 0xdc, 0xd9, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xda, 0x3, 0x2, 0x2, 
       0x2, 0xdc, 0xdb, 0x3, 0x2, 0x2, 0x2, 0xdd, 0x1b, 0x3, 0x2, 0x2, 0x2, 
       0xde, 0xe0, 0x7, 0x3e, 0x2, 0x2, 0xdf, 0xde, 0x3, 0x2, 0x2, 0x2, 
       0xe0, 0xe1, 0x3, 0x2, 0x2, 0x2, 0xe1, 0xdf, 0x3, 0x2, 0x2, 0x2, 0xe1, 
       0xe2, 0x3, 0x2, 0x2, 0x2, 0xe2, 0x1d, 0x3, 0x2, 0x2, 0x2, 0xe3, 0xe5, 
       0x7, 0x2e, 0x2, 0x2, 0xe4, 0xe6, 0x7, 0x3d, 0x2, 0x2, 0xe5, 0xe4, 
       0x3, 0x2, 0x2, 0x2, 0xe6, 0xe7, 0x3, 0x2, 0x2, 0x2, 0xe7, 0xe5, 0x3, 
       0x2, 0x2, 0x2, 0xe7, 0xe8, 0x3, 0x2, 0x2, 0x2, 0xe8, 0x1f, 0x3, 0x2, 
       0x2, 0x2, 0xe9, 0xeb, 0x7, 0x2f, 0x2, 0x2, 0xea, 0xec, 0x7, 0x3c, 
       0x2, 0x2, 0xeb, 0xea, 0x3, 0x2, 0x2, 0x2, 0xec, 0xed, 0x3, 0x2, 0x2, 
       0x2, 0xed, 0xeb, 0x3, 0x2, 0x2, 0x2, 0xed, 0xee, 0x3, 0x2, 0x2, 0x2, 
       0xee, 0x21, 0x3, 0x2, 0x2, 0x2, 0xef, 0xf1, 0x7, 0x30, 0x2, 0x2, 
       0xf0, 0xf2, 0x7, 0x3b, 0x2, 0x2, 0xf1, 0xf0, 0x3, 0x2, 0x2, 0x2, 
       0xf2, 0xf3, 0x3, 0x2, 0x2, 0x2, 0xf3, 0xf1, 0x3, 0x2, 0x2, 0x2, 0xf3, 
       0xf4, 0x3, 0x2, 0x2, 0x2, 0xf4, 0x23, 0x3, 0x2, 0x2, 0x2, 0xf5, 0xf9, 
       0x7, 0x3f, 0x2, 0x2, 0xf6, 0xf8, 0x7, 0x40, 0x2, 0x2, 0xf7, 0xf6, 
       0x3, 0x2, 0x2, 0x2, 0xf8, 0xfb, 0x3, 0x2, 0x2, 0x2, 0xf9, 0xf7, 0x3, 
       0x2, 0x2, 0x2, 0xf9, 0xfa, 0x3, 0x2, 0x2, 0x2, 0xfa, 0x25, 0x3, 0x2, 
       0x2, 0x2, 0xfb, 0xf9, 0x3, 0x2, 0x2, 0x2, 0xfc, 0xfe, 0x7, 0x31, 
       0x2, 0x2, 0xfd, 0xff, 0x7, 0x3e, 0x2, 0x2, 0xfe, 0xfd, 0x3, 0x2, 
       0x2, 0x2, 0xff, 0x100, 0x3, 0x2, 0x2, 0x2, 0x100, 0xfe, 0x3, 0x2, 
       0x2, 0x2, 0x100, 0x101, 0x3, 0x2, 0x2, 0x2, 0x101, 0x109, 0x3, 0x2, 
       0x2, 0x2, 0x102, 0x106, 0xb, 0x2, 0x2, 0x2, 0x103, 0x105, 0xb, 0x2, 
       0x2, 0x2, 0x104, 0x103, 0x3, 0x2, 0x2, 0x2, 0x105, 0x108, 0x3, 0x2, 
       0x2, 0x2, 0x106, 0x107, 0x3, 0x2, 0x2, 0x2, 0x106, 0x104, 0x3, 0x2, 
       0x2, 0x2, 0x107, 0x10a, 0x3, 0x2, 0x2, 0x2, 0x108, 0x106, 0x3, 0x2, 
       0x2, 0x2, 0x109, 0x102, 0x3, 0x2, 0x2, 0x2, 0x109, 0x10a, 0x3, 0x2, 
       0x2, 0x2, 0x10a, 0x27, 0x3, 0x2, 0x2, 0x2, 0x10b, 0x10d, 0x7, 0x32, 
       0x2, 0x2, 0x10c, 0x10e, 0x7, 0x3e, 0x2, 0x2, 0x10d, 0x10c, 0x3, 0x2, 
       0x2, 0x2, 0x10e, 0x10f, 0x3, 0x2, 0x2, 0x2, 0x10f, 0x10d, 0x3, 0x2, 
       0x2, 0x2, 0x10f, 0x110, 0x3, 0x2, 0x2, 0x2, 0x110, 0x29, 0x3, 0x2, 
       0x2, 0x2, 0x111, 0x119, 0x5, 0x24, 0x13, 0x2, 0x112, 0x113, 0x7, 
       0x37, 0x2, 0x2, 0x113, 0x114, 0x5, 0x2c, 0x17, 0x2, 0x114, 0x115, 
       0x7, 0x38, 0x2, 0x2, 0x115, 0x116, 0x7, 0x33, 0x2, 0x2, 0x116, 0x117, 
       0x5, 0x2a, 0x16, 0x2, 0x117, 0x119, 0x3, 0x2, 0x2, 0x2, 0x118, 0x111, 
       0x3, 0x2, 0x2, 0x2, 0x118, 0x112, 0x3, 0x2, 0x2, 0x2, 0x119, 0x2b, 
       0x3, 0x2, 0x2, 0x2, 0x11a, 0x11b, 0x5, 0x8, 0x5, 0x2, 0x11b, 0x11c, 
       0x7, 0x6, 0x2, 0x2, 0x11c, 0x11d, 0x5, 0x8, 0x5, 0x2, 0x11d, 0x11e, 
       0x7, 0x29, 0x2, 0x2, 0x11e, 0x11f, 0x5, 0x2c, 0x17, 0x2, 0x11f, 0x2d, 
       0x3, 0x2, 0x2, 0x2, 0x11, 0x41, 0xbd, 0xd0, 0xd5, 0xdc, 0xe1, 0xe7, 
       0xed, 0xf3, 0xf9, 0x100, 0x106, 0x109, 0x10f, 0x118, 
  };

  _serializedATN.insert(_serializedATN.end(), serializedATNSegment0,
    serializedATNSegment0 + sizeof(serializedATNSegment0) / sizeof(serializedATNSegment0[0]));


  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

kqueryParser::Initializer kqueryParser::_init;
