
// Generated from kquery.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"
#include "kqueryParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by kqueryParser.
 */
class  kqueryListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterKqueryExpression(kqueryParser::KqueryExpressionContext *ctx) = 0;
  virtual void exitKqueryExpression(kqueryParser::KqueryExpressionContext *ctx) = 0;

  virtual void enterArrayDeclaration(kqueryParser::ArrayDeclarationContext *ctx) = 0;
  virtual void exitArrayDeclaration(kqueryParser::ArrayDeclarationContext *ctx) = 0;

  virtual void enterArrayInitializer(kqueryParser::ArrayInitializerContext *ctx) = 0;
  virtual void exitArrayInitializer(kqueryParser::ArrayInitializerContext *ctx) = 0;

  virtual void enterExpression(kqueryParser::ExpressionContext *ctx) = 0;
  virtual void exitExpression(kqueryParser::ExpressionContext *ctx) = 0;

  virtual void enterBitwiseExpr(kqueryParser::BitwiseExprContext *ctx) = 0;
  virtual void exitBitwiseExpr(kqueryParser::BitwiseExprContext *ctx) = 0;

  virtual void enterComparisonExpr(kqueryParser::ComparisonExprContext *ctx) = 0;
  virtual void exitComparisonExpr(kqueryParser::ComparisonExprContext *ctx) = 0;

  virtual void enterArithmeticExpr(kqueryParser::ArithmeticExprContext *ctx) = 0;
  virtual void exitArithmeticExpr(kqueryParser::ArithmeticExprContext *ctx) = 0;

  virtual void enterDomain(kqueryParser::DomainContext *ctx) = 0;
  virtual void exitDomain(kqueryParser::DomainContext *ctx) = 0;

  virtual void enterRangeLimit(kqueryParser::RangeLimitContext *ctx) = 0;
  virtual void exitRangeLimit(kqueryParser::RangeLimitContext *ctx) = 0;

  virtual void enterArrName(kqueryParser::ArrNameContext *ctx) = 0;
  virtual void exitArrName(kqueryParser::ArrNameContext *ctx) = 0;

  virtual void enterNumberList(kqueryParser::NumberListContext *ctx) = 0;
  virtual void exitNumberList(kqueryParser::NumberListContext *ctx) = 0;

  virtual void enterNumber(kqueryParser::NumberContext *ctx) = 0;
  virtual void exitNumber(kqueryParser::NumberContext *ctx) = 0;

  virtual void enterSignedConstant(kqueryParser::SignedConstantContext *ctx) = 0;
  virtual void exitSignedConstant(kqueryParser::SignedConstantContext *ctx) = 0;

  virtual void enterDecConstant(kqueryParser::DecConstantContext *ctx) = 0;
  virtual void exitDecConstant(kqueryParser::DecConstantContext *ctx) = 0;

  virtual void enterBinConstant(kqueryParser::BinConstantContext *ctx) = 0;
  virtual void exitBinConstant(kqueryParser::BinConstantContext *ctx) = 0;

  virtual void enterOctConstant(kqueryParser::OctConstantContext *ctx) = 0;
  virtual void exitOctConstant(kqueryParser::OctConstantContext *ctx) = 0;

  virtual void enterHexConstant(kqueryParser::HexConstantContext *ctx) = 0;
  virtual void exitHexConstant(kqueryParser::HexConstantContext *ctx) = 0;

  virtual void enterIdentifier(kqueryParser::IdentifierContext *ctx) = 0;
  virtual void exitIdentifier(kqueryParser::IdentifierContext *ctx) = 0;

  virtual void enterFloatingPointType(kqueryParser::FloatingPointTypeContext *ctx) = 0;
  virtual void exitFloatingPointType(kqueryParser::FloatingPointTypeContext *ctx) = 0;

  virtual void enterIntegerType(kqueryParser::IntegerTypeContext *ctx) = 0;
  virtual void exitIntegerType(kqueryParser::IntegerTypeContext *ctx) = 0;

  virtual void enterVersion(kqueryParser::VersionContext *ctx) = 0;
  virtual void exitVersion(kqueryParser::VersionContext *ctx) = 0;

  virtual void enterUpdateList(kqueryParser::UpdateListContext *ctx) = 0;
  virtual void exitUpdateList(kqueryParser::UpdateListContext *ctx) = 0;


};

