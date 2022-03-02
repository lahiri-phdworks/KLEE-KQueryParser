
// Generated from kquery.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"
#include "kqueryParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by kqueryParser.
 */
class  kqueryVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by kqueryParser.
   */
    virtual antlrcpp::Any visitKqueryExpression(kqueryParser::KqueryExpressionContext *context) = 0;

    virtual antlrcpp::Any visitArrayDeclaration(kqueryParser::ArrayDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitArrayInitializer(kqueryParser::ArrayInitializerContext *context) = 0;

    virtual antlrcpp::Any visitExpression(kqueryParser::ExpressionContext *context) = 0;

    virtual antlrcpp::Any visitBitwiseExpr(kqueryParser::BitwiseExprContext *context) = 0;

    virtual antlrcpp::Any visitComparisonExpr(kqueryParser::ComparisonExprContext *context) = 0;

    virtual antlrcpp::Any visitArithmeticExpr(kqueryParser::ArithmeticExprContext *context) = 0;

    virtual antlrcpp::Any visitDomain(kqueryParser::DomainContext *context) = 0;

    virtual antlrcpp::Any visitRangeLimit(kqueryParser::RangeLimitContext *context) = 0;

    virtual antlrcpp::Any visitArrName(kqueryParser::ArrNameContext *context) = 0;

    virtual antlrcpp::Any visitNumberList(kqueryParser::NumberListContext *context) = 0;

    virtual antlrcpp::Any visitNumber(kqueryParser::NumberContext *context) = 0;

    virtual antlrcpp::Any visitSignedConstant(kqueryParser::SignedConstantContext *context) = 0;

    virtual antlrcpp::Any visitDecConstant(kqueryParser::DecConstantContext *context) = 0;

    virtual antlrcpp::Any visitBinConstant(kqueryParser::BinConstantContext *context) = 0;

    virtual antlrcpp::Any visitOctConstant(kqueryParser::OctConstantContext *context) = 0;

    virtual antlrcpp::Any visitHexConstant(kqueryParser::HexConstantContext *context) = 0;

    virtual antlrcpp::Any visitIdentifier(kqueryParser::IdentifierContext *context) = 0;

    virtual antlrcpp::Any visitFloatingPointType(kqueryParser::FloatingPointTypeContext *context) = 0;

    virtual antlrcpp::Any visitIntegerType(kqueryParser::IntegerTypeContext *context) = 0;

    virtual antlrcpp::Any visitVersion(kqueryParser::VersionContext *context) = 0;

    virtual antlrcpp::Any visitUpdateList(kqueryParser::UpdateListContext *context) = 0;


};

