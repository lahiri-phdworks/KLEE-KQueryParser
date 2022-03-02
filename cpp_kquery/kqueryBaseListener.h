
// Generated from kquery.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"
#include "kqueryListener.h"


/**
 * This class provides an empty implementation of kqueryListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  kqueryBaseListener : public kqueryListener {
public:

  virtual void enterKqueryExpression(kqueryParser::KqueryExpressionContext * /*ctx*/) override { }
  virtual void exitKqueryExpression(kqueryParser::KqueryExpressionContext * /*ctx*/) override { }

  virtual void enterArrayDeclaration(kqueryParser::ArrayDeclarationContext * /*ctx*/) override { }
  virtual void exitArrayDeclaration(kqueryParser::ArrayDeclarationContext * /*ctx*/) override { }

  virtual void enterArrayInitializer(kqueryParser::ArrayInitializerContext * /*ctx*/) override { }
  virtual void exitArrayInitializer(kqueryParser::ArrayInitializerContext * /*ctx*/) override { }

  virtual void enterExpression(kqueryParser::ExpressionContext * /*ctx*/) override { }
  virtual void exitExpression(kqueryParser::ExpressionContext * /*ctx*/) override { }

  virtual void enterBitwiseExpr(kqueryParser::BitwiseExprContext * /*ctx*/) override { }
  virtual void exitBitwiseExpr(kqueryParser::BitwiseExprContext * /*ctx*/) override { }

  virtual void enterComparisonExpr(kqueryParser::ComparisonExprContext * /*ctx*/) override { }
  virtual void exitComparisonExpr(kqueryParser::ComparisonExprContext * /*ctx*/) override { }

  virtual void enterArithmeticExpr(kqueryParser::ArithmeticExprContext * /*ctx*/) override { }
  virtual void exitArithmeticExpr(kqueryParser::ArithmeticExprContext * /*ctx*/) override { }

  virtual void enterDomain(kqueryParser::DomainContext * /*ctx*/) override { }
  virtual void exitDomain(kqueryParser::DomainContext * /*ctx*/) override { }

  virtual void enterRangeLimit(kqueryParser::RangeLimitContext * /*ctx*/) override { }
  virtual void exitRangeLimit(kqueryParser::RangeLimitContext * /*ctx*/) override { }

  virtual void enterArrName(kqueryParser::ArrNameContext * /*ctx*/) override { }
  virtual void exitArrName(kqueryParser::ArrNameContext * /*ctx*/) override { }

  virtual void enterNumberList(kqueryParser::NumberListContext * /*ctx*/) override { }
  virtual void exitNumberList(kqueryParser::NumberListContext * /*ctx*/) override { }

  virtual void enterNumber(kqueryParser::NumberContext * /*ctx*/) override { }
  virtual void exitNumber(kqueryParser::NumberContext * /*ctx*/) override { }

  virtual void enterSignedConstant(kqueryParser::SignedConstantContext * /*ctx*/) override { }
  virtual void exitSignedConstant(kqueryParser::SignedConstantContext * /*ctx*/) override { }

  virtual void enterDecConstant(kqueryParser::DecConstantContext * /*ctx*/) override { }
  virtual void exitDecConstant(kqueryParser::DecConstantContext * /*ctx*/) override { }

  virtual void enterBinConstant(kqueryParser::BinConstantContext * /*ctx*/) override { }
  virtual void exitBinConstant(kqueryParser::BinConstantContext * /*ctx*/) override { }

  virtual void enterOctConstant(kqueryParser::OctConstantContext * /*ctx*/) override { }
  virtual void exitOctConstant(kqueryParser::OctConstantContext * /*ctx*/) override { }

  virtual void enterHexConstant(kqueryParser::HexConstantContext * /*ctx*/) override { }
  virtual void exitHexConstant(kqueryParser::HexConstantContext * /*ctx*/) override { }

  virtual void enterIdentifier(kqueryParser::IdentifierContext * /*ctx*/) override { }
  virtual void exitIdentifier(kqueryParser::IdentifierContext * /*ctx*/) override { }

  virtual void enterFloatingPointType(kqueryParser::FloatingPointTypeContext * /*ctx*/) override { }
  virtual void exitFloatingPointType(kqueryParser::FloatingPointTypeContext * /*ctx*/) override { }

  virtual void enterIntegerType(kqueryParser::IntegerTypeContext * /*ctx*/) override { }
  virtual void exitIntegerType(kqueryParser::IntegerTypeContext * /*ctx*/) override { }

  virtual void enterVersion(kqueryParser::VersionContext * /*ctx*/) override { }
  virtual void exitVersion(kqueryParser::VersionContext * /*ctx*/) override { }

  virtual void enterUpdateList(kqueryParser::UpdateListContext * /*ctx*/) override { }
  virtual void exitUpdateList(kqueryParser::UpdateListContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

