
// Generated from kquery.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"
#include "kqueryVisitor.h"


/**
 * This class provides an empty implementation of kqueryVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  kqueryBaseVisitor : public kqueryVisitor {
public:

  virtual antlrcpp::Any visitKqueryExpression(kqueryParser::KqueryExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayDeclaration(kqueryParser::ArrayDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayInitializer(kqueryParser::ArrayInitializerContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitExpression(kqueryParser::ExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBitwiseExpr(kqueryParser::BitwiseExprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitComparisonExpr(kqueryParser::ComparisonExprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArithmeticExpr(kqueryParser::ArithmeticExprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitDomain(kqueryParser::DomainContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRangeLimit(kqueryParser::RangeLimitContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrName(kqueryParser::ArrNameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitNumberList(kqueryParser::NumberListContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitNumber(kqueryParser::NumberContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSignedConstant(kqueryParser::SignedConstantContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitDecConstant(kqueryParser::DecConstantContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBinConstant(kqueryParser::BinConstantContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitOctConstant(kqueryParser::OctConstantContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitHexConstant(kqueryParser::HexConstantContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIdentifier(kqueryParser::IdentifierContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFloatingPointType(kqueryParser::FloatingPointTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIntegerType(kqueryParser::IntegerTypeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitVersion(kqueryParser::VersionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUpdateList(kqueryParser::UpdateListContext *ctx) override {
    return visitChildren(ctx);
  }


};

