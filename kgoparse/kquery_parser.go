// Code generated from KQuery.g4 by ANTLR 4.9.2. DO NOT EDIT.

package parser // KQuery

import (
	"fmt"
	"reflect"
	"strconv"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

// Suppress unused import errors
var _ = fmt.Printf
var _ = reflect.Copy
var _ = strconv.Itoa

var parserATN = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 73, 333,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 4, 13,
	9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4, 18, 9,
	18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23, 9, 23,
	4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9, 28, 4,
	29, 9, 29, 4, 30, 9, 30, 4, 31, 9, 31, 4, 32, 9, 32, 4, 33, 9, 33, 4, 34,
	9, 34, 4, 35, 9, 35, 4, 36, 9, 36, 4, 37, 9, 37, 3, 2, 7, 2, 76, 10, 2,
	12, 2, 14, 2, 79, 11, 2, 3, 2, 3, 2, 3, 3, 3, 3, 5, 3, 85, 10, 3, 3, 4,
	3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5,
	3, 5, 5, 5, 101, 10, 5, 3, 6, 3, 6, 7, 6, 105, 10, 6, 12, 6, 14, 6, 108,
	11, 6, 3, 6, 3, 6, 3, 7, 3, 7, 7, 7, 114, 10, 7, 12, 7, 14, 7, 117, 11,
	7, 3, 7, 3, 7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3,
	8, 3, 8, 3, 8, 3, 9, 3, 9, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 5, 10, 140,
	10, 10, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11,
	3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3,
	11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11,
	3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3,
	11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11,
	3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3,
	11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11,
	3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3,
	11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11,
	3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3,
	11, 3, 11, 5, 11, 247, 10, 11, 3, 12, 3, 12, 3, 13, 3, 13, 3, 14, 3, 14,
	3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3,
	14, 3, 14, 3, 14, 5, 14, 268, 10, 14, 3, 15, 3, 15, 3, 16, 3, 16, 3, 17,
	3, 17, 3, 18, 3, 18, 3, 19, 3, 19, 3, 20, 3, 20, 3, 21, 3, 21, 3, 22, 3,
	22, 3, 23, 3, 23, 3, 24, 3, 24, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25,
	3, 25, 3, 25, 3, 25, 3, 25, 5, 25, 300, 10, 25, 3, 26, 3, 26, 3, 27, 3,
	27, 3, 28, 3, 28, 3, 29, 3, 29, 3, 30, 3, 30, 3, 31, 3, 31, 3, 32, 3, 32,
	3, 32, 3, 32, 5, 32, 318, 10, 32, 3, 33, 3, 33, 3, 33, 5, 33, 323, 10,
	33, 3, 34, 3, 34, 3, 35, 3, 35, 3, 36, 3, 36, 3, 37, 3, 37, 3, 37, 2, 2,
	38, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36,
	38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72,
	2, 7, 4, 2, 33, 33, 36, 37, 3, 2, 31, 32, 4, 2, 26, 28, 42, 44, 3, 2, 45,
	54, 3, 2, 55, 61, 2, 328, 2, 77, 3, 2, 2, 2, 4, 84, 3, 2, 2, 2, 6, 86,
	3, 2, 2, 2, 8, 100, 3, 2, 2, 2, 10, 102, 3, 2, 2, 2, 12, 111, 3, 2, 2,
	2, 14, 120, 3, 2, 2, 2, 16, 132, 3, 2, 2, 2, 18, 139, 3, 2, 2, 2, 20, 246,
	3, 2, 2, 2, 22, 248, 3, 2, 2, 2, 24, 250, 3, 2, 2, 2, 26, 267, 3, 2, 2,
	2, 28, 269, 3, 2, 2, 2, 30, 271, 3, 2, 2, 2, 32, 273, 3, 2, 2, 2, 34, 275,
	3, 2, 2, 2, 36, 277, 3, 2, 2, 2, 38, 279, 3, 2, 2, 2, 40, 281, 3, 2, 2,
	2, 42, 283, 3, 2, 2, 2, 44, 285, 3, 2, 2, 2, 46, 287, 3, 2, 2, 2, 48, 299,
	3, 2, 2, 2, 50, 301, 3, 2, 2, 2, 52, 303, 3, 2, 2, 2, 54, 305, 3, 2, 2,
	2, 56, 307, 3, 2, 2, 2, 58, 309, 3, 2, 2, 2, 60, 311, 3, 2, 2, 2, 62, 317,
	3, 2, 2, 2, 64, 322, 3, 2, 2, 2, 66, 324, 3, 2, 2, 2, 68, 326, 3, 2, 2,
	2, 70, 328, 3, 2, 2, 2, 72, 330, 3, 2, 2, 2, 74, 76, 5, 4, 3, 2, 75, 74,
	3, 2, 2, 2, 76, 79, 3, 2, 2, 2, 77, 75, 3, 2, 2, 2, 77, 78, 3, 2, 2, 2,
	78, 80, 3, 2, 2, 2, 79, 77, 3, 2, 2, 2, 80, 81, 7, 2, 2, 3, 81, 3, 3, 2,
	2, 2, 82, 85, 5, 14, 8, 2, 83, 85, 5, 6, 4, 2, 84, 82, 3, 2, 2, 2, 84,
	83, 3, 2, 2, 2, 85, 5, 3, 2, 2, 2, 86, 87, 7, 68, 2, 2, 87, 88, 7, 18,
	2, 2, 88, 89, 5, 10, 6, 2, 89, 90, 5, 8, 5, 2, 90, 91, 7, 69, 2, 2, 91,
	7, 3, 2, 2, 2, 92, 101, 5, 20, 11, 2, 93, 94, 5, 20, 11, 2, 94, 95, 5,
	10, 6, 2, 95, 101, 3, 2, 2, 2, 96, 97, 5, 20, 11, 2, 97, 98, 5, 10, 6,
	2, 98, 99, 5, 12, 7, 2, 99, 101, 3, 2, 2, 2, 100, 92, 3, 2, 2, 2, 100,
	93, 3, 2, 2, 2, 100, 96, 3, 2, 2, 2, 101, 9, 3, 2, 2, 2, 102, 106, 7, 70,
	2, 2, 103, 105, 5, 20, 11, 2, 104, 103, 3, 2, 2, 2, 105, 108, 3, 2, 2,
	2, 106, 104, 3, 2, 2, 2, 106, 107, 3, 2, 2, 2, 107, 109, 3, 2, 2, 2, 108,
	106, 3, 2, 2, 2, 109, 110, 7, 71, 2, 2, 110, 11, 3, 2, 2, 2, 111, 115,
	7, 70, 2, 2, 112, 114, 7, 62, 2, 2, 113, 112, 3, 2, 2, 2, 114, 117, 3,
	2, 2, 2, 115, 113, 3, 2, 2, 2, 115, 116, 3, 2, 2, 2, 116, 118, 3, 2, 2,
	2, 117, 115, 3, 2, 2, 2, 118, 119, 7, 71, 2, 2, 119, 13, 3, 2, 2, 2, 120,
	121, 7, 19, 2, 2, 121, 122, 5, 60, 31, 2, 122, 123, 7, 70, 2, 2, 123, 124,
	5, 16, 9, 2, 124, 125, 7, 71, 2, 2, 125, 126, 7, 21, 2, 2, 126, 127, 5,
	56, 29, 2, 127, 128, 7, 22, 2, 2, 128, 129, 5, 58, 30, 2, 129, 130, 7,
	23, 2, 2, 130, 131, 5, 18, 10, 2, 131, 15, 3, 2, 2, 2, 132, 133, 7, 5,
	2, 2, 133, 17, 3, 2, 2, 2, 134, 140, 7, 20, 2, 2, 135, 136, 7, 70, 2, 2,
	136, 137, 5, 62, 32, 2, 137, 138, 7, 71, 2, 2, 138, 140, 3, 2, 2, 2, 139,
	134, 3, 2, 2, 2, 139, 135, 3, 2, 2, 2, 140, 19, 3, 2, 2, 2, 141, 247, 5,
	40, 21, 2, 142, 143, 5, 46, 24, 2, 143, 144, 7, 21, 2, 2, 144, 145, 5,
	28, 15, 2, 145, 247, 3, 2, 2, 2, 146, 147, 7, 68, 2, 2, 147, 148, 5, 72,
	37, 2, 148, 149, 5, 64, 33, 2, 149, 150, 7, 69, 2, 2, 150, 247, 3, 2, 2,
	2, 151, 152, 7, 68, 2, 2, 152, 153, 5, 54, 28, 2, 153, 154, 5, 72, 37,
	2, 154, 155, 5, 42, 22, 2, 155, 156, 5, 44, 23, 2, 156, 157, 7, 69, 2,
	2, 157, 247, 3, 2, 2, 2, 158, 159, 7, 68, 2, 2, 159, 160, 5, 30, 16, 2,
	160, 161, 7, 70, 2, 2, 161, 162, 5, 72, 37, 2, 162, 163, 7, 71, 2, 2, 163,
	164, 5, 20, 11, 2, 164, 165, 7, 69, 2, 2, 165, 247, 3, 2, 2, 2, 166, 167,
	7, 68, 2, 2, 167, 168, 5, 50, 26, 2, 168, 169, 5, 72, 37, 2, 169, 170,
	5, 42, 22, 2, 170, 171, 5, 44, 23, 2, 171, 172, 7, 69, 2, 2, 172, 247,
	3, 2, 2, 2, 173, 174, 7, 68, 2, 2, 174, 175, 5, 52, 27, 2, 175, 176, 5,
	72, 37, 2, 176, 177, 5, 42, 22, 2, 177, 178, 5, 44, 23, 2, 178, 179, 7,
	69, 2, 2, 179, 247, 3, 2, 2, 2, 180, 181, 7, 68, 2, 2, 181, 182, 5, 52,
	27, 2, 182, 183, 5, 42, 22, 2, 183, 184, 5, 44, 23, 2, 184, 185, 7, 69,
	2, 2, 185, 247, 3, 2, 2, 2, 186, 187, 7, 68, 2, 2, 187, 188, 5, 32, 17,
	2, 188, 189, 5, 72, 37, 2, 189, 190, 5, 42, 22, 2, 190, 191, 5, 44, 23,
	2, 191, 192, 7, 69, 2, 2, 192, 247, 3, 2, 2, 2, 193, 194, 7, 68, 2, 2,
	194, 195, 5, 32, 17, 2, 195, 196, 5, 42, 22, 2, 196, 197, 5, 44, 23, 2,
	197, 198, 7, 69, 2, 2, 198, 247, 3, 2, 2, 2, 199, 200, 7, 68, 2, 2, 200,
	201, 5, 38, 20, 2, 201, 202, 5, 72, 37, 2, 202, 203, 5, 64, 33, 2, 203,
	204, 5, 20, 11, 2, 204, 205, 7, 69, 2, 2, 205, 247, 3, 2, 2, 2, 206, 207,
	7, 68, 2, 2, 207, 208, 5, 24, 13, 2, 208, 209, 5, 72, 37, 2, 209, 210,
	5, 20, 11, 2, 210, 211, 7, 69, 2, 2, 211, 247, 3, 2, 2, 2, 212, 213, 7,
	68, 2, 2, 213, 214, 5, 22, 12, 2, 214, 215, 5, 72, 37, 2, 215, 216, 5,
	20, 11, 2, 216, 217, 5, 26, 14, 2, 217, 218, 7, 69, 2, 2, 218, 247, 3,
	2, 2, 2, 219, 220, 7, 68, 2, 2, 220, 221, 5, 36, 19, 2, 221, 222, 5, 72,
	37, 2, 222, 223, 5, 42, 22, 2, 223, 224, 5, 44, 23, 2, 224, 225, 5, 20,
	11, 2, 225, 226, 7, 69, 2, 2, 226, 247, 3, 2, 2, 2, 227, 228, 7, 68, 2,
	2, 228, 229, 5, 34, 18, 2, 229, 230, 5, 72, 37, 2, 230, 231, 5, 20, 11,
	2, 231, 232, 7, 69, 2, 2, 232, 247, 3, 2, 2, 2, 233, 234, 7, 68, 2, 2,
	234, 235, 5, 34, 18, 2, 235, 236, 5, 20, 11, 2, 236, 237, 7, 69, 2, 2,
	237, 247, 3, 2, 2, 2, 238, 239, 7, 68, 2, 2, 239, 240, 5, 22, 12, 2, 240,
	241, 5, 72, 37, 2, 241, 242, 5, 20, 11, 2, 242, 243, 7, 69, 2, 2, 243,
	247, 3, 2, 2, 2, 244, 247, 5, 26, 14, 2, 245, 247, 5, 64, 33, 2, 246, 141,
	3, 2, 2, 2, 246, 142, 3, 2, 2, 2, 246, 146, 3, 2, 2, 2, 246, 151, 3, 2,
	2, 2, 246, 158, 3, 2, 2, 2, 246, 166, 3, 2, 2, 2, 246, 173, 3, 2, 2, 2,
	246, 180, 3, 2, 2, 2, 246, 186, 3, 2, 2, 2, 246, 193, 3, 2, 2, 2, 246,
	199, 3, 2, 2, 2, 246, 206, 3, 2, 2, 2, 246, 212, 3, 2, 2, 2, 246, 219,
	3, 2, 2, 2, 246, 227, 3, 2, 2, 2, 246, 233, 3, 2, 2, 2, 246, 238, 3, 2,
	2, 2, 246, 244, 3, 2, 2, 2, 246, 245, 3, 2, 2, 2, 247, 21, 3, 2, 2, 2,
	248, 249, 9, 2, 2, 2, 249, 23, 3, 2, 2, 2, 250, 251, 9, 3, 2, 2, 251, 25,
	3, 2, 2, 2, 252, 268, 5, 40, 21, 2, 253, 254, 5, 46, 24, 2, 254, 255, 7,
	21, 2, 2, 255, 256, 5, 28, 15, 2, 256, 268, 3, 2, 2, 2, 257, 258, 7, 70,
	2, 2, 258, 259, 5, 48, 25, 2, 259, 260, 7, 71, 2, 2, 260, 261, 7, 40, 2,
	2, 261, 262, 5, 26, 14, 2, 262, 268, 3, 2, 2, 2, 263, 264, 7, 70, 2, 2,
	264, 265, 7, 71, 2, 2, 265, 266, 7, 40, 2, 2, 266, 268, 5, 26, 14, 2, 267,
	252, 3, 2, 2, 2, 267, 253, 3, 2, 2, 2, 267, 257, 3, 2, 2, 2, 267, 263,
	3, 2, 2, 2, 268, 27, 3, 2, 2, 2, 269, 270, 5, 20, 11, 2, 270, 29, 3, 2,
	2, 2, 271, 272, 7, 25, 2, 2, 272, 31, 3, 2, 2, 2, 273, 274, 7, 29, 2, 2,
	274, 33, 3, 2, 2, 2, 275, 276, 7, 35, 2, 2, 276, 35, 3, 2, 2, 2, 277, 278,
	7, 34, 2, 2, 278, 37, 3, 2, 2, 2, 279, 280, 7, 30, 2, 2, 280, 39, 3, 2,
	2, 2, 281, 282, 7, 62, 2, 2, 282, 41, 3, 2, 2, 2, 283, 284, 5, 20, 11,
	2, 284, 43, 3, 2, 2, 2, 285, 286, 5, 20, 11, 2, 286, 45, 3, 2, 2, 2, 287,
	288, 7, 62, 2, 2, 288, 47, 3, 2, 2, 2, 289, 290, 5, 20, 11, 2, 290, 291,
	7, 23, 2, 2, 291, 292, 5, 20, 11, 2, 292, 293, 7, 24, 2, 2, 293, 294, 5,
	48, 25, 2, 294, 300, 3, 2, 2, 2, 295, 296, 5, 20, 11, 2, 296, 297, 7, 23,
	2, 2, 297, 298, 5, 20, 11, 2, 298, 300, 3, 2, 2, 2, 299, 289, 3, 2, 2,
	2, 299, 295, 3, 2, 2, 2, 300, 49, 3, 2, 2, 2, 301, 302, 9, 4, 2, 2, 302,
	51, 3, 2, 2, 2, 303, 304, 9, 5, 2, 2, 304, 53, 3, 2, 2, 2, 305, 306, 9,
	6, 2, 2, 306, 55, 3, 2, 2, 2, 307, 308, 5, 72, 37, 2, 308, 57, 3, 2, 2,
	2, 309, 310, 5, 72, 37, 2, 310, 59, 3, 2, 2, 2, 311, 312, 7, 62, 2, 2,
	312, 61, 3, 2, 2, 2, 313, 318, 5, 64, 33, 2, 314, 315, 5, 64, 33, 2, 315,
	316, 5, 62, 32, 2, 316, 318, 3, 2, 2, 2, 317, 313, 3, 2, 2, 2, 317, 314,
	3, 2, 2, 2, 318, 63, 3, 2, 2, 2, 319, 323, 5, 68, 35, 2, 320, 323, 5, 70,
	36, 2, 321, 323, 5, 66, 34, 2, 322, 319, 3, 2, 2, 2, 322, 320, 3, 2, 2,
	2, 322, 321, 3, 2, 2, 2, 323, 65, 3, 2, 2, 2, 324, 325, 7, 5, 2, 2, 325,
	67, 3, 2, 2, 2, 326, 327, 7, 3, 2, 2, 327, 69, 3, 2, 2, 2, 328, 329, 7,
	4, 2, 2, 329, 71, 3, 2, 2, 2, 330, 331, 7, 11, 2, 2, 331, 73, 3, 2, 2,
	2, 13, 77, 84, 100, 106, 115, 139, 246, 267, 299, 317, 322,
}
var literalNames = []string{
	"", "", "", "", "", "", "", "", "", "", "'0b'", "'0o'", "'w'", "'0x'",
	"'true'", "'false'", "'query'", "'array'", "'symbolic'", "':'", "'->'",
	"'='", "','", "'Not'", "'Shl'", "'LShr'", "'AShr'", "'Concat'", "'Extract'",
	"'ZExt'", "'SExt'", "'Read'", "'Select'", "'Neg'", "'ReadLSB'", "'ReadMSB'",
	"'+'", "'-'", "'@'", "'fp'", "'And'", "'Or'", "'Xor'", "'Eq'", "'Ne'",
	"'Ult'", "'Ule'", "'Ugt'", "'Uge'", "'Slt'", "'Sle'", "'Sgt'", "'Sge'",
	"'Add'", "'Sub'", "'Mul'", "'UDiv'", "'URem'", "'SDiv'", "'SRem'", "",
	"'i'", "", "", "", "", "'('", "')'", "'['", "']'", "'{'", "'}'",
}
var symbolicNames = []string{
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

var ruleNames = []string{
	"kqueryExpression", "ktranslationUnit", "queryCommand", "queryExpr", "evalExprList",
	"evalArrayList", "arrayDeclaration", "numArrayElements", "arrayInitializer",
	"expression", "genericBitRead", "bitExtractExpr", "version", "fullyQualifiedExpression",
	"notExpr", "concatExpr", "exprNegation", "selectExpr", "arrExtractExpr",
	"varName", "leftExpr", "rightExpr", "namedConstant", "updateList", "bitwiseExpr",
	"comparisonExpr", "arithmeticExpr", "domain", "rangeLimit", "arrName",
	"numberList", "number", "constant", "boolnum", "signedConstant", "widthOrSizeExpr",
}

type KQueryParser struct {
	*antlr.BaseParser
}

// NewKQueryParser produces a new parser instance for the optional input antlr.TokenStream.
//
// The *KQueryParser instance produced may be reused by calling the SetInputStream method.
// The initial parser configuration is expensive to construct, and the object is not thread-safe;
// however, if used within a Golang sync.Pool, the construction cost amortizes well and the
// objects can be used in a thread-safe manner.
func NewKQueryParser(input antlr.TokenStream) *KQueryParser {
	this := new(KQueryParser)
	deserializer := antlr.NewATNDeserializer(nil)
	deserializedATN := deserializer.DeserializeFromUInt16(parserATN)
	decisionToDFA := make([]*antlr.DFA, len(deserializedATN.DecisionToState))
	for index, ds := range deserializedATN.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(ds, index)
	}
	this.BaseParser = antlr.NewBaseParser(input)

	this.Interpreter = antlr.NewParserATNSimulator(this, deserializedATN, decisionToDFA, antlr.NewPredictionContextCache())
	this.RuleNames = ruleNames
	this.LiteralNames = literalNames
	this.SymbolicNames = symbolicNames
	this.GrammarFileName = "KQuery.g4"

	return this
}

// KQueryParser tokens.
const (
	KQueryParserEOF               = antlr.TokenEOF
	KQueryParserBoolean           = 1
	KQueryParserSignedConstant    = 2
	KQueryParserConstant          = 3
	KQueryParserBinConstant       = 4
	KQueryParserOctConstant       = 5
	KQueryParserHexConstant       = 6
	KQueryParserFloatingPointType = 7
	KQueryParserIntegerType       = 8
	KQueryParserWidthType         = 9
	KQueryParserBinId             = 10
	KQueryParserOctId             = 11
	KQueryParserWIDTH             = 12
	KQueryParserHexId             = 13
	KQueryParserTrueMatch         = 14
	KQueryParserFalseMatch        = 15
	KQueryParserQuery             = 16
	KQueryParserArray             = 17
	KQueryParserSymbolic          = 18
	KQueryParserColon             = 19
	KQueryParserArrow             = 20
	KQueryParserEqual             = 21
	KQueryParserCOMMA             = 22
	KQueryParserNOT               = 23
	KQueryParserSHL               = 24
	KQueryParserLSHR              = 25
	KQueryParserASHR              = 26
	KQueryParserCONCAT            = 27
	KQueryParserEXTRACT           = 28
	KQueryParserZEXT              = 29
	KQueryParserSEXT              = 30
	KQueryParserREAD              = 31
	KQueryParserSELECT            = 32
	KQueryParserNEGETION          = 33
	KQueryParserREADLSB           = 34
	KQueryParserREADMSB           = 35
	KQueryParserPLUS              = 36
	KQueryParserMINUS             = 37
	KQueryParserATR               = 38
	KQueryParserFP                = 39
	KQueryParserBITWISEAND        = 40
	KQueryParserBITWISEOR         = 41
	KQueryParserBITWISEXOR        = 42
	KQueryParserEQ                = 43
	KQueryParserNEQ               = 44
	KQueryParserULT               = 45
	KQueryParserULE               = 46
	KQueryParserUGT               = 47
	KQueryParserUGE               = 48
	KQueryParserSLT               = 49
	KQueryParserSLE               = 50
	KQueryParserSGT               = 51
	KQueryParserSGE               = 52
	KQueryParserADD               = 53
	KQueryParserSUB               = 54
	KQueryParserMUL               = 55
	KQueryParserUDIV              = 56
	KQueryParserUREM              = 57
	KQueryParserSDIV              = 58
	KQueryParserSREM              = 59
	KQueryParserIdentifier        = 60
	KQueryParserINT               = 61
	KQueryParserWhitespace        = 62
	KQueryParserNewline           = 63
	KQueryParserBlockComment      = 64
	KQueryParserLineComment       = 65
	KQueryParserLeftParen         = 66
	KQueryParserRightParen        = 67
	KQueryParserLeftBracket       = 68
	KQueryParserRightBracket      = 69
	KQueryParserLeftBrace         = 70
	KQueryParserRightBrace        = 71
)

// KQueryParser rules.
const (
	KQueryParserRULE_kqueryExpression         = 0
	KQueryParserRULE_ktranslationUnit         = 1
	KQueryParserRULE_queryCommand             = 2
	KQueryParserRULE_queryExpr                = 3
	KQueryParserRULE_evalExprList             = 4
	KQueryParserRULE_evalArrayList            = 5
	KQueryParserRULE_arrayDeclaration         = 6
	KQueryParserRULE_numArrayElements         = 7
	KQueryParserRULE_arrayInitializer         = 8
	KQueryParserRULE_expression               = 9
	KQueryParserRULE_genericBitRead           = 10
	KQueryParserRULE_bitExtractExpr           = 11
	KQueryParserRULE_version                  = 12
	KQueryParserRULE_fullyQualifiedExpression = 13
	KQueryParserRULE_notExpr                  = 14
	KQueryParserRULE_concatExpr               = 15
	KQueryParserRULE_exprNegation             = 16
	KQueryParserRULE_selectExpr               = 17
	KQueryParserRULE_arrExtractExpr           = 18
	KQueryParserRULE_varName                  = 19
	KQueryParserRULE_leftExpr                 = 20
	KQueryParserRULE_rightExpr                = 21
	KQueryParserRULE_namedConstant            = 22
	KQueryParserRULE_updateList               = 23
	KQueryParserRULE_bitwiseExpr              = 24
	KQueryParserRULE_comparisonExpr           = 25
	KQueryParserRULE_arithmeticExpr           = 26
	KQueryParserRULE_domain                   = 27
	KQueryParserRULE_rangeLimit               = 28
	KQueryParserRULE_arrName                  = 29
	KQueryParserRULE_numberList               = 30
	KQueryParserRULE_number                   = 31
	KQueryParserRULE_constant                 = 32
	KQueryParserRULE_boolnum                  = 33
	KQueryParserRULE_signedConstant           = 34
	KQueryParserRULE_widthOrSizeExpr          = 35
)

// IKqueryExpressionContext is an interface to support dynamic dispatch.
type IKqueryExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsKqueryExpressionContext differentiates from other interfaces.
	IsKqueryExpressionContext()
}

type KqueryExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyKqueryExpressionContext() *KqueryExpressionContext {
	var p = new(KqueryExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_kqueryExpression
	return p
}

func (*KqueryExpressionContext) IsKqueryExpressionContext() {}

func NewKqueryExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *KqueryExpressionContext {
	var p = new(KqueryExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_kqueryExpression

	return p
}

func (s *KqueryExpressionContext) GetParser() antlr.Parser { return s.parser }

func (s *KqueryExpressionContext) EOF() antlr.TerminalNode {
	return s.GetToken(KQueryParserEOF, 0)
}

func (s *KqueryExpressionContext) AllKtranslationUnit() []IKtranslationUnitContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IKtranslationUnitContext)(nil)).Elem())
	var tst = make([]IKtranslationUnitContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IKtranslationUnitContext)
		}
	}

	return tst
}

func (s *KqueryExpressionContext) KtranslationUnit(i int) IKtranslationUnitContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IKtranslationUnitContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IKtranslationUnitContext)
}

func (s *KqueryExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *KqueryExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *KqueryExpressionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterKqueryExpression(s)
	}
}

func (s *KqueryExpressionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitKqueryExpression(s)
	}
}

func (s *KqueryExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitKqueryExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) KqueryExpression() (localctx IKqueryExpressionContext) {
	localctx = NewKqueryExpressionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, KQueryParserRULE_kqueryExpression)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(75)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == KQueryParserArray || _la == KQueryParserLeftParen {
		{
			p.SetState(72)
			p.KtranslationUnit()
		}

		p.SetState(77)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(78)
		p.Match(KQueryParserEOF)
	}

	return localctx
}

// IKtranslationUnitContext is an interface to support dynamic dispatch.
type IKtranslationUnitContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsKtranslationUnitContext differentiates from other interfaces.
	IsKtranslationUnitContext()
}

type KtranslationUnitContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyKtranslationUnitContext() *KtranslationUnitContext {
	var p = new(KtranslationUnitContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_ktranslationUnit
	return p
}

func (*KtranslationUnitContext) IsKtranslationUnitContext() {}

func NewKtranslationUnitContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *KtranslationUnitContext {
	var p = new(KtranslationUnitContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_ktranslationUnit

	return p
}

func (s *KtranslationUnitContext) GetParser() antlr.Parser { return s.parser }

func (s *KtranslationUnitContext) ArrayDeclaration() IArrayDeclarationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IArrayDeclarationContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IArrayDeclarationContext)
}

func (s *KtranslationUnitContext) QueryCommand() IQueryCommandContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IQueryCommandContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IQueryCommandContext)
}

func (s *KtranslationUnitContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *KtranslationUnitContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *KtranslationUnitContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterKtranslationUnit(s)
	}
}

func (s *KtranslationUnitContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitKtranslationUnit(s)
	}
}

func (s *KtranslationUnitContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitKtranslationUnit(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) KtranslationUnit() (localctx IKtranslationUnitContext) {
	localctx = NewKtranslationUnitContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 2, KQueryParserRULE_ktranslationUnit)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(82)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case KQueryParserArray:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(80)
			p.ArrayDeclaration()
		}

	case KQueryParserLeftParen:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(81)
			p.QueryCommand()
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IQueryCommandContext is an interface to support dynamic dispatch.
type IQueryCommandContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsQueryCommandContext differentiates from other interfaces.
	IsQueryCommandContext()
}

type QueryCommandContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyQueryCommandContext() *QueryCommandContext {
	var p = new(QueryCommandContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_queryCommand
	return p
}

func (*QueryCommandContext) IsQueryCommandContext() {}

func NewQueryCommandContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *QueryCommandContext {
	var p = new(QueryCommandContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_queryCommand

	return p
}

func (s *QueryCommandContext) GetParser() antlr.Parser { return s.parser }

func (s *QueryCommandContext) LeftParen() antlr.TerminalNode {
	return s.GetToken(KQueryParserLeftParen, 0)
}

func (s *QueryCommandContext) Query() antlr.TerminalNode {
	return s.GetToken(KQueryParserQuery, 0)
}

func (s *QueryCommandContext) EvalExprList() IEvalExprListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IEvalExprListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IEvalExprListContext)
}

func (s *QueryCommandContext) QueryExpr() IQueryExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IQueryExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IQueryExprContext)
}

func (s *QueryCommandContext) RightParen() antlr.TerminalNode {
	return s.GetToken(KQueryParserRightParen, 0)
}

func (s *QueryCommandContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *QueryCommandContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *QueryCommandContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterQueryCommand(s)
	}
}

func (s *QueryCommandContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitQueryCommand(s)
	}
}

func (s *QueryCommandContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitQueryCommand(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) QueryCommand() (localctx IQueryCommandContext) {
	localctx = NewQueryCommandContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, KQueryParserRULE_queryCommand)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(84)
		p.Match(KQueryParserLeftParen)
	}
	{
		p.SetState(85)
		p.Match(KQueryParserQuery)
	}
	{
		p.SetState(86)
		p.EvalExprList()
	}
	{
		p.SetState(87)
		p.QueryExpr()
	}
	{
		p.SetState(88)
		p.Match(KQueryParserRightParen)
	}

	return localctx
}

// IQueryExprContext is an interface to support dynamic dispatch.
type IQueryExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsQueryExprContext differentiates from other interfaces.
	IsQueryExprContext()
}

type QueryExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyQueryExprContext() *QueryExprContext {
	var p = new(QueryExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_queryExpr
	return p
}

func (*QueryExprContext) IsQueryExprContext() {}

func NewQueryExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *QueryExprContext {
	var p = new(QueryExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_queryExpr

	return p
}

func (s *QueryExprContext) GetParser() antlr.Parser { return s.parser }

func (s *QueryExprContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *QueryExprContext) EvalExprList() IEvalExprListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IEvalExprListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IEvalExprListContext)
}

func (s *QueryExprContext) EvalArrayList() IEvalArrayListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IEvalArrayListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IEvalArrayListContext)
}

func (s *QueryExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *QueryExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *QueryExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterQueryExpr(s)
	}
}

func (s *QueryExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitQueryExpr(s)
	}
}

func (s *QueryExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitQueryExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) QueryExpr() (localctx IQueryExprContext) {
	localctx = NewQueryExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, KQueryParserRULE_queryExpr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(98)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 2, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(90)
			p.Expression()
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(91)
			p.Expression()
		}
		{
			p.SetState(92)
			p.EvalExprList()
		}

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(94)
			p.Expression()
		}
		{
			p.SetState(95)
			p.EvalExprList()
		}
		{
			p.SetState(96)
			p.EvalArrayList()
		}

	}

	return localctx
}

// IEvalExprListContext is an interface to support dynamic dispatch.
type IEvalExprListContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsEvalExprListContext differentiates from other interfaces.
	IsEvalExprListContext()
}

type EvalExprListContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyEvalExprListContext() *EvalExprListContext {
	var p = new(EvalExprListContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_evalExprList
	return p
}

func (*EvalExprListContext) IsEvalExprListContext() {}

func NewEvalExprListContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *EvalExprListContext {
	var p = new(EvalExprListContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_evalExprList

	return p
}

func (s *EvalExprListContext) GetParser() antlr.Parser { return s.parser }

func (s *EvalExprListContext) LeftBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserLeftBracket, 0)
}

func (s *EvalExprListContext) RightBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserRightBracket, 0)
}

func (s *EvalExprListContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *EvalExprListContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *EvalExprListContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *EvalExprListContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *EvalExprListContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterEvalExprList(s)
	}
}

func (s *EvalExprListContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitEvalExprList(s)
	}
}

func (s *EvalExprListContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitEvalExprList(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) EvalExprList() (localctx IEvalExprListContext) {
	localctx = NewEvalExprListContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 8, KQueryParserRULE_evalExprList)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(100)
		p.Match(KQueryParserLeftBracket)
	}
	p.SetState(104)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for (((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<KQueryParserBoolean)|(1<<KQueryParserSignedConstant)|(1<<KQueryParserConstant))) != 0) || (((_la-60)&-(0x1f+1)) == 0 && ((1<<uint((_la-60)))&((1<<(KQueryParserIdentifier-60))|(1<<(KQueryParserLeftParen-60))|(1<<(KQueryParserLeftBracket-60)))) != 0) {
		{
			p.SetState(101)
			p.Expression()
		}

		p.SetState(106)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(107)
		p.Match(KQueryParserRightBracket)
	}

	return localctx
}

// IEvalArrayListContext is an interface to support dynamic dispatch.
type IEvalArrayListContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsEvalArrayListContext differentiates from other interfaces.
	IsEvalArrayListContext()
}

type EvalArrayListContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyEvalArrayListContext() *EvalArrayListContext {
	var p = new(EvalArrayListContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_evalArrayList
	return p
}

func (*EvalArrayListContext) IsEvalArrayListContext() {}

func NewEvalArrayListContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *EvalArrayListContext {
	var p = new(EvalArrayListContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_evalArrayList

	return p
}

func (s *EvalArrayListContext) GetParser() antlr.Parser { return s.parser }

func (s *EvalArrayListContext) LeftBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserLeftBracket, 0)
}

func (s *EvalArrayListContext) RightBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserRightBracket, 0)
}

func (s *EvalArrayListContext) AllIdentifier() []antlr.TerminalNode {
	return s.GetTokens(KQueryParserIdentifier)
}

func (s *EvalArrayListContext) Identifier(i int) antlr.TerminalNode {
	return s.GetToken(KQueryParserIdentifier, i)
}

func (s *EvalArrayListContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *EvalArrayListContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *EvalArrayListContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterEvalArrayList(s)
	}
}

func (s *EvalArrayListContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitEvalArrayList(s)
	}
}

func (s *EvalArrayListContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitEvalArrayList(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) EvalArrayList() (localctx IEvalArrayListContext) {
	localctx = NewEvalArrayListContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 10, KQueryParserRULE_evalArrayList)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(109)
		p.Match(KQueryParserLeftBracket)
	}
	p.SetState(113)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for _la == KQueryParserIdentifier {
		{
			p.SetState(110)
			p.Match(KQueryParserIdentifier)
		}

		p.SetState(115)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(116)
		p.Match(KQueryParserRightBracket)
	}

	return localctx
}

// IArrayDeclarationContext is an interface to support dynamic dispatch.
type IArrayDeclarationContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsArrayDeclarationContext differentiates from other interfaces.
	IsArrayDeclarationContext()
}

type ArrayDeclarationContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyArrayDeclarationContext() *ArrayDeclarationContext {
	var p = new(ArrayDeclarationContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_arrayDeclaration
	return p
}

func (*ArrayDeclarationContext) IsArrayDeclarationContext() {}

func NewArrayDeclarationContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ArrayDeclarationContext {
	var p = new(ArrayDeclarationContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_arrayDeclaration

	return p
}

func (s *ArrayDeclarationContext) GetParser() antlr.Parser { return s.parser }

func (s *ArrayDeclarationContext) Array() antlr.TerminalNode {
	return s.GetToken(KQueryParserArray, 0)
}

func (s *ArrayDeclarationContext) ArrName() IArrNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IArrNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IArrNameContext)
}

func (s *ArrayDeclarationContext) LeftBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserLeftBracket, 0)
}

func (s *ArrayDeclarationContext) NumArrayElements() INumArrayElementsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*INumArrayElementsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(INumArrayElementsContext)
}

func (s *ArrayDeclarationContext) RightBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserRightBracket, 0)
}

func (s *ArrayDeclarationContext) Colon() antlr.TerminalNode {
	return s.GetToken(KQueryParserColon, 0)
}

func (s *ArrayDeclarationContext) Domain() IDomainContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDomainContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDomainContext)
}

func (s *ArrayDeclarationContext) Arrow() antlr.TerminalNode {
	return s.GetToken(KQueryParserArrow, 0)
}

func (s *ArrayDeclarationContext) RangeLimit() IRangeLimitContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IRangeLimitContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IRangeLimitContext)
}

func (s *ArrayDeclarationContext) Equal() antlr.TerminalNode {
	return s.GetToken(KQueryParserEqual, 0)
}

func (s *ArrayDeclarationContext) ArrayInitializer() IArrayInitializerContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IArrayInitializerContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IArrayInitializerContext)
}

func (s *ArrayDeclarationContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ArrayDeclarationContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ArrayDeclarationContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterArrayDeclaration(s)
	}
}

func (s *ArrayDeclarationContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitArrayDeclaration(s)
	}
}

func (s *ArrayDeclarationContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitArrayDeclaration(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) ArrayDeclaration() (localctx IArrayDeclarationContext) {
	localctx = NewArrayDeclarationContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, KQueryParserRULE_arrayDeclaration)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(118)
		p.Match(KQueryParserArray)
	}
	{
		p.SetState(119)
		p.ArrName()
	}
	{
		p.SetState(120)
		p.Match(KQueryParserLeftBracket)
	}
	{
		p.SetState(121)
		p.NumArrayElements()
	}
	{
		p.SetState(122)
		p.Match(KQueryParserRightBracket)
	}
	{
		p.SetState(123)
		p.Match(KQueryParserColon)
	}
	{
		p.SetState(124)
		p.Domain()
	}
	{
		p.SetState(125)
		p.Match(KQueryParserArrow)
	}
	{
		p.SetState(126)
		p.RangeLimit()
	}
	{
		p.SetState(127)
		p.Match(KQueryParserEqual)
	}
	{
		p.SetState(128)
		p.ArrayInitializer()
	}

	return localctx
}

// INumArrayElementsContext is an interface to support dynamic dispatch.
type INumArrayElementsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsNumArrayElementsContext differentiates from other interfaces.
	IsNumArrayElementsContext()
}

type NumArrayElementsContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyNumArrayElementsContext() *NumArrayElementsContext {
	var p = new(NumArrayElementsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_numArrayElements
	return p
}

func (*NumArrayElementsContext) IsNumArrayElementsContext() {}

func NewNumArrayElementsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *NumArrayElementsContext {
	var p = new(NumArrayElementsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_numArrayElements

	return p
}

func (s *NumArrayElementsContext) GetParser() antlr.Parser { return s.parser }

func (s *NumArrayElementsContext) Constant() antlr.TerminalNode {
	return s.GetToken(KQueryParserConstant, 0)
}

func (s *NumArrayElementsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NumArrayElementsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *NumArrayElementsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterNumArrayElements(s)
	}
}

func (s *NumArrayElementsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitNumArrayElements(s)
	}
}

func (s *NumArrayElementsContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitNumArrayElements(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) NumArrayElements() (localctx INumArrayElementsContext) {
	localctx = NewNumArrayElementsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 14, KQueryParserRULE_numArrayElements)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(130)
		p.Match(KQueryParserConstant)
	}

	return localctx
}

// IArrayInitializerContext is an interface to support dynamic dispatch.
type IArrayInitializerContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsArrayInitializerContext differentiates from other interfaces.
	IsArrayInitializerContext()
}

type ArrayInitializerContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyArrayInitializerContext() *ArrayInitializerContext {
	var p = new(ArrayInitializerContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_arrayInitializer
	return p
}

func (*ArrayInitializerContext) IsArrayInitializerContext() {}

func NewArrayInitializerContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ArrayInitializerContext {
	var p = new(ArrayInitializerContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_arrayInitializer

	return p
}

func (s *ArrayInitializerContext) GetParser() antlr.Parser { return s.parser }

func (s *ArrayInitializerContext) Symbolic() antlr.TerminalNode {
	return s.GetToken(KQueryParserSymbolic, 0)
}

func (s *ArrayInitializerContext) LeftBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserLeftBracket, 0)
}

func (s *ArrayInitializerContext) NumberList() INumberListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*INumberListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(INumberListContext)
}

func (s *ArrayInitializerContext) RightBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserRightBracket, 0)
}

func (s *ArrayInitializerContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ArrayInitializerContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ArrayInitializerContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterArrayInitializer(s)
	}
}

func (s *ArrayInitializerContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitArrayInitializer(s)
	}
}

func (s *ArrayInitializerContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitArrayInitializer(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) ArrayInitializer() (localctx IArrayInitializerContext) {
	localctx = NewArrayInitializerContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, KQueryParserRULE_arrayInitializer)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(137)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case KQueryParserSymbolic:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(132)
			p.Match(KQueryParserSymbolic)
		}

	case KQueryParserLeftBracket:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(133)
			p.Match(KQueryParserLeftBracket)
		}
		{
			p.SetState(134)
			p.NumberList()
		}
		{
			p.SetState(135)
			p.Match(KQueryParserRightBracket)
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IExpressionContext is an interface to support dynamic dispatch.
type IExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsExpressionContext differentiates from other interfaces.
	IsExpressionContext()
}

type ExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyExpressionContext() *ExpressionContext {
	var p = new(ExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_expression
	return p
}

func (*ExpressionContext) IsExpressionContext() {}

func NewExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpressionContext {
	var p = new(ExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_expression

	return p
}

func (s *ExpressionContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpressionContext) VarName() IVarNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IVarNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IVarNameContext)
}

func (s *ExpressionContext) NamedConstant() INamedConstantContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*INamedConstantContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(INamedConstantContext)
}

func (s *ExpressionContext) Colon() antlr.TerminalNode {
	return s.GetToken(KQueryParserColon, 0)
}

func (s *ExpressionContext) FullyQualifiedExpression() IFullyQualifiedExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFullyQualifiedExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFullyQualifiedExpressionContext)
}

func (s *ExpressionContext) LeftParen() antlr.TerminalNode {
	return s.GetToken(KQueryParserLeftParen, 0)
}

func (s *ExpressionContext) WidthOrSizeExpr() IWidthOrSizeExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IWidthOrSizeExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IWidthOrSizeExprContext)
}

func (s *ExpressionContext) Number() INumberContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*INumberContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(INumberContext)
}

func (s *ExpressionContext) RightParen() antlr.TerminalNode {
	return s.GetToken(KQueryParserRightParen, 0)
}

func (s *ExpressionContext) ArithmeticExpr() IArithmeticExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IArithmeticExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IArithmeticExprContext)
}

func (s *ExpressionContext) LeftExpr() ILeftExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ILeftExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ILeftExprContext)
}

func (s *ExpressionContext) RightExpr() IRightExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IRightExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IRightExprContext)
}

func (s *ExpressionContext) NotExpr() INotExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*INotExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(INotExprContext)
}

func (s *ExpressionContext) LeftBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserLeftBracket, 0)
}

func (s *ExpressionContext) RightBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserRightBracket, 0)
}

func (s *ExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ExpressionContext) BitwiseExpr() IBitwiseExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBitwiseExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBitwiseExprContext)
}

func (s *ExpressionContext) ComparisonExpr() IComparisonExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IComparisonExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IComparisonExprContext)
}

func (s *ExpressionContext) ConcatExpr() IConcatExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IConcatExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IConcatExprContext)
}

func (s *ExpressionContext) ArrExtractExpr() IArrExtractExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IArrExtractExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IArrExtractExprContext)
}

func (s *ExpressionContext) BitExtractExpr() IBitExtractExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBitExtractExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBitExtractExprContext)
}

func (s *ExpressionContext) GenericBitRead() IGenericBitReadContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IGenericBitReadContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IGenericBitReadContext)
}

func (s *ExpressionContext) Version() IVersionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IVersionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IVersionContext)
}

func (s *ExpressionContext) SelectExpr() ISelectExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ISelectExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ISelectExprContext)
}

func (s *ExpressionContext) ExprNegation() IExprNegationContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExprNegationContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExprNegationContext)
}

func (s *ExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpressionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterExpression(s)
	}
}

func (s *ExpressionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitExpression(s)
	}
}

func (s *ExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) Expression() (localctx IExpressionContext) {
	localctx = NewExpressionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, KQueryParserRULE_expression)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(244)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 6, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(139)
			p.VarName()
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(140)
			p.NamedConstant()
		}
		{
			p.SetState(141)
			p.Match(KQueryParserColon)
		}
		{
			p.SetState(142)
			p.FullyQualifiedExpression()
		}

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(144)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(145)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(146)
			p.Number()
		}
		{
			p.SetState(147)
			p.Match(KQueryParserRightParen)
		}

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(149)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(150)
			p.ArithmeticExpr()
		}
		{
			p.SetState(151)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(152)
			p.LeftExpr()
		}
		{
			p.SetState(153)
			p.RightExpr()
		}
		{
			p.SetState(154)
			p.Match(KQueryParserRightParen)
		}

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(156)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(157)
			p.NotExpr()
		}
		{
			p.SetState(158)
			p.Match(KQueryParserLeftBracket)
		}
		{
			p.SetState(159)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(160)
			p.Match(KQueryParserRightBracket)
		}
		{
			p.SetState(161)
			p.Expression()
		}
		{
			p.SetState(162)
			p.Match(KQueryParserRightParen)
		}

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(164)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(165)
			p.BitwiseExpr()
		}
		{
			p.SetState(166)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(167)
			p.LeftExpr()
		}
		{
			p.SetState(168)
			p.RightExpr()
		}
		{
			p.SetState(169)
			p.Match(KQueryParserRightParen)
		}

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(171)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(172)
			p.ComparisonExpr()
		}
		{
			p.SetState(173)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(174)
			p.LeftExpr()
		}
		{
			p.SetState(175)
			p.RightExpr()
		}
		{
			p.SetState(176)
			p.Match(KQueryParserRightParen)
		}

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(178)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(179)
			p.ComparisonExpr()
		}
		{
			p.SetState(180)
			p.LeftExpr()
		}
		{
			p.SetState(181)
			p.RightExpr()
		}
		{
			p.SetState(182)
			p.Match(KQueryParserRightParen)
		}

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(184)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(185)
			p.ConcatExpr()
		}
		{
			p.SetState(186)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(187)
			p.LeftExpr()
		}
		{
			p.SetState(188)
			p.RightExpr()
		}
		{
			p.SetState(189)
			p.Match(KQueryParserRightParen)
		}

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(191)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(192)
			p.ConcatExpr()
		}
		{
			p.SetState(193)
			p.LeftExpr()
		}
		{
			p.SetState(194)
			p.RightExpr()
		}
		{
			p.SetState(195)
			p.Match(KQueryParserRightParen)
		}

	case 11:
		p.EnterOuterAlt(localctx, 11)
		{
			p.SetState(197)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(198)
			p.ArrExtractExpr()
		}
		{
			p.SetState(199)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(200)
			p.Number()
		}
		{
			p.SetState(201)
			p.Expression()
		}
		{
			p.SetState(202)
			p.Match(KQueryParserRightParen)
		}

	case 12:
		p.EnterOuterAlt(localctx, 12)
		{
			p.SetState(204)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(205)
			p.BitExtractExpr()
		}
		{
			p.SetState(206)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(207)
			p.Expression()
		}
		{
			p.SetState(208)
			p.Match(KQueryParserRightParen)
		}

	case 13:
		p.EnterOuterAlt(localctx, 13)
		{
			p.SetState(210)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(211)
			p.GenericBitRead()
		}
		{
			p.SetState(212)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(213)
			p.Expression()
		}
		{
			p.SetState(214)
			p.Version()
		}
		{
			p.SetState(215)
			p.Match(KQueryParserRightParen)
		}

	case 14:
		p.EnterOuterAlt(localctx, 14)
		{
			p.SetState(217)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(218)
			p.SelectExpr()
		}
		{
			p.SetState(219)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(220)
			p.LeftExpr()
		}
		{
			p.SetState(221)
			p.RightExpr()
		}
		{
			p.SetState(222)
			p.Expression()
		}
		{
			p.SetState(223)
			p.Match(KQueryParserRightParen)
		}

	case 15:
		p.EnterOuterAlt(localctx, 15)
		{
			p.SetState(225)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(226)
			p.ExprNegation()
		}
		{
			p.SetState(227)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(228)
			p.Expression()
		}
		{
			p.SetState(229)
			p.Match(KQueryParserRightParen)
		}

	case 16:
		p.EnterOuterAlt(localctx, 16)
		{
			p.SetState(231)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(232)
			p.ExprNegation()
		}
		{
			p.SetState(233)
			p.Expression()
		}
		{
			p.SetState(234)
			p.Match(KQueryParserRightParen)
		}

	case 17:
		p.EnterOuterAlt(localctx, 17)
		{
			p.SetState(236)
			p.Match(KQueryParserLeftParen)
		}
		{
			p.SetState(237)
			p.GenericBitRead()
		}
		{
			p.SetState(238)
			p.WidthOrSizeExpr()
		}
		{
			p.SetState(239)
			p.Expression()
		}
		{
			p.SetState(240)
			p.Match(KQueryParserRightParen)
		}

	case 18:
		p.EnterOuterAlt(localctx, 18)
		{
			p.SetState(242)
			p.Version()
		}

	case 19:
		p.EnterOuterAlt(localctx, 19)
		{
			p.SetState(243)
			p.Number()
		}

	}

	return localctx
}

// IGenericBitReadContext is an interface to support dynamic dispatch.
type IGenericBitReadContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsGenericBitReadContext differentiates from other interfaces.
	IsGenericBitReadContext()
}

type GenericBitReadContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyGenericBitReadContext() *GenericBitReadContext {
	var p = new(GenericBitReadContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_genericBitRead
	return p
}

func (*GenericBitReadContext) IsGenericBitReadContext() {}

func NewGenericBitReadContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *GenericBitReadContext {
	var p = new(GenericBitReadContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_genericBitRead

	return p
}

func (s *GenericBitReadContext) GetParser() antlr.Parser { return s.parser }

func (s *GenericBitReadContext) READ() antlr.TerminalNode {
	return s.GetToken(KQueryParserREAD, 0)
}

func (s *GenericBitReadContext) READLSB() antlr.TerminalNode {
	return s.GetToken(KQueryParserREADLSB, 0)
}

func (s *GenericBitReadContext) READMSB() antlr.TerminalNode {
	return s.GetToken(KQueryParserREADMSB, 0)
}

func (s *GenericBitReadContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *GenericBitReadContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *GenericBitReadContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterGenericBitRead(s)
	}
}

func (s *GenericBitReadContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitGenericBitRead(s)
	}
}

func (s *GenericBitReadContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitGenericBitRead(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) GenericBitRead() (localctx IGenericBitReadContext) {
	localctx = NewGenericBitReadContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 20, KQueryParserRULE_genericBitRead)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(246)
		_la = p.GetTokenStream().LA(1)

		if !(((_la-31)&-(0x1f+1)) == 0 && ((1<<uint((_la-31)))&((1<<(KQueryParserREAD-31))|(1<<(KQueryParserREADLSB-31))|(1<<(KQueryParserREADMSB-31)))) != 0) {
			p.GetErrorHandler().RecoverInline(p)
		} else {
			p.GetErrorHandler().ReportMatch(p)
			p.Consume()
		}
	}

	return localctx
}

// IBitExtractExprContext is an interface to support dynamic dispatch.
type IBitExtractExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsBitExtractExprContext differentiates from other interfaces.
	IsBitExtractExprContext()
}

type BitExtractExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyBitExtractExprContext() *BitExtractExprContext {
	var p = new(BitExtractExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_bitExtractExpr
	return p
}

func (*BitExtractExprContext) IsBitExtractExprContext() {}

func NewBitExtractExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BitExtractExprContext {
	var p = new(BitExtractExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_bitExtractExpr

	return p
}

func (s *BitExtractExprContext) GetParser() antlr.Parser { return s.parser }

func (s *BitExtractExprContext) ZEXT() antlr.TerminalNode {
	return s.GetToken(KQueryParserZEXT, 0)
}

func (s *BitExtractExprContext) SEXT() antlr.TerminalNode {
	return s.GetToken(KQueryParserSEXT, 0)
}

func (s *BitExtractExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BitExtractExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BitExtractExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterBitExtractExpr(s)
	}
}

func (s *BitExtractExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitBitExtractExpr(s)
	}
}

func (s *BitExtractExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitBitExtractExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) BitExtractExpr() (localctx IBitExtractExprContext) {
	localctx = NewBitExtractExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 22, KQueryParserRULE_bitExtractExpr)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(248)
		_la = p.GetTokenStream().LA(1)

		if !(_la == KQueryParserZEXT || _la == KQueryParserSEXT) {
			p.GetErrorHandler().RecoverInline(p)
		} else {
			p.GetErrorHandler().ReportMatch(p)
			p.Consume()
		}
	}

	return localctx
}

// IVersionContext is an interface to support dynamic dispatch.
type IVersionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsVersionContext differentiates from other interfaces.
	IsVersionContext()
}

type VersionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyVersionContext() *VersionContext {
	var p = new(VersionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_version
	return p
}

func (*VersionContext) IsVersionContext() {}

func NewVersionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *VersionContext {
	var p = new(VersionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_version

	return p
}

func (s *VersionContext) GetParser() antlr.Parser { return s.parser }

func (s *VersionContext) VarName() IVarNameContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IVarNameContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IVarNameContext)
}

func (s *VersionContext) NamedConstant() INamedConstantContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*INamedConstantContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(INamedConstantContext)
}

func (s *VersionContext) Colon() antlr.TerminalNode {
	return s.GetToken(KQueryParserColon, 0)
}

func (s *VersionContext) FullyQualifiedExpression() IFullyQualifiedExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFullyQualifiedExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFullyQualifiedExpressionContext)
}

func (s *VersionContext) LeftBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserLeftBracket, 0)
}

func (s *VersionContext) UpdateList() IUpdateListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IUpdateListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IUpdateListContext)
}

func (s *VersionContext) RightBracket() antlr.TerminalNode {
	return s.GetToken(KQueryParserRightBracket, 0)
}

func (s *VersionContext) ATR() antlr.TerminalNode {
	return s.GetToken(KQueryParserATR, 0)
}

func (s *VersionContext) Version() IVersionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IVersionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IVersionContext)
}

func (s *VersionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VersionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *VersionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterVersion(s)
	}
}

func (s *VersionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitVersion(s)
	}
}

func (s *VersionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitVersion(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) Version() (localctx IVersionContext) {
	localctx = NewVersionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 24, KQueryParserRULE_version)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(265)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 7, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(250)
			p.VarName()
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(251)
			p.NamedConstant()
		}
		{
			p.SetState(252)
			p.Match(KQueryParserColon)
		}
		{
			p.SetState(253)
			p.FullyQualifiedExpression()
		}

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(255)
			p.Match(KQueryParserLeftBracket)
		}
		{
			p.SetState(256)
			p.UpdateList()
		}
		{
			p.SetState(257)
			p.Match(KQueryParserRightBracket)
		}
		{
			p.SetState(258)
			p.Match(KQueryParserATR)
		}
		{
			p.SetState(259)
			p.Version()
		}

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(261)
			p.Match(KQueryParserLeftBracket)
		}
		{
			p.SetState(262)
			p.Match(KQueryParserRightBracket)
		}
		{
			p.SetState(263)
			p.Match(KQueryParserATR)
		}
		{
			p.SetState(264)
			p.Version()
		}

	}

	return localctx
}

// IFullyQualifiedExpressionContext is an interface to support dynamic dispatch.
type IFullyQualifiedExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsFullyQualifiedExpressionContext differentiates from other interfaces.
	IsFullyQualifiedExpressionContext()
}

type FullyQualifiedExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyFullyQualifiedExpressionContext() *FullyQualifiedExpressionContext {
	var p = new(FullyQualifiedExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_fullyQualifiedExpression
	return p
}

func (*FullyQualifiedExpressionContext) IsFullyQualifiedExpressionContext() {}

func NewFullyQualifiedExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FullyQualifiedExpressionContext {
	var p = new(FullyQualifiedExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_fullyQualifiedExpression

	return p
}

func (s *FullyQualifiedExpressionContext) GetParser() antlr.Parser { return s.parser }

func (s *FullyQualifiedExpressionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *FullyQualifiedExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FullyQualifiedExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FullyQualifiedExpressionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterFullyQualifiedExpression(s)
	}
}

func (s *FullyQualifiedExpressionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitFullyQualifiedExpression(s)
	}
}

func (s *FullyQualifiedExpressionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitFullyQualifiedExpression(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) FullyQualifiedExpression() (localctx IFullyQualifiedExpressionContext) {
	localctx = NewFullyQualifiedExpressionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 26, KQueryParserRULE_fullyQualifiedExpression)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(267)
		p.Expression()
	}

	return localctx
}

// INotExprContext is an interface to support dynamic dispatch.
type INotExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsNotExprContext differentiates from other interfaces.
	IsNotExprContext()
}

type NotExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyNotExprContext() *NotExprContext {
	var p = new(NotExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_notExpr
	return p
}

func (*NotExprContext) IsNotExprContext() {}

func NewNotExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *NotExprContext {
	var p = new(NotExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_notExpr

	return p
}

func (s *NotExprContext) GetParser() antlr.Parser { return s.parser }

func (s *NotExprContext) NOT() antlr.TerminalNode {
	return s.GetToken(KQueryParserNOT, 0)
}

func (s *NotExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NotExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *NotExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterNotExpr(s)
	}
}

func (s *NotExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitNotExpr(s)
	}
}

func (s *NotExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitNotExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) NotExpr() (localctx INotExprContext) {
	localctx = NewNotExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 28, KQueryParserRULE_notExpr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(269)
		p.Match(KQueryParserNOT)
	}

	return localctx
}

// IConcatExprContext is an interface to support dynamic dispatch.
type IConcatExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsConcatExprContext differentiates from other interfaces.
	IsConcatExprContext()
}

type ConcatExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyConcatExprContext() *ConcatExprContext {
	var p = new(ConcatExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_concatExpr
	return p
}

func (*ConcatExprContext) IsConcatExprContext() {}

func NewConcatExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ConcatExprContext {
	var p = new(ConcatExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_concatExpr

	return p
}

func (s *ConcatExprContext) GetParser() antlr.Parser { return s.parser }

func (s *ConcatExprContext) CONCAT() antlr.TerminalNode {
	return s.GetToken(KQueryParserCONCAT, 0)
}

func (s *ConcatExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ConcatExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ConcatExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterConcatExpr(s)
	}
}

func (s *ConcatExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitConcatExpr(s)
	}
}

func (s *ConcatExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitConcatExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) ConcatExpr() (localctx IConcatExprContext) {
	localctx = NewConcatExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 30, KQueryParserRULE_concatExpr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(271)
		p.Match(KQueryParserCONCAT)
	}

	return localctx
}

// IExprNegationContext is an interface to support dynamic dispatch.
type IExprNegationContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsExprNegationContext differentiates from other interfaces.
	IsExprNegationContext()
}

type ExprNegationContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyExprNegationContext() *ExprNegationContext {
	var p = new(ExprNegationContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_exprNegation
	return p
}

func (*ExprNegationContext) IsExprNegationContext() {}

func NewExprNegationContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExprNegationContext {
	var p = new(ExprNegationContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_exprNegation

	return p
}

func (s *ExprNegationContext) GetParser() antlr.Parser { return s.parser }

func (s *ExprNegationContext) NEGETION() antlr.TerminalNode {
	return s.GetToken(KQueryParserNEGETION, 0)
}

func (s *ExprNegationContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExprNegationContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExprNegationContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterExprNegation(s)
	}
}

func (s *ExprNegationContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitExprNegation(s)
	}
}

func (s *ExprNegationContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitExprNegation(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) ExprNegation() (localctx IExprNegationContext) {
	localctx = NewExprNegationContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 32, KQueryParserRULE_exprNegation)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(273)
		p.Match(KQueryParserNEGETION)
	}

	return localctx
}

// ISelectExprContext is an interface to support dynamic dispatch.
type ISelectExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsSelectExprContext differentiates from other interfaces.
	IsSelectExprContext()
}

type SelectExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySelectExprContext() *SelectExprContext {
	var p = new(SelectExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_selectExpr
	return p
}

func (*SelectExprContext) IsSelectExprContext() {}

func NewSelectExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SelectExprContext {
	var p = new(SelectExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_selectExpr

	return p
}

func (s *SelectExprContext) GetParser() antlr.Parser { return s.parser }

func (s *SelectExprContext) SELECT() antlr.TerminalNode {
	return s.GetToken(KQueryParserSELECT, 0)
}

func (s *SelectExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SelectExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SelectExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterSelectExpr(s)
	}
}

func (s *SelectExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitSelectExpr(s)
	}
}

func (s *SelectExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitSelectExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) SelectExpr() (localctx ISelectExprContext) {
	localctx = NewSelectExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 34, KQueryParserRULE_selectExpr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(275)
		p.Match(KQueryParserSELECT)
	}

	return localctx
}

// IArrExtractExprContext is an interface to support dynamic dispatch.
type IArrExtractExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsArrExtractExprContext differentiates from other interfaces.
	IsArrExtractExprContext()
}

type ArrExtractExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyArrExtractExprContext() *ArrExtractExprContext {
	var p = new(ArrExtractExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_arrExtractExpr
	return p
}

func (*ArrExtractExprContext) IsArrExtractExprContext() {}

func NewArrExtractExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ArrExtractExprContext {
	var p = new(ArrExtractExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_arrExtractExpr

	return p
}

func (s *ArrExtractExprContext) GetParser() antlr.Parser { return s.parser }

func (s *ArrExtractExprContext) EXTRACT() antlr.TerminalNode {
	return s.GetToken(KQueryParserEXTRACT, 0)
}

func (s *ArrExtractExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ArrExtractExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ArrExtractExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterArrExtractExpr(s)
	}
}

func (s *ArrExtractExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitArrExtractExpr(s)
	}
}

func (s *ArrExtractExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitArrExtractExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) ArrExtractExpr() (localctx IArrExtractExprContext) {
	localctx = NewArrExtractExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 36, KQueryParserRULE_arrExtractExpr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(277)
		p.Match(KQueryParserEXTRACT)
	}

	return localctx
}

// IVarNameContext is an interface to support dynamic dispatch.
type IVarNameContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsVarNameContext differentiates from other interfaces.
	IsVarNameContext()
}

type VarNameContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyVarNameContext() *VarNameContext {
	var p = new(VarNameContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_varName
	return p
}

func (*VarNameContext) IsVarNameContext() {}

func NewVarNameContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *VarNameContext {
	var p = new(VarNameContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_varName

	return p
}

func (s *VarNameContext) GetParser() antlr.Parser { return s.parser }

func (s *VarNameContext) Identifier() antlr.TerminalNode {
	return s.GetToken(KQueryParserIdentifier, 0)
}

func (s *VarNameContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *VarNameContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *VarNameContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterVarName(s)
	}
}

func (s *VarNameContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitVarName(s)
	}
}

func (s *VarNameContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitVarName(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) VarName() (localctx IVarNameContext) {
	localctx = NewVarNameContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 38, KQueryParserRULE_varName)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(279)
		p.Match(KQueryParserIdentifier)
	}

	return localctx
}

// ILeftExprContext is an interface to support dynamic dispatch.
type ILeftExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsLeftExprContext differentiates from other interfaces.
	IsLeftExprContext()
}

type LeftExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyLeftExprContext() *LeftExprContext {
	var p = new(LeftExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_leftExpr
	return p
}

func (*LeftExprContext) IsLeftExprContext() {}

func NewLeftExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *LeftExprContext {
	var p = new(LeftExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_leftExpr

	return p
}

func (s *LeftExprContext) GetParser() antlr.Parser { return s.parser }

func (s *LeftExprContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *LeftExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LeftExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *LeftExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterLeftExpr(s)
	}
}

func (s *LeftExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitLeftExpr(s)
	}
}

func (s *LeftExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitLeftExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) LeftExpr() (localctx ILeftExprContext) {
	localctx = NewLeftExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 40, KQueryParserRULE_leftExpr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(281)
		p.Expression()
	}

	return localctx
}

// IRightExprContext is an interface to support dynamic dispatch.
type IRightExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsRightExprContext differentiates from other interfaces.
	IsRightExprContext()
}

type RightExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyRightExprContext() *RightExprContext {
	var p = new(RightExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_rightExpr
	return p
}

func (*RightExprContext) IsRightExprContext() {}

func NewRightExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *RightExprContext {
	var p = new(RightExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_rightExpr

	return p
}

func (s *RightExprContext) GetParser() antlr.Parser { return s.parser }

func (s *RightExprContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *RightExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *RightExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *RightExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterRightExpr(s)
	}
}

func (s *RightExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitRightExpr(s)
	}
}

func (s *RightExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitRightExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) RightExpr() (localctx IRightExprContext) {
	localctx = NewRightExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 42, KQueryParserRULE_rightExpr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(283)
		p.Expression()
	}

	return localctx
}

// INamedConstantContext is an interface to support dynamic dispatch.
type INamedConstantContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsNamedConstantContext differentiates from other interfaces.
	IsNamedConstantContext()
}

type NamedConstantContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyNamedConstantContext() *NamedConstantContext {
	var p = new(NamedConstantContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_namedConstant
	return p
}

func (*NamedConstantContext) IsNamedConstantContext() {}

func NewNamedConstantContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *NamedConstantContext {
	var p = new(NamedConstantContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_namedConstant

	return p
}

func (s *NamedConstantContext) GetParser() antlr.Parser { return s.parser }

func (s *NamedConstantContext) Identifier() antlr.TerminalNode {
	return s.GetToken(KQueryParserIdentifier, 0)
}

func (s *NamedConstantContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NamedConstantContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *NamedConstantContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterNamedConstant(s)
	}
}

func (s *NamedConstantContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitNamedConstant(s)
	}
}

func (s *NamedConstantContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitNamedConstant(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) NamedConstant() (localctx INamedConstantContext) {
	localctx = NewNamedConstantContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 44, KQueryParserRULE_namedConstant)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(285)
		p.Match(KQueryParserIdentifier)
	}

	return localctx
}

// IUpdateListContext is an interface to support dynamic dispatch.
type IUpdateListContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsUpdateListContext differentiates from other interfaces.
	IsUpdateListContext()
}

type UpdateListContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyUpdateListContext() *UpdateListContext {
	var p = new(UpdateListContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_updateList
	return p
}

func (*UpdateListContext) IsUpdateListContext() {}

func NewUpdateListContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *UpdateListContext {
	var p = new(UpdateListContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_updateList

	return p
}

func (s *UpdateListContext) GetParser() antlr.Parser { return s.parser }

func (s *UpdateListContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *UpdateListContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *UpdateListContext) Equal() antlr.TerminalNode {
	return s.GetToken(KQueryParserEqual, 0)
}

func (s *UpdateListContext) COMMA() antlr.TerminalNode {
	return s.GetToken(KQueryParserCOMMA, 0)
}

func (s *UpdateListContext) UpdateList() IUpdateListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IUpdateListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IUpdateListContext)
}

func (s *UpdateListContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *UpdateListContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *UpdateListContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterUpdateList(s)
	}
}

func (s *UpdateListContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitUpdateList(s)
	}
}

func (s *UpdateListContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitUpdateList(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) UpdateList() (localctx IUpdateListContext) {
	localctx = NewUpdateListContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 46, KQueryParserRULE_updateList)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(297)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 8, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(287)
			p.Expression()
		}
		{
			p.SetState(288)
			p.Match(KQueryParserEqual)
		}
		{
			p.SetState(289)
			p.Expression()
		}
		{
			p.SetState(290)
			p.Match(KQueryParserCOMMA)
		}
		{
			p.SetState(291)
			p.UpdateList()
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(293)
			p.Expression()
		}
		{
			p.SetState(294)
			p.Match(KQueryParserEqual)
		}
		{
			p.SetState(295)
			p.Expression()
		}

	}

	return localctx
}

// IBitwiseExprContext is an interface to support dynamic dispatch.
type IBitwiseExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsBitwiseExprContext differentiates from other interfaces.
	IsBitwiseExprContext()
}

type BitwiseExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyBitwiseExprContext() *BitwiseExprContext {
	var p = new(BitwiseExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_bitwiseExpr
	return p
}

func (*BitwiseExprContext) IsBitwiseExprContext() {}

func NewBitwiseExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BitwiseExprContext {
	var p = new(BitwiseExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_bitwiseExpr

	return p
}

func (s *BitwiseExprContext) GetParser() antlr.Parser { return s.parser }

func (s *BitwiseExprContext) BITWISEAND() antlr.TerminalNode {
	return s.GetToken(KQueryParserBITWISEAND, 0)
}

func (s *BitwiseExprContext) BITWISEOR() antlr.TerminalNode {
	return s.GetToken(KQueryParserBITWISEOR, 0)
}

func (s *BitwiseExprContext) BITWISEXOR() antlr.TerminalNode {
	return s.GetToken(KQueryParserBITWISEXOR, 0)
}

func (s *BitwiseExprContext) SHL() antlr.TerminalNode {
	return s.GetToken(KQueryParserSHL, 0)
}

func (s *BitwiseExprContext) LSHR() antlr.TerminalNode {
	return s.GetToken(KQueryParserLSHR, 0)
}

func (s *BitwiseExprContext) ASHR() antlr.TerminalNode {
	return s.GetToken(KQueryParserASHR, 0)
}

func (s *BitwiseExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BitwiseExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BitwiseExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterBitwiseExpr(s)
	}
}

func (s *BitwiseExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitBitwiseExpr(s)
	}
}

func (s *BitwiseExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitBitwiseExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) BitwiseExpr() (localctx IBitwiseExprContext) {
	localctx = NewBitwiseExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 48, KQueryParserRULE_bitwiseExpr)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(299)
		_la = p.GetTokenStream().LA(1)

		if !(((_la-24)&-(0x1f+1)) == 0 && ((1<<uint((_la-24)))&((1<<(KQueryParserSHL-24))|(1<<(KQueryParserLSHR-24))|(1<<(KQueryParserASHR-24))|(1<<(KQueryParserBITWISEAND-24))|(1<<(KQueryParserBITWISEOR-24))|(1<<(KQueryParserBITWISEXOR-24)))) != 0) {
			p.GetErrorHandler().RecoverInline(p)
		} else {
			p.GetErrorHandler().ReportMatch(p)
			p.Consume()
		}
	}

	return localctx
}

// IComparisonExprContext is an interface to support dynamic dispatch.
type IComparisonExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsComparisonExprContext differentiates from other interfaces.
	IsComparisonExprContext()
}

type ComparisonExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyComparisonExprContext() *ComparisonExprContext {
	var p = new(ComparisonExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_comparisonExpr
	return p
}

func (*ComparisonExprContext) IsComparisonExprContext() {}

func NewComparisonExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ComparisonExprContext {
	var p = new(ComparisonExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_comparisonExpr

	return p
}

func (s *ComparisonExprContext) GetParser() antlr.Parser { return s.parser }

func (s *ComparisonExprContext) EQ() antlr.TerminalNode {
	return s.GetToken(KQueryParserEQ, 0)
}

func (s *ComparisonExprContext) NEQ() antlr.TerminalNode {
	return s.GetToken(KQueryParserNEQ, 0)
}

func (s *ComparisonExprContext) ULT() antlr.TerminalNode {
	return s.GetToken(KQueryParserULT, 0)
}

func (s *ComparisonExprContext) UGT() antlr.TerminalNode {
	return s.GetToken(KQueryParserUGT, 0)
}

func (s *ComparisonExprContext) ULE() antlr.TerminalNode {
	return s.GetToken(KQueryParserULE, 0)
}

func (s *ComparisonExprContext) UGE() antlr.TerminalNode {
	return s.GetToken(KQueryParserUGE, 0)
}

func (s *ComparisonExprContext) SLT() antlr.TerminalNode {
	return s.GetToken(KQueryParserSLT, 0)
}

func (s *ComparisonExprContext) SLE() antlr.TerminalNode {
	return s.GetToken(KQueryParserSLE, 0)
}

func (s *ComparisonExprContext) SGT() antlr.TerminalNode {
	return s.GetToken(KQueryParserSGT, 0)
}

func (s *ComparisonExprContext) SGE() antlr.TerminalNode {
	return s.GetToken(KQueryParserSGE, 0)
}

func (s *ComparisonExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ComparisonExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ComparisonExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterComparisonExpr(s)
	}
}

func (s *ComparisonExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitComparisonExpr(s)
	}
}

func (s *ComparisonExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitComparisonExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) ComparisonExpr() (localctx IComparisonExprContext) {
	localctx = NewComparisonExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 50, KQueryParserRULE_comparisonExpr)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(301)
		_la = p.GetTokenStream().LA(1)

		if !(((_la-43)&-(0x1f+1)) == 0 && ((1<<uint((_la-43)))&((1<<(KQueryParserEQ-43))|(1<<(KQueryParserNEQ-43))|(1<<(KQueryParserULT-43))|(1<<(KQueryParserULE-43))|(1<<(KQueryParserUGT-43))|(1<<(KQueryParserUGE-43))|(1<<(KQueryParserSLT-43))|(1<<(KQueryParserSLE-43))|(1<<(KQueryParserSGT-43))|(1<<(KQueryParserSGE-43)))) != 0) {
			p.GetErrorHandler().RecoverInline(p)
		} else {
			p.GetErrorHandler().ReportMatch(p)
			p.Consume()
		}
	}

	return localctx
}

// IArithmeticExprContext is an interface to support dynamic dispatch.
type IArithmeticExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsArithmeticExprContext differentiates from other interfaces.
	IsArithmeticExprContext()
}

type ArithmeticExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyArithmeticExprContext() *ArithmeticExprContext {
	var p = new(ArithmeticExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_arithmeticExpr
	return p
}

func (*ArithmeticExprContext) IsArithmeticExprContext() {}

func NewArithmeticExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ArithmeticExprContext {
	var p = new(ArithmeticExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_arithmeticExpr

	return p
}

func (s *ArithmeticExprContext) GetParser() antlr.Parser { return s.parser }

func (s *ArithmeticExprContext) ADD() antlr.TerminalNode {
	return s.GetToken(KQueryParserADD, 0)
}

func (s *ArithmeticExprContext) SUB() antlr.TerminalNode {
	return s.GetToken(KQueryParserSUB, 0)
}

func (s *ArithmeticExprContext) MUL() antlr.TerminalNode {
	return s.GetToken(KQueryParserMUL, 0)
}

func (s *ArithmeticExprContext) UDIV() antlr.TerminalNode {
	return s.GetToken(KQueryParserUDIV, 0)
}

func (s *ArithmeticExprContext) UREM() antlr.TerminalNode {
	return s.GetToken(KQueryParserUREM, 0)
}

func (s *ArithmeticExprContext) SDIV() antlr.TerminalNode {
	return s.GetToken(KQueryParserSDIV, 0)
}

func (s *ArithmeticExprContext) SREM() antlr.TerminalNode {
	return s.GetToken(KQueryParserSREM, 0)
}

func (s *ArithmeticExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ArithmeticExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ArithmeticExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterArithmeticExpr(s)
	}
}

func (s *ArithmeticExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitArithmeticExpr(s)
	}
}

func (s *ArithmeticExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitArithmeticExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) ArithmeticExpr() (localctx IArithmeticExprContext) {
	localctx = NewArithmeticExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 52, KQueryParserRULE_arithmeticExpr)
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(303)
		_la = p.GetTokenStream().LA(1)

		if !(((_la-53)&-(0x1f+1)) == 0 && ((1<<uint((_la-53)))&((1<<(KQueryParserADD-53))|(1<<(KQueryParserSUB-53))|(1<<(KQueryParserMUL-53))|(1<<(KQueryParserUDIV-53))|(1<<(KQueryParserUREM-53))|(1<<(KQueryParserSDIV-53))|(1<<(KQueryParserSREM-53)))) != 0) {
			p.GetErrorHandler().RecoverInline(p)
		} else {
			p.GetErrorHandler().ReportMatch(p)
			p.Consume()
		}
	}

	return localctx
}

// IDomainContext is an interface to support dynamic dispatch.
type IDomainContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsDomainContext differentiates from other interfaces.
	IsDomainContext()
}

type DomainContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyDomainContext() *DomainContext {
	var p = new(DomainContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_domain
	return p
}

func (*DomainContext) IsDomainContext() {}

func NewDomainContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DomainContext {
	var p = new(DomainContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_domain

	return p
}

func (s *DomainContext) GetParser() antlr.Parser { return s.parser }

func (s *DomainContext) WidthOrSizeExpr() IWidthOrSizeExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IWidthOrSizeExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IWidthOrSizeExprContext)
}

func (s *DomainContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DomainContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DomainContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterDomain(s)
	}
}

func (s *DomainContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitDomain(s)
	}
}

func (s *DomainContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitDomain(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) Domain() (localctx IDomainContext) {
	localctx = NewDomainContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 54, KQueryParserRULE_domain)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(305)
		p.WidthOrSizeExpr()
	}

	return localctx
}

// IRangeLimitContext is an interface to support dynamic dispatch.
type IRangeLimitContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsRangeLimitContext differentiates from other interfaces.
	IsRangeLimitContext()
}

type RangeLimitContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyRangeLimitContext() *RangeLimitContext {
	var p = new(RangeLimitContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_rangeLimit
	return p
}

func (*RangeLimitContext) IsRangeLimitContext() {}

func NewRangeLimitContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *RangeLimitContext {
	var p = new(RangeLimitContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_rangeLimit

	return p
}

func (s *RangeLimitContext) GetParser() antlr.Parser { return s.parser }

func (s *RangeLimitContext) WidthOrSizeExpr() IWidthOrSizeExprContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IWidthOrSizeExprContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IWidthOrSizeExprContext)
}

func (s *RangeLimitContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *RangeLimitContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *RangeLimitContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterRangeLimit(s)
	}
}

func (s *RangeLimitContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitRangeLimit(s)
	}
}

func (s *RangeLimitContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitRangeLimit(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) RangeLimit() (localctx IRangeLimitContext) {
	localctx = NewRangeLimitContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 56, KQueryParserRULE_rangeLimit)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(307)
		p.WidthOrSizeExpr()
	}

	return localctx
}

// IArrNameContext is an interface to support dynamic dispatch.
type IArrNameContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsArrNameContext differentiates from other interfaces.
	IsArrNameContext()
}

type ArrNameContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyArrNameContext() *ArrNameContext {
	var p = new(ArrNameContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_arrName
	return p
}

func (*ArrNameContext) IsArrNameContext() {}

func NewArrNameContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ArrNameContext {
	var p = new(ArrNameContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_arrName

	return p
}

func (s *ArrNameContext) GetParser() antlr.Parser { return s.parser }

func (s *ArrNameContext) Identifier() antlr.TerminalNode {
	return s.GetToken(KQueryParserIdentifier, 0)
}

func (s *ArrNameContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ArrNameContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ArrNameContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterArrName(s)
	}
}

func (s *ArrNameContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitArrName(s)
	}
}

func (s *ArrNameContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitArrName(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) ArrName() (localctx IArrNameContext) {
	localctx = NewArrNameContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 58, KQueryParserRULE_arrName)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(309)
		p.Match(KQueryParserIdentifier)
	}

	return localctx
}

// INumberListContext is an interface to support dynamic dispatch.
type INumberListContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsNumberListContext differentiates from other interfaces.
	IsNumberListContext()
}

type NumberListContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyNumberListContext() *NumberListContext {
	var p = new(NumberListContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_numberList
	return p
}

func (*NumberListContext) IsNumberListContext() {}

func NewNumberListContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *NumberListContext {
	var p = new(NumberListContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_numberList

	return p
}

func (s *NumberListContext) GetParser() antlr.Parser { return s.parser }

func (s *NumberListContext) Number() INumberContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*INumberContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(INumberContext)
}

func (s *NumberListContext) NumberList() INumberListContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*INumberListContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(INumberListContext)
}

func (s *NumberListContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NumberListContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *NumberListContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterNumberList(s)
	}
}

func (s *NumberListContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitNumberList(s)
	}
}

func (s *NumberListContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitNumberList(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) NumberList() (localctx INumberListContext) {
	localctx = NewNumberListContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 60, KQueryParserRULE_numberList)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(315)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 9, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(311)
			p.Number()
		}

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(312)
			p.Number()
		}
		{
			p.SetState(313)
			p.NumberList()
		}

	}

	return localctx
}

// INumberContext is an interface to support dynamic dispatch.
type INumberContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsNumberContext differentiates from other interfaces.
	IsNumberContext()
}

type NumberContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyNumberContext() *NumberContext {
	var p = new(NumberContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_number
	return p
}

func (*NumberContext) IsNumberContext() {}

func NewNumberContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *NumberContext {
	var p = new(NumberContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_number

	return p
}

func (s *NumberContext) GetParser() antlr.Parser { return s.parser }

func (s *NumberContext) Boolnum() IBoolnumContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBoolnumContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBoolnumContext)
}

func (s *NumberContext) SignedConstant() ISignedConstantContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ISignedConstantContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ISignedConstantContext)
}

func (s *NumberContext) Constant() IConstantContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IConstantContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IConstantContext)
}

func (s *NumberContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NumberContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *NumberContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterNumber(s)
	}
}

func (s *NumberContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitNumber(s)
	}
}

func (s *NumberContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitNumber(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) Number() (localctx INumberContext) {
	localctx = NewNumberContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 62, KQueryParserRULE_number)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(320)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case KQueryParserBoolean:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(317)
			p.Boolnum()
		}

	case KQueryParserSignedConstant:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(318)
			p.SignedConstant()
		}

	case KQueryParserConstant:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(319)
			p.Constant()
		}

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IConstantContext is an interface to support dynamic dispatch.
type IConstantContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsConstantContext differentiates from other interfaces.
	IsConstantContext()
}

type ConstantContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyConstantContext() *ConstantContext {
	var p = new(ConstantContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_constant
	return p
}

func (*ConstantContext) IsConstantContext() {}

func NewConstantContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ConstantContext {
	var p = new(ConstantContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_constant

	return p
}

func (s *ConstantContext) GetParser() antlr.Parser { return s.parser }

func (s *ConstantContext) Constant() antlr.TerminalNode {
	return s.GetToken(KQueryParserConstant, 0)
}

func (s *ConstantContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ConstantContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ConstantContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterConstant(s)
	}
}

func (s *ConstantContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitConstant(s)
	}
}

func (s *ConstantContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitConstant(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) Constant() (localctx IConstantContext) {
	localctx = NewConstantContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 64, KQueryParserRULE_constant)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(322)
		p.Match(KQueryParserConstant)
	}

	return localctx
}

// IBoolnumContext is an interface to support dynamic dispatch.
type IBoolnumContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsBoolnumContext differentiates from other interfaces.
	IsBoolnumContext()
}

type BoolnumContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyBoolnumContext() *BoolnumContext {
	var p = new(BoolnumContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_boolnum
	return p
}

func (*BoolnumContext) IsBoolnumContext() {}

func NewBoolnumContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BoolnumContext {
	var p = new(BoolnumContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_boolnum

	return p
}

func (s *BoolnumContext) GetParser() antlr.Parser { return s.parser }

func (s *BoolnumContext) Boolean() antlr.TerminalNode {
	return s.GetToken(KQueryParserBoolean, 0)
}

func (s *BoolnumContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BoolnumContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BoolnumContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterBoolnum(s)
	}
}

func (s *BoolnumContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitBoolnum(s)
	}
}

func (s *BoolnumContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitBoolnum(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) Boolnum() (localctx IBoolnumContext) {
	localctx = NewBoolnumContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 66, KQueryParserRULE_boolnum)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(324)
		p.Match(KQueryParserBoolean)
	}

	return localctx
}

// ISignedConstantContext is an interface to support dynamic dispatch.
type ISignedConstantContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsSignedConstantContext differentiates from other interfaces.
	IsSignedConstantContext()
}

type SignedConstantContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptySignedConstantContext() *SignedConstantContext {
	var p = new(SignedConstantContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_signedConstant
	return p
}

func (*SignedConstantContext) IsSignedConstantContext() {}

func NewSignedConstantContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *SignedConstantContext {
	var p = new(SignedConstantContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_signedConstant

	return p
}

func (s *SignedConstantContext) GetParser() antlr.Parser { return s.parser }

func (s *SignedConstantContext) SignedConstant() antlr.TerminalNode {
	return s.GetToken(KQueryParserSignedConstant, 0)
}

func (s *SignedConstantContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *SignedConstantContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *SignedConstantContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterSignedConstant(s)
	}
}

func (s *SignedConstantContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitSignedConstant(s)
	}
}

func (s *SignedConstantContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitSignedConstant(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) SignedConstant() (localctx ISignedConstantContext) {
	localctx = NewSignedConstantContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 68, KQueryParserRULE_signedConstant)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(326)
		p.Match(KQueryParserSignedConstant)
	}

	return localctx
}

// IWidthOrSizeExprContext is an interface to support dynamic dispatch.
type IWidthOrSizeExprContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsWidthOrSizeExprContext differentiates from other interfaces.
	IsWidthOrSizeExprContext()
}

type WidthOrSizeExprContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyWidthOrSizeExprContext() *WidthOrSizeExprContext {
	var p = new(WidthOrSizeExprContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = KQueryParserRULE_widthOrSizeExpr
	return p
}

func (*WidthOrSizeExprContext) IsWidthOrSizeExprContext() {}

func NewWidthOrSizeExprContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *WidthOrSizeExprContext {
	var p = new(WidthOrSizeExprContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = KQueryParserRULE_widthOrSizeExpr

	return p
}

func (s *WidthOrSizeExprContext) GetParser() antlr.Parser { return s.parser }

func (s *WidthOrSizeExprContext) WidthType() antlr.TerminalNode {
	return s.GetToken(KQueryParserWidthType, 0)
}

func (s *WidthOrSizeExprContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *WidthOrSizeExprContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *WidthOrSizeExprContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.EnterWidthOrSizeExpr(s)
	}
}

func (s *WidthOrSizeExprContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(KQueryListener); ok {
		listenerT.ExitWidthOrSizeExpr(s)
	}
}

func (s *WidthOrSizeExprContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case KQueryVisitor:
		return t.VisitWidthOrSizeExpr(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *KQueryParser) WidthOrSizeExpr() (localctx IWidthOrSizeExprContext) {
	localctx = NewWidthOrSizeExprContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 70, KQueryParserRULE_widthOrSizeExpr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(328)
		p.Match(KQueryParserWidthType)
	}

	return localctx
}
