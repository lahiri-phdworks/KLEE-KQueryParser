// Code generated from KQuery.g4 by ANTLR 4.9.2. DO NOT EDIT.

package parser

import (
	"fmt"
	"unicode"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = unicode.IsLetter

var serializedLexerAtn = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 2, 73, 499,
	8, 1, 4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7,
	9, 7, 4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12,
	4, 13, 9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4,
	18, 9, 18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23,
	9, 23, 4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9,
	28, 4, 29, 9, 29, 4, 30, 9, 30, 4, 31, 9, 31, 4, 32, 9, 32, 4, 33, 9, 33,
	4, 34, 9, 34, 4, 35, 9, 35, 4, 36, 9, 36, 4, 37, 9, 37, 4, 38, 9, 38, 4,
	39, 9, 39, 4, 40, 9, 40, 4, 41, 9, 41, 4, 42, 9, 42, 4, 43, 9, 43, 4, 44,
	9, 44, 4, 45, 9, 45, 4, 46, 9, 46, 4, 47, 9, 47, 4, 48, 9, 48, 4, 49, 9,
	49, 4, 50, 9, 50, 4, 51, 9, 51, 4, 52, 9, 52, 4, 53, 9, 53, 4, 54, 9, 54,
	4, 55, 9, 55, 4, 56, 9, 56, 4, 57, 9, 57, 4, 58, 9, 58, 4, 59, 9, 59, 4,
	60, 9, 60, 4, 61, 9, 61, 4, 62, 9, 62, 4, 63, 9, 63, 4, 64, 9, 64, 4, 65,
	9, 65, 4, 66, 9, 66, 4, 67, 9, 67, 4, 68, 9, 68, 4, 69, 9, 69, 4, 70, 9,
	70, 4, 71, 9, 71, 4, 72, 9, 72, 4, 73, 9, 73, 4, 74, 9, 74, 4, 75, 9, 75,
	4, 76, 9, 76, 3, 2, 3, 2, 5, 2, 156, 10, 2, 3, 3, 3, 3, 5, 3, 160, 10,
	3, 3, 3, 3, 3, 3, 4, 6, 4, 165, 10, 4, 13, 4, 14, 4, 166, 3, 4, 3, 4, 3,
	4, 5, 4, 172, 10, 4, 3, 5, 3, 5, 6, 5, 176, 10, 5, 13, 5, 14, 5, 177, 3,
	6, 3, 6, 6, 6, 182, 10, 6, 13, 6, 14, 6, 183, 3, 7, 3, 7, 6, 7, 188, 10,
	7, 13, 7, 14, 7, 189, 3, 8, 3, 8, 3, 8, 3, 8, 7, 8, 196, 10, 8, 12, 8,
	14, 8, 199, 11, 8, 5, 8, 201, 10, 8, 3, 9, 3, 9, 6, 9, 205, 10, 9, 13,
	9, 14, 9, 206, 3, 10, 3, 10, 6, 10, 211, 10, 10, 13, 10, 14, 10, 212, 3,
	11, 3, 11, 3, 11, 3, 12, 3, 12, 3, 12, 3, 13, 3, 13, 3, 14, 3, 14, 3, 14,
	3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3, 16, 3, 16, 3, 16, 3, 16, 3, 16, 3,
	16, 3, 17, 3, 17, 3, 17, 3, 17, 3, 17, 3, 17, 3, 18, 3, 18, 3, 18, 3, 18,
	3, 18, 3, 18, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3, 19, 3,
	19, 3, 20, 3, 20, 3, 21, 3, 21, 3, 21, 3, 22, 3, 22, 3, 23, 3, 23, 3, 24,
	3, 24, 3, 24, 3, 24, 3, 25, 3, 25, 3, 25, 3, 25, 3, 26, 3, 26, 3, 26, 3,
	26, 3, 26, 3, 27, 3, 27, 3, 27, 3, 27, 3, 27, 3, 28, 3, 28, 3, 28, 3, 28,
	3, 28, 3, 28, 3, 28, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3, 29, 3,
	29, 3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31,
	3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 33, 3, 33, 3, 33, 3, 33, 3, 33, 3,
	33, 3, 33, 3, 34, 3, 34, 3, 34, 3, 34, 3, 35, 3, 35, 3, 35, 3, 35, 3, 35,
	3, 35, 3, 35, 3, 35, 3, 36, 3, 36, 3, 36, 3, 36, 3, 36, 3, 36, 3, 36, 3,
	36, 3, 37, 3, 37, 3, 38, 3, 38, 3, 39, 3, 39, 3, 40, 3, 40, 3, 40, 3, 41,
	3, 41, 3, 41, 3, 41, 3, 42, 3, 42, 3, 42, 3, 43, 3, 43, 3, 43, 3, 43, 3,
	44, 3, 44, 3, 44, 3, 45, 3, 45, 3, 45, 3, 46, 3, 46, 3, 46, 3, 46, 3, 47,
	3, 47, 3, 47, 3, 47, 3, 48, 3, 48, 3, 48, 3, 48, 3, 49, 3, 49, 3, 49, 3,
	49, 3, 50, 3, 50, 3, 50, 3, 50, 3, 51, 3, 51, 3, 51, 3, 51, 3, 52, 3, 52,
	3, 52, 3, 52, 3, 53, 3, 53, 3, 53, 3, 53, 3, 54, 3, 54, 3, 54, 3, 54, 3,
	55, 3, 55, 3, 55, 3, 55, 3, 56, 3, 56, 3, 56, 3, 56, 3, 57, 3, 57, 3, 57,
	3, 57, 3, 57, 3, 58, 3, 58, 3, 58, 3, 58, 3, 58, 3, 59, 3, 59, 3, 59, 3,
	59, 3, 59, 3, 60, 3, 60, 3, 60, 3, 60, 3, 60, 3, 61, 3, 61, 3, 62, 3, 62,
	3, 63, 3, 63, 3, 64, 3, 64, 3, 65, 3, 65, 7, 65, 442, 10, 65, 12, 65, 14,
	65, 445, 11, 65, 3, 66, 3, 66, 3, 67, 6, 67, 450, 10, 67, 13, 67, 14, 67,
	451, 3, 67, 3, 67, 3, 68, 3, 68, 5, 68, 458, 10, 68, 3, 68, 5, 68, 461,
	10, 68, 3, 68, 3, 68, 3, 69, 3, 69, 3, 69, 3, 69, 7, 69, 469, 10, 69, 12,
	69, 14, 69, 472, 11, 69, 3, 69, 3, 69, 3, 69, 3, 69, 3, 69, 3, 70, 3, 70,
	7, 70, 481, 10, 70, 12, 70, 14, 70, 484, 11, 70, 3, 70, 3, 70, 3, 71, 3,
	71, 3, 72, 3, 72, 3, 73, 3, 73, 3, 74, 3, 74, 3, 75, 3, 75, 3, 76, 3, 76,
	4, 197, 470, 2, 77, 3, 3, 5, 4, 7, 5, 9, 6, 11, 7, 13, 8, 15, 9, 17, 10,
	19, 11, 21, 12, 23, 13, 25, 14, 27, 15, 29, 16, 31, 17, 33, 18, 35, 19,
	37, 20, 39, 21, 41, 22, 43, 23, 45, 24, 47, 25, 49, 26, 51, 27, 53, 28,
	55, 29, 57, 30, 59, 31, 61, 32, 63, 33, 65, 34, 67, 35, 69, 36, 71, 37,
	73, 38, 75, 39, 77, 40, 79, 41, 81, 42, 83, 43, 85, 44, 87, 45, 89, 46,
	91, 47, 93, 48, 95, 49, 97, 50, 99, 51, 101, 52, 103, 53, 105, 54, 107,
	55, 109, 56, 111, 57, 113, 58, 115, 59, 117, 60, 119, 61, 121, 2, 123,
	2, 125, 2, 127, 2, 129, 62, 131, 63, 133, 64, 135, 65, 137, 66, 139, 67,
	141, 68, 143, 69, 145, 70, 147, 71, 149, 72, 151, 73, 3, 2, 9, 4, 2, 50,
	51, 97, 97, 4, 2, 50, 57, 97, 97, 6, 2, 50, 59, 67, 72, 97, 97, 99, 104,
	5, 2, 67, 92, 97, 97, 99, 124, 7, 2, 48, 48, 50, 59, 67, 92, 97, 97, 99,
	124, 4, 2, 11, 11, 34, 34, 4, 2, 12, 12, 15, 15, 2, 513, 2, 3, 3, 2, 2,
	2, 2, 5, 3, 2, 2, 2, 2, 7, 3, 2, 2, 2, 2, 9, 3, 2, 2, 2, 2, 11, 3, 2, 2,
	2, 2, 13, 3, 2, 2, 2, 2, 15, 3, 2, 2, 2, 2, 17, 3, 2, 2, 2, 2, 19, 3, 2,
	2, 2, 2, 21, 3, 2, 2, 2, 2, 23, 3, 2, 2, 2, 2, 25, 3, 2, 2, 2, 2, 27, 3,
	2, 2, 2, 2, 29, 3, 2, 2, 2, 2, 31, 3, 2, 2, 2, 2, 33, 3, 2, 2, 2, 2, 35,
	3, 2, 2, 2, 2, 37, 3, 2, 2, 2, 2, 39, 3, 2, 2, 2, 2, 41, 3, 2, 2, 2, 2,
	43, 3, 2, 2, 2, 2, 45, 3, 2, 2, 2, 2, 47, 3, 2, 2, 2, 2, 49, 3, 2, 2, 2,
	2, 51, 3, 2, 2, 2, 2, 53, 3, 2, 2, 2, 2, 55, 3, 2, 2, 2, 2, 57, 3, 2, 2,
	2, 2, 59, 3, 2, 2, 2, 2, 61, 3, 2, 2, 2, 2, 63, 3, 2, 2, 2, 2, 65, 3, 2,
	2, 2, 2, 67, 3, 2, 2, 2, 2, 69, 3, 2, 2, 2, 2, 71, 3, 2, 2, 2, 2, 73, 3,
	2, 2, 2, 2, 75, 3, 2, 2, 2, 2, 77, 3, 2, 2, 2, 2, 79, 3, 2, 2, 2, 2, 81,
	3, 2, 2, 2, 2, 83, 3, 2, 2, 2, 2, 85, 3, 2, 2, 2, 2, 87, 3, 2, 2, 2, 2,
	89, 3, 2, 2, 2, 2, 91, 3, 2, 2, 2, 2, 93, 3, 2, 2, 2, 2, 95, 3, 2, 2, 2,
	2, 97, 3, 2, 2, 2, 2, 99, 3, 2, 2, 2, 2, 101, 3, 2, 2, 2, 2, 103, 3, 2,
	2, 2, 2, 105, 3, 2, 2, 2, 2, 107, 3, 2, 2, 2, 2, 109, 3, 2, 2, 2, 2, 111,
	3, 2, 2, 2, 2, 113, 3, 2, 2, 2, 2, 115, 3, 2, 2, 2, 2, 117, 3, 2, 2, 2,
	2, 119, 3, 2, 2, 2, 2, 129, 3, 2, 2, 2, 2, 131, 3, 2, 2, 2, 2, 133, 3,
	2, 2, 2, 2, 135, 3, 2, 2, 2, 2, 137, 3, 2, 2, 2, 2, 139, 3, 2, 2, 2, 2,
	141, 3, 2, 2, 2, 2, 143, 3, 2, 2, 2, 2, 145, 3, 2, 2, 2, 2, 147, 3, 2,
	2, 2, 2, 149, 3, 2, 2, 2, 2, 151, 3, 2, 2, 2, 3, 155, 3, 2, 2, 2, 5, 159,
	3, 2, 2, 2, 7, 171, 3, 2, 2, 2, 9, 173, 3, 2, 2, 2, 11, 179, 3, 2, 2, 2,
	13, 185, 3, 2, 2, 2, 15, 191, 3, 2, 2, 2, 17, 202, 3, 2, 2, 2, 19, 208,
	3, 2, 2, 2, 21, 214, 3, 2, 2, 2, 23, 217, 3, 2, 2, 2, 25, 220, 3, 2, 2,
	2, 27, 222, 3, 2, 2, 2, 29, 225, 3, 2, 2, 2, 31, 230, 3, 2, 2, 2, 33, 236,
	3, 2, 2, 2, 35, 242, 3, 2, 2, 2, 37, 248, 3, 2, 2, 2, 39, 257, 3, 2, 2,
	2, 41, 259, 3, 2, 2, 2, 43, 262, 3, 2, 2, 2, 45, 264, 3, 2, 2, 2, 47, 266,
	3, 2, 2, 2, 49, 270, 3, 2, 2, 2, 51, 274, 3, 2, 2, 2, 53, 279, 3, 2, 2,
	2, 55, 284, 3, 2, 2, 2, 57, 291, 3, 2, 2, 2, 59, 299, 3, 2, 2, 2, 61, 304,
	3, 2, 2, 2, 63, 309, 3, 2, 2, 2, 65, 314, 3, 2, 2, 2, 67, 321, 3, 2, 2,
	2, 69, 325, 3, 2, 2, 2, 71, 333, 3, 2, 2, 2, 73, 341, 3, 2, 2, 2, 75, 343,
	3, 2, 2, 2, 77, 345, 3, 2, 2, 2, 79, 347, 3, 2, 2, 2, 81, 350, 3, 2, 2,
	2, 83, 354, 3, 2, 2, 2, 85, 357, 3, 2, 2, 2, 87, 361, 3, 2, 2, 2, 89, 364,
	3, 2, 2, 2, 91, 367, 3, 2, 2, 2, 93, 371, 3, 2, 2, 2, 95, 375, 3, 2, 2,
	2, 97, 379, 3, 2, 2, 2, 99, 383, 3, 2, 2, 2, 101, 387, 3, 2, 2, 2, 103,
	391, 3, 2, 2, 2, 105, 395, 3, 2, 2, 2, 107, 399, 3, 2, 2, 2, 109, 403,
	3, 2, 2, 2, 111, 407, 3, 2, 2, 2, 113, 411, 3, 2, 2, 2, 115, 416, 3, 2,
	2, 2, 117, 421, 3, 2, 2, 2, 119, 426, 3, 2, 2, 2, 121, 431, 3, 2, 2, 2,
	123, 433, 3, 2, 2, 2, 125, 435, 3, 2, 2, 2, 127, 437, 3, 2, 2, 2, 129,
	439, 3, 2, 2, 2, 131, 446, 3, 2, 2, 2, 133, 449, 3, 2, 2, 2, 135, 460,
	3, 2, 2, 2, 137, 464, 3, 2, 2, 2, 139, 478, 3, 2, 2, 2, 141, 487, 3, 2,
	2, 2, 143, 489, 3, 2, 2, 2, 145, 491, 3, 2, 2, 2, 147, 493, 3, 2, 2, 2,
	149, 495, 3, 2, 2, 2, 151, 497, 3, 2, 2, 2, 153, 156, 5, 29, 15, 2, 154,
	156, 5, 31, 16, 2, 155, 153, 3, 2, 2, 2, 155, 154, 3, 2, 2, 2, 156, 4,
	3, 2, 2, 2, 157, 160, 5, 73, 37, 2, 158, 160, 5, 75, 38, 2, 159, 157, 3,
	2, 2, 2, 159, 158, 3, 2, 2, 2, 160, 161, 3, 2, 2, 2, 161, 162, 5, 7, 4,
	2, 162, 6, 3, 2, 2, 2, 163, 165, 5, 121, 61, 2, 164, 163, 3, 2, 2, 2, 165,
	166, 3, 2, 2, 2, 166, 164, 3, 2, 2, 2, 166, 167, 3, 2, 2, 2, 167, 172,
	3, 2, 2, 2, 168, 172, 5, 9, 5, 2, 169, 172, 5, 11, 6, 2, 170, 172, 5, 13,
	7, 2, 171, 164, 3, 2, 2, 2, 171, 168, 3, 2, 2, 2, 171, 169, 3, 2, 2, 2,
	171, 170, 3, 2, 2, 2, 172, 8, 3, 2, 2, 2, 173, 175, 5, 21, 11, 2, 174,
	176, 5, 123, 62, 2, 175, 174, 3, 2, 2, 2, 176, 177, 3, 2, 2, 2, 177, 175,
	3, 2, 2, 2, 177, 178, 3, 2, 2, 2, 178, 10, 3, 2, 2, 2, 179, 181, 5, 23,
	12, 2, 180, 182, 5, 125, 63, 2, 181, 180, 3, 2, 2, 2, 182, 183, 3, 2, 2,
	2, 183, 181, 3, 2, 2, 2, 183, 184, 3, 2, 2, 2, 184, 12, 3, 2, 2, 2, 185,
	187, 5, 27, 14, 2, 186, 188, 5, 127, 64, 2, 187, 186, 3, 2, 2, 2, 188,
	189, 3, 2, 2, 2, 189, 187, 3, 2, 2, 2, 189, 190, 3, 2, 2, 2, 190, 14, 3,
	2, 2, 2, 191, 192, 5, 79, 40, 2, 192, 200, 5, 121, 61, 2, 193, 197, 11,
	2, 2, 2, 194, 196, 11, 2, 2, 2, 195, 194, 3, 2, 2, 2, 196, 199, 3, 2, 2,
	2, 197, 198, 3, 2, 2, 2, 197, 195, 3, 2, 2, 2, 198, 201, 3, 2, 2, 2, 199,
	197, 3, 2, 2, 2, 200, 193, 3, 2, 2, 2, 200, 201, 3, 2, 2, 2, 201, 16, 3,
	2, 2, 2, 202, 204, 5, 131, 66, 2, 203, 205, 5, 121, 61, 2, 204, 203, 3,
	2, 2, 2, 205, 206, 3, 2, 2, 2, 206, 204, 3, 2, 2, 2, 206, 207, 3, 2, 2,
	2, 207, 18, 3, 2, 2, 2, 208, 210, 5, 25, 13, 2, 209, 211, 5, 121, 61, 2,
	210, 209, 3, 2, 2, 2, 211, 212, 3, 2, 2, 2, 212, 210, 3, 2, 2, 2, 212,
	213, 3, 2, 2, 2, 213, 20, 3, 2, 2, 2, 214, 215, 7, 50, 2, 2, 215, 216,
	7, 100, 2, 2, 216, 22, 3, 2, 2, 2, 217, 218, 7, 50, 2, 2, 218, 219, 7,
	113, 2, 2, 219, 24, 3, 2, 2, 2, 220, 221, 7, 121, 2, 2, 221, 26, 3, 2,
	2, 2, 222, 223, 7, 50, 2, 2, 223, 224, 7, 122, 2, 2, 224, 28, 3, 2, 2,
	2, 225, 226, 7, 118, 2, 2, 226, 227, 7, 116, 2, 2, 227, 228, 7, 119, 2,
	2, 228, 229, 7, 103, 2, 2, 229, 30, 3, 2, 2, 2, 230, 231, 7, 104, 2, 2,
	231, 232, 7, 99, 2, 2, 232, 233, 7, 110, 2, 2, 233, 234, 7, 117, 2, 2,
	234, 235, 7, 103, 2, 2, 235, 32, 3, 2, 2, 2, 236, 237, 7, 115, 2, 2, 237,
	238, 7, 119, 2, 2, 238, 239, 7, 103, 2, 2, 239, 240, 7, 116, 2, 2, 240,
	241, 7, 123, 2, 2, 241, 34, 3, 2, 2, 2, 242, 243, 7, 99, 2, 2, 243, 244,
	7, 116, 2, 2, 244, 245, 7, 116, 2, 2, 245, 246, 7, 99, 2, 2, 246, 247,
	7, 123, 2, 2, 247, 36, 3, 2, 2, 2, 248, 249, 7, 117, 2, 2, 249, 250, 7,
	123, 2, 2, 250, 251, 7, 111, 2, 2, 251, 252, 7, 100, 2, 2, 252, 253, 7,
	113, 2, 2, 253, 254, 7, 110, 2, 2, 254, 255, 7, 107, 2, 2, 255, 256, 7,
	101, 2, 2, 256, 38, 3, 2, 2, 2, 257, 258, 7, 60, 2, 2, 258, 40, 3, 2, 2,
	2, 259, 260, 7, 47, 2, 2, 260, 261, 7, 64, 2, 2, 261, 42, 3, 2, 2, 2, 262,
	263, 7, 63, 2, 2, 263, 44, 3, 2, 2, 2, 264, 265, 7, 46, 2, 2, 265, 46,
	3, 2, 2, 2, 266, 267, 7, 80, 2, 2, 267, 268, 7, 113, 2, 2, 268, 269, 7,
	118, 2, 2, 269, 48, 3, 2, 2, 2, 270, 271, 7, 85, 2, 2, 271, 272, 7, 106,
	2, 2, 272, 273, 7, 110, 2, 2, 273, 50, 3, 2, 2, 2, 274, 275, 7, 78, 2,
	2, 275, 276, 7, 85, 2, 2, 276, 277, 7, 106, 2, 2, 277, 278, 7, 116, 2,
	2, 278, 52, 3, 2, 2, 2, 279, 280, 7, 67, 2, 2, 280, 281, 7, 85, 2, 2, 281,
	282, 7, 106, 2, 2, 282, 283, 7, 116, 2, 2, 283, 54, 3, 2, 2, 2, 284, 285,
	7, 69, 2, 2, 285, 286, 7, 113, 2, 2, 286, 287, 7, 112, 2, 2, 287, 288,
	7, 101, 2, 2, 288, 289, 7, 99, 2, 2, 289, 290, 7, 118, 2, 2, 290, 56, 3,
	2, 2, 2, 291, 292, 7, 71, 2, 2, 292, 293, 7, 122, 2, 2, 293, 294, 7, 118,
	2, 2, 294, 295, 7, 116, 2, 2, 295, 296, 7, 99, 2, 2, 296, 297, 7, 101,
	2, 2, 297, 298, 7, 118, 2, 2, 298, 58, 3, 2, 2, 2, 299, 300, 7, 92, 2,
	2, 300, 301, 7, 71, 2, 2, 301, 302, 7, 122, 2, 2, 302, 303, 7, 118, 2,
	2, 303, 60, 3, 2, 2, 2, 304, 305, 7, 85, 2, 2, 305, 306, 7, 71, 2, 2, 306,
	307, 7, 122, 2, 2, 307, 308, 7, 118, 2, 2, 308, 62, 3, 2, 2, 2, 309, 310,
	7, 84, 2, 2, 310, 311, 7, 103, 2, 2, 311, 312, 7, 99, 2, 2, 312, 313, 7,
	102, 2, 2, 313, 64, 3, 2, 2, 2, 314, 315, 7, 85, 2, 2, 315, 316, 7, 103,
	2, 2, 316, 317, 7, 110, 2, 2, 317, 318, 7, 103, 2, 2, 318, 319, 7, 101,
	2, 2, 319, 320, 7, 118, 2, 2, 320, 66, 3, 2, 2, 2, 321, 322, 7, 80, 2,
	2, 322, 323, 7, 103, 2, 2, 323, 324, 7, 105, 2, 2, 324, 68, 3, 2, 2, 2,
	325, 326, 7, 84, 2, 2, 326, 327, 7, 103, 2, 2, 327, 328, 7, 99, 2, 2, 328,
	329, 7, 102, 2, 2, 329, 330, 7, 78, 2, 2, 330, 331, 7, 85, 2, 2, 331, 332,
	7, 68, 2, 2, 332, 70, 3, 2, 2, 2, 333, 334, 7, 84, 2, 2, 334, 335, 7, 103,
	2, 2, 335, 336, 7, 99, 2, 2, 336, 337, 7, 102, 2, 2, 337, 338, 7, 79, 2,
	2, 338, 339, 7, 85, 2, 2, 339, 340, 7, 68, 2, 2, 340, 72, 3, 2, 2, 2, 341,
	342, 7, 45, 2, 2, 342, 74, 3, 2, 2, 2, 343, 344, 7, 47, 2, 2, 344, 76,
	3, 2, 2, 2, 345, 346, 7, 66, 2, 2, 346, 78, 3, 2, 2, 2, 347, 348, 7, 104,
	2, 2, 348, 349, 7, 114, 2, 2, 349, 80, 3, 2, 2, 2, 350, 351, 7, 67, 2,
	2, 351, 352, 7, 112, 2, 2, 352, 353, 7, 102, 2, 2, 353, 82, 3, 2, 2, 2,
	354, 355, 7, 81, 2, 2, 355, 356, 7, 116, 2, 2, 356, 84, 3, 2, 2, 2, 357,
	358, 7, 90, 2, 2, 358, 359, 7, 113, 2, 2, 359, 360, 7, 116, 2, 2, 360,
	86, 3, 2, 2, 2, 361, 362, 7, 71, 2, 2, 362, 363, 7, 115, 2, 2, 363, 88,
	3, 2, 2, 2, 364, 365, 7, 80, 2, 2, 365, 366, 7, 103, 2, 2, 366, 90, 3,
	2, 2, 2, 367, 368, 7, 87, 2, 2, 368, 369, 7, 110, 2, 2, 369, 370, 7, 118,
	2, 2, 370, 92, 3, 2, 2, 2, 371, 372, 7, 87, 2, 2, 372, 373, 7, 110, 2,
	2, 373, 374, 7, 103, 2, 2, 374, 94, 3, 2, 2, 2, 375, 376, 7, 87, 2, 2,
	376, 377, 7, 105, 2, 2, 377, 378, 7, 118, 2, 2, 378, 96, 3, 2, 2, 2, 379,
	380, 7, 87, 2, 2, 380, 381, 7, 105, 2, 2, 381, 382, 7, 103, 2, 2, 382,
	98, 3, 2, 2, 2, 383, 384, 7, 85, 2, 2, 384, 385, 7, 110, 2, 2, 385, 386,
	7, 118, 2, 2, 386, 100, 3, 2, 2, 2, 387, 388, 7, 85, 2, 2, 388, 389, 7,
	110, 2, 2, 389, 390, 7, 103, 2, 2, 390, 102, 3, 2, 2, 2, 391, 392, 7, 85,
	2, 2, 392, 393, 7, 105, 2, 2, 393, 394, 7, 118, 2, 2, 394, 104, 3, 2, 2,
	2, 395, 396, 7, 85, 2, 2, 396, 397, 7, 105, 2, 2, 397, 398, 7, 103, 2,
	2, 398, 106, 3, 2, 2, 2, 399, 400, 7, 67, 2, 2, 400, 401, 7, 102, 2, 2,
	401, 402, 7, 102, 2, 2, 402, 108, 3, 2, 2, 2, 403, 404, 7, 85, 2, 2, 404,
	405, 7, 119, 2, 2, 405, 406, 7, 100, 2, 2, 406, 110, 3, 2, 2, 2, 407, 408,
	7, 79, 2, 2, 408, 409, 7, 119, 2, 2, 409, 410, 7, 110, 2, 2, 410, 112,
	3, 2, 2, 2, 411, 412, 7, 87, 2, 2, 412, 413, 7, 70, 2, 2, 413, 414, 7,
	107, 2, 2, 414, 415, 7, 120, 2, 2, 415, 114, 3, 2, 2, 2, 416, 417, 7, 87,
	2, 2, 417, 418, 7, 84, 2, 2, 418, 419, 7, 103, 2, 2, 419, 420, 7, 111,
	2, 2, 420, 116, 3, 2, 2, 2, 421, 422, 7, 85, 2, 2, 422, 423, 7, 70, 2,
	2, 423, 424, 7, 107, 2, 2, 424, 425, 7, 120, 2, 2, 425, 118, 3, 2, 2, 2,
	426, 427, 7, 85, 2, 2, 427, 428, 7, 84, 2, 2, 428, 429, 7, 103, 2, 2, 429,
	430, 7, 111, 2, 2, 430, 120, 3, 2, 2, 2, 431, 432, 4, 50, 59, 2, 432, 122,
	3, 2, 2, 2, 433, 434, 9, 2, 2, 2, 434, 124, 3, 2, 2, 2, 435, 436, 9, 3,
	2, 2, 436, 126, 3, 2, 2, 2, 437, 438, 9, 4, 2, 2, 438, 128, 3, 2, 2, 2,
	439, 443, 9, 5, 2, 2, 440, 442, 9, 6, 2, 2, 441, 440, 3, 2, 2, 2, 442,
	445, 3, 2, 2, 2, 443, 441, 3, 2, 2, 2, 443, 444, 3, 2, 2, 2, 444, 130,
	3, 2, 2, 2, 445, 443, 3, 2, 2, 2, 446, 447, 7, 107, 2, 2, 447, 132, 3,
	2, 2, 2, 448, 450, 9, 7, 2, 2, 449, 448, 3, 2, 2, 2, 450, 451, 3, 2, 2,
	2, 451, 449, 3, 2, 2, 2, 451, 452, 3, 2, 2, 2, 452, 453, 3, 2, 2, 2, 453,
	454, 8, 67, 2, 2, 454, 134, 3, 2, 2, 2, 455, 457, 7, 15, 2, 2, 456, 458,
	7, 12, 2, 2, 457, 456, 3, 2, 2, 2, 457, 458, 3, 2, 2, 2, 458, 461, 3, 2,
	2, 2, 459, 461, 7, 12, 2, 2, 460, 455, 3, 2, 2, 2, 460, 459, 3, 2, 2, 2,
	461, 462, 3, 2, 2, 2, 462, 463, 8, 68, 2, 2, 463, 136, 3, 2, 2, 2, 464,
	465, 7, 49, 2, 2, 465, 466, 7, 44, 2, 2, 466, 470, 3, 2, 2, 2, 467, 469,
	11, 2, 2, 2, 468, 467, 3, 2, 2, 2, 469, 472, 3, 2, 2, 2, 470, 471, 3, 2,
	2, 2, 470, 468, 3, 2, 2, 2, 471, 473, 3, 2, 2, 2, 472, 470, 3, 2, 2, 2,
	473, 474, 7, 44, 2, 2, 474, 475, 7, 49, 2, 2, 475, 476, 3, 2, 2, 2, 476,
	477, 8, 69, 2, 2, 477, 138, 3, 2, 2, 2, 478, 482, 7, 37, 2, 2, 479, 481,
	10, 8, 2, 2, 480, 479, 3, 2, 2, 2, 481, 484, 3, 2, 2, 2, 482, 480, 3, 2,
	2, 2, 482, 483, 3, 2, 2, 2, 483, 485, 3, 2, 2, 2, 484, 482, 3, 2, 2, 2,
	485, 486, 8, 70, 2, 2, 486, 140, 3, 2, 2, 2, 487, 488, 7, 42, 2, 2, 488,
	142, 3, 2, 2, 2, 489, 490, 7, 43, 2, 2, 490, 144, 3, 2, 2, 2, 491, 492,
	7, 93, 2, 2, 492, 146, 3, 2, 2, 2, 493, 494, 7, 95, 2, 2, 494, 148, 3,
	2, 2, 2, 495, 496, 7, 125, 2, 2, 496, 150, 3, 2, 2, 2, 497, 498, 7, 127,
	2, 2, 498, 152, 3, 2, 2, 2, 20, 2, 155, 159, 166, 171, 177, 183, 189, 197,
	200, 206, 212, 443, 451, 457, 460, 470, 482, 3, 8, 2, 2,
}

var lexerChannelNames = []string{
	"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
}

var lexerModeNames = []string{
	"DEFAULT_MODE",
}

var lexerLiteralNames = []string{
	"", "", "", "", "", "", "", "", "", "", "'0b'", "'0o'", "'w'", "'0x'",
	"'true'", "'false'", "'query'", "'array'", "'symbolic'", "':'", "'->'",
	"'='", "','", "'Not'", "'Shl'", "'LShr'", "'AShr'", "'Concat'", "'Extract'",
	"'ZExt'", "'SExt'", "'Read'", "'Select'", "'Neg'", "'ReadLSB'", "'ReadMSB'",
	"'+'", "'-'", "'@'", "'fp'", "'And'", "'Or'", "'Xor'", "'Eq'", "'Ne'",
	"'Ult'", "'Ule'", "'Ugt'", "'Uge'", "'Slt'", "'Sle'", "'Sgt'", "'Sge'",
	"'Add'", "'Sub'", "'Mul'", "'UDiv'", "'URem'", "'SDiv'", "'SRem'", "",
	"'i'", "", "", "", "", "'('", "')'", "'['", "']'", "'{'", "'}'",
}

var lexerSymbolicNames = []string{
	"", "Boolean", "SignedConstant", "Constant", "BinConstant", "OctConstant",
	"HexConstant", "FloatingPointType", "IntegerType", "WidthType", "BinId",
	"OctId", "WIDTH", "HexId", "TrueMatch", "FalseMatch", "Query", "Array",
	"Symbolic", "Colon", "Arrow", "Equal", "COMMA", "NOT", "SHL", "LSHR", "ASHR",
	"CONCAT", "EXTRACT", "ZEXT", "SEXT", "READ", "SELECT", "NEGETION", "READLSB",
	"READMSB", "PLUS", "MINUS", "ATR", "FP", "BITWISEAND", "BITWISEOR", "BITWISEXOR",
	"EQ", "NEQ", "ULT", "ULE", "UGT", "UGE", "SLT", "SLE", "SGT", "SGE", "ADD",
	"SUB", "MUL", "UDIV", "UREM", "SDIV", "SREM", "Identifier", "INT", "Whitespace",
	"Newline", "BlockComment", "LineComment", "LeftParen", "RightParen", "LeftBracket",
	"RightBracket", "LeftBrace", "RightBrace",
}

var lexerRuleNames = []string{
	"Boolean", "SignedConstant", "Constant", "BinConstant", "OctConstant",
	"HexConstant", "FloatingPointType", "IntegerType", "WidthType", "BinId",
	"OctId", "WIDTH", "HexId", "TrueMatch", "FalseMatch", "Query", "Array",
	"Symbolic", "Colon", "Arrow", "Equal", "COMMA", "NOT", "SHL", "LSHR", "ASHR",
	"CONCAT", "EXTRACT", "ZEXT", "SEXT", "READ", "SELECT", "NEGETION", "READLSB",
	"READMSB", "PLUS", "MINUS", "ATR", "FP", "BITWISEAND", "BITWISEOR", "BITWISEXOR",
	"EQ", "NEQ", "ULT", "ULE", "UGT", "UGE", "SLT", "SLE", "SGT", "SGE", "ADD",
	"SUB", "MUL", "UDIV", "UREM", "SDIV", "SREM", "DIGIT", "BIN_DIGIT", "OCTAL_DIGIT",
	"HEX_DIGIT", "Identifier", "INT", "Whitespace", "Newline", "BlockComment",
	"LineComment", "LeftParen", "RightParen", "LeftBracket", "RightBracket",
	"LeftBrace", "RightBrace",
}

type KQueryLexer struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

// NewKQueryLexer produces a new lexer instance for the optional input antlr.CharStream.
//
// The *KQueryLexer instance produced may be reused by calling the SetInputStream method.
// The initial lexer configuration is expensive to construct, and the object is not thread-safe;
// however, if used within a Golang sync.Pool, the construction cost amortizes well and the
// objects can be used in a thread-safe manner.
func NewKQueryLexer(input antlr.CharStream) *KQueryLexer {
	l := new(KQueryLexer)
	lexerDeserializer := antlr.NewATNDeserializer(nil)
	lexerAtn := lexerDeserializer.DeserializeFromUInt16(serializedLexerAtn)
	lexerDecisionToDFA := make([]*antlr.DFA, len(lexerAtn.DecisionToState))
	for index, ds := range lexerAtn.DecisionToState {
		lexerDecisionToDFA[index] = antlr.NewDFA(ds, index)
	}
	l.BaseLexer = antlr.NewBaseLexer(input)
	l.Interpreter = antlr.NewLexerATNSimulator(l, lexerAtn, lexerDecisionToDFA, antlr.NewPredictionContextCache())

	l.channelNames = lexerChannelNames
	l.modeNames = lexerModeNames
	l.RuleNames = lexerRuleNames
	l.LiteralNames = lexerLiteralNames
	l.SymbolicNames = lexerSymbolicNames
	l.GrammarFileName = "KQuery.g4"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// KQueryLexer tokens.
const (
	KQueryLexerBoolean           = 1
	KQueryLexerSignedConstant    = 2
	KQueryLexerConstant          = 3
	KQueryLexerBinConstant       = 4
	KQueryLexerOctConstant       = 5
	KQueryLexerHexConstant       = 6
	KQueryLexerFloatingPointType = 7
	KQueryLexerIntegerType       = 8
	KQueryLexerWidthType         = 9
	KQueryLexerBinId             = 10
	KQueryLexerOctId             = 11
	KQueryLexerWIDTH             = 12
	KQueryLexerHexId             = 13
	KQueryLexerTrueMatch         = 14
	KQueryLexerFalseMatch        = 15
	KQueryLexerQuery             = 16
	KQueryLexerArray             = 17
	KQueryLexerSymbolic          = 18
	KQueryLexerColon             = 19
	KQueryLexerArrow             = 20
	KQueryLexerEqual             = 21
	KQueryLexerCOMMA             = 22
	KQueryLexerNOT               = 23
	KQueryLexerSHL               = 24
	KQueryLexerLSHR              = 25
	KQueryLexerASHR              = 26
	KQueryLexerCONCAT            = 27
	KQueryLexerEXTRACT           = 28
	KQueryLexerZEXT              = 29
	KQueryLexerSEXT              = 30
	KQueryLexerREAD              = 31
	KQueryLexerSELECT            = 32
	KQueryLexerNEGETION          = 33
	KQueryLexerREADLSB           = 34
	KQueryLexerREADMSB           = 35
	KQueryLexerPLUS              = 36
	KQueryLexerMINUS             = 37
	KQueryLexerATR               = 38
	KQueryLexerFP                = 39
	KQueryLexerBITWISEAND        = 40
	KQueryLexerBITWISEOR         = 41
	KQueryLexerBITWISEXOR        = 42
	KQueryLexerEQ                = 43
	KQueryLexerNEQ               = 44
	KQueryLexerULT               = 45
	KQueryLexerULE               = 46
	KQueryLexerUGT               = 47
	KQueryLexerUGE               = 48
	KQueryLexerSLT               = 49
	KQueryLexerSLE               = 50
	KQueryLexerSGT               = 51
	KQueryLexerSGE               = 52
	KQueryLexerADD               = 53
	KQueryLexerSUB               = 54
	KQueryLexerMUL               = 55
	KQueryLexerUDIV              = 56
	KQueryLexerUREM              = 57
	KQueryLexerSDIV              = 58
	KQueryLexerSREM              = 59
	KQueryLexerIdentifier        = 60
	KQueryLexerINT               = 61
	KQueryLexerWhitespace        = 62
	KQueryLexerNewline           = 63
	KQueryLexerBlockComment      = 64
	KQueryLexerLineComment       = 65
	KQueryLexerLeftParen         = 66
	KQueryLexerRightParen        = 67
	KQueryLexerLeftBracket       = 68
	KQueryLexerRightBracket      = 69
	KQueryLexerLeftBrace         = 70
	KQueryLexerRightBrace        = 71
)