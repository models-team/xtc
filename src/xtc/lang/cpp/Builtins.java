/*
 * xtc - The eXTensible Compiler
 * Copyright (C) 2009-2012 New York University
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301,
 * USA.
 */
package xtc.lang.cpp;

/** This class's purpose is to provide the built-in macros and system includes.
  */
public class Builtins {
  /** The system include directories */
  public static String[] sysdirs = { "/usr/lib/gcc/x86_64-linux-gnu/6/include", "/usr/local/include", "/usr/lib/gcc/x86_64-linux-gnu/6/include-fixed", "/usr/include/x86_64-linux-gnu", "/usr/include" };

  /** A string containing the built-in macro definitions */
  public static final String builtin =
    "#define __SSP_STRONG__ 3\n" +
    "#define __DBL_MIN_EXP__ (-1021)\n" +
    "#define __UINT_LEAST16_MAX__ 0xffff\n" +
    "#define __ATOMIC_ACQUIRE 2\n" +
    "#define __FLT_MIN__ 1.17549435082228750797e-38F\n" +
    "#define __GCC_IEC_559_COMPLEX 2\n" +
    "#define __UINT_LEAST8_TYPE__ unsigned char\n" +
    "#define __SIZEOF_FLOAT80__ 16\n" +
    "#define __INTMAX_C(c) c ## L\n" +
    "#define __CHAR_BIT__ 8\n" +
    "#define __UINT8_MAX__ 0xff\n" +
    "#define __WINT_MAX__ 0xffffffffU\n" +
    "#define __ORDER_LITTLE_ENDIAN__ 1234\n" +
    "#define __SIZE_MAX__ 0xffffffffffffffffUL\n" +
    "#define __WCHAR_MAX__ 0x7fffffff\n" +
    "#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_1 1\n" +
    "#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_2 1\n" +
    "#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_4 1\n" +
    "#define __DBL_DENORM_MIN__ ((double)4.94065645841246544177e-324L)\n" +
    "#define __GCC_HAVE_SYNC_COMPARE_AND_SWAP_8 1\n" +
    "#define __GCC_ATOMIC_CHAR_LOCK_FREE 2\n" +
    "#define __GCC_IEC_559 2\n" +
    "#define __FLT_EVAL_METHOD__ 0\n" +
    "#define __unix__ 1\n" +
    "#define __GCC_ATOMIC_CHAR32_T_LOCK_FREE 2\n" +
    "#define __x86_64 1\n" +
    "#define __UINT_FAST64_MAX__ 0xffffffffffffffffUL\n" +
    "#define __SIG_ATOMIC_TYPE__ int\n" +
    "#define __DBL_MIN_10_EXP__ (-307)\n" +
    "#define __FINITE_MATH_ONLY__ 0\n" +
    "#define __GNUC_PATCHLEVEL__ 0\n" +
    "#define __UINT_FAST8_MAX__ 0xff\n" +
    "#define __has_include(STR) __has_include__(STR)\n" +
    "#define __DEC64_MAX_EXP__ 385\n" +
    "#define __INT8_C(c) c\n" +
    "#define __UINT_LEAST64_MAX__ 0xffffffffffffffffUL\n" +
    "#define __SHRT_MAX__ 0x7fff\n" +
    "#define __LDBL_MAX__ 1.18973149535723176502e+4932L\n" +
    "#define __UINT_LEAST8_MAX__ 0xff\n" +
    "#define __GCC_ATOMIC_BOOL_LOCK_FREE 2\n" +
    "#define __UINTMAX_TYPE__ long unsigned int\n" +
    "#define __linux 1\n" +
    "#define __DEC32_EPSILON__ 1E-6DF\n" +
    "#define __unix 1\n" +
    "#define __UINT32_MAX__ 0xffffffffU\n" +
    "#define __LDBL_MAX_EXP__ 16384\n" +
    "#define __WINT_MIN__ 0U\n" +
    "#define __linux__ 1\n" +
    "#define __SCHAR_MAX__ 0x7f\n" +
    "#define __WCHAR_MIN__ (-__WCHAR_MAX__ - 1)\n" +
    "#define __INT64_C(c) c ## L\n" +
    "#define __DBL_DIG__ 15\n" +
    "#define __GCC_ATOMIC_POINTER_LOCK_FREE 2\n" +
    "#define __SIZEOF_INT__ 4\n" +
    "#define __SIZEOF_POINTER__ 8\n" +
    "#define __USER_LABEL_PREFIX__ \n" +
    "#define __STDC_HOSTED__ 1\n" +
    "#define __LDBL_HAS_INFINITY__ 1\n" +
    "#define __FLT_EPSILON__ 1.19209289550781250000e-7F\n" +
    "#define __LDBL_MIN__ 3.36210314311209350626e-4932L\n" +
    "#define __STDC_UTF_16__ 1\n" +
    "#define __DEC32_MAX__ 9.999999E96DF\n" +
    "#define __INT32_MAX__ 0x7fffffff\n" +
    "#define __SIZEOF_LONG__ 8\n" +
    "#define __STDC_IEC_559__ 1\n" +
    "#define __STDC_ISO_10646__ 201505L\n" +
    "#define __UINT16_C(c) c\n" +
    "#define __DECIMAL_DIG__ 21\n" +
    "#define __gnu_linux__ 1\n" +
    "#define __has_include_next(STR) __has_include_next__(STR)\n" +
    "#define __LDBL_HAS_QUIET_NAN__ 1\n" +
    "#define __GNUC__ 6\n" +
    "#define __pie__ 2\n" +
    "#define __MMX__ 1\n" +
    "#define __FLT_HAS_DENORM__ 1\n" +
    "#define __SIZEOF_LONG_DOUBLE__ 16\n" +
    "#define __BIGGEST_ALIGNMENT__ 16\n" +
    "#define __DBL_MAX__ ((double)1.79769313486231570815e+308L)\n" +
    "#define __INT_FAST32_MAX__ 0x7fffffffffffffffL\n" +
    "#define __DBL_HAS_INFINITY__ 1\n" +
    "#define __DEC32_MIN_EXP__ (-94)\n" +
    "#define __INT_FAST16_TYPE__ long int\n" +
    "#define __LDBL_HAS_DENORM__ 1\n" +
    "#define __DEC128_MAX__ 9.999999999999999999999999999999999E6144DL\n" +
    "#define __INT_LEAST32_MAX__ 0x7fffffff\n" +
    "#define __DEC32_MIN__ 1E-95DF\n" +
    "#define __DBL_MAX_EXP__ 1024\n" +
    "#define __DEC128_EPSILON__ 1E-33DL\n" +
    "#define __SSE2_MATH__ 1\n" +
    "#define __ATOMIC_HLE_RELEASE 131072\n" +
    "#define __PTRDIFF_MAX__ 0x7fffffffffffffffL\n" +
    "#define __amd64 1\n" +
    "#define __STDC_NO_THREADS__ 1\n" +
    "#define __ATOMIC_HLE_ACQUIRE 65536\n" +
    "#define __LONG_LONG_MAX__ 0x7fffffffffffffffLL\n" +
    "#define __SIZEOF_SIZE_T__ 8\n" +
    "#define __SIZEOF_WINT_T__ 4\n" +
    "#define __GCC_HAVE_DWARF2_CFI_ASM 1\n" +
    "#define __GXX_ABI_VERSION 1010\n" +
    "#define __FLT_MIN_EXP__ (-125)\n" +
    "#define __INT_FAST64_TYPE__ long int\n" +
    "#define __DBL_MIN__ ((double)2.22507385850720138309e-308L)\n" +
    "#define __PIE__ 2\n" +
    "#define __LP64__ 1\n" +
    "#define __DECIMAL_BID_FORMAT__ 1\n" +
    "#define __DEC128_MIN__ 1E-6143DL\n" +
    "#define __REGISTER_PREFIX__ \n" +
    "#define __UINT16_MAX__ 0xffff\n" +
    "#define __DBL_HAS_DENORM__ 1\n" +
    "#define __UINT8_TYPE__ unsigned char\n" +
    "#define __NO_INLINE__ 1\n" +
    "#define __FLT_MANT_DIG__ 24\n" +
    "#define __VERSION__ \"6.2.0 20161005\"\n" +
    "#define __UINT64_C(c) c ## UL\n" +
    "#define _STDC_PREDEF_H 1\n" +
    "#define __GCC_ATOMIC_INT_LOCK_FREE 2\n" +
    "#define __FLOAT_WORD_ORDER__ __ORDER_LITTLE_ENDIAN__\n" +
    "#define __STDC_IEC_559_COMPLEX__ 1\n" +
    "#define __INT32_C(c) c\n" +
    "#define __DEC64_EPSILON__ 1E-15DD\n" +
    "#define __ORDER_PDP_ENDIAN__ 3412\n" +
    "#define __DEC128_MIN_EXP__ (-6142)\n" +
    "#define __INT_FAST32_TYPE__ long int\n" +
    "#define __UINT_LEAST16_TYPE__ short unsigned int\n" +
    "#define unix 1\n" +
    "#define __INT16_MAX__ 0x7fff\n" +
    "#define __SIZE_TYPE__ long unsigned int\n" +
    "#define __UINT64_MAX__ 0xffffffffffffffffUL\n" +
    "#define __INT8_TYPE__ signed char\n" +
    "#define __ELF__ 1\n" +
    "#define __GCC_ASM_FLAG_OUTPUTS__ 1\n" +
    "#define __FLT_RADIX__ 2\n" +
    "#define __INT_LEAST16_TYPE__ short int\n" +
    "#define __LDBL_EPSILON__ 1.08420217248550443401e-19L\n" +
    "#define __UINTMAX_C(c) c ## UL\n" +
    "#define __SSE_MATH__ 1\n" +
    "#define __k8 1\n" +
    "#define __SIG_ATOMIC_MAX__ 0x7fffffff\n" +
    "#define __GCC_ATOMIC_WCHAR_T_LOCK_FREE 2\n" +
    "#define __SIZEOF_PTRDIFF_T__ 8\n" +
    "#define __x86_64__ 1\n" +
    "#define __DEC32_SUBNORMAL_MIN__ 0.000001E-95DF\n" +
    "#define __INT_FAST16_MAX__ 0x7fffffffffffffffL\n" +
    "#define __UINT_FAST32_MAX__ 0xffffffffffffffffUL\n" +
    "#define __UINT_LEAST64_TYPE__ long unsigned int\n" +
    "#define __FLT_HAS_QUIET_NAN__ 1\n" +
    "#define __FLT_MAX_10_EXP__ 38\n" +
    "#define __LONG_MAX__ 0x7fffffffffffffffL\n" +
    "#define __DEC128_SUBNORMAL_MIN__ 0.000000000000000000000000000000001E-6143DL\n" +
    "#define __FLT_HAS_INFINITY__ 1\n" +
    "#define __UINT_FAST16_TYPE__ long unsigned int\n" +
    "#define __DEC64_MAX__ 9.999999999999999E384DD\n" +
    "#define __CHAR16_TYPE__ short unsigned int\n" +
    "#define __PRAGMA_REDEFINE_EXTNAME 1\n" +
    "#define __SEG_FS 1\n" +
    "#define __INT_LEAST16_MAX__ 0x7fff\n" +
    "#define __DEC64_MANT_DIG__ 16\n" +
    "#define __INT64_MAX__ 0x7fffffffffffffffL\n" +
    "#define __UINT_LEAST32_MAX__ 0xffffffffU\n" +
    "#define __SEG_GS 1\n" +
    "#define __GCC_ATOMIC_LONG_LOCK_FREE 2\n" +
    "#define __INT_LEAST64_TYPE__ long int\n" +
    "#define __INT16_TYPE__ short int\n" +
    "#define __INT_LEAST8_TYPE__ signed char\n" +
    "#define __STDC_VERSION__ 201112L\n" +
    "#define __DEC32_MAX_EXP__ 97\n" +
    "#define __INT_FAST8_MAX__ 0x7f\n" +
    "#define __INTPTR_MAX__ 0x7fffffffffffffffL\n" +
    "#define linux 1\n" +
    "#define __SSE2__ 1\n" +
    "#define __LDBL_MANT_DIG__ 64\n" +
    "#define __DBL_HAS_QUIET_NAN__ 1\n" +
    "#define __SIG_ATOMIC_MIN__ (-__SIG_ATOMIC_MAX__ - 1)\n" +
    "#define __code_model_small__ 1\n" +
    "#define __k8__ 1\n" +
    "#define __INTPTR_TYPE__ long int\n" +
    "#define __UINT16_TYPE__ short unsigned int\n" +
    "#define __WCHAR_TYPE__ int\n" +
    "#define __SIZEOF_FLOAT__ 4\n" +
    "#define __pic__ 2\n" +
    "#define __UINTPTR_MAX__ 0xffffffffffffffffUL\n" +
    "#define __DEC64_MIN_EXP__ (-382)\n" +
    "#define __INT_FAST64_MAX__ 0x7fffffffffffffffL\n" +
    "#define __GCC_ATOMIC_TEST_AND_SET_TRUEVAL 1\n" +
    "#define __FLT_DIG__ 6\n" +
    "#define __UINT_FAST64_TYPE__ long unsigned int\n" +
    "#define __INT_MAX__ 0x7fffffff\n" +
    "#define __amd64__ 1\n" +
    "#define __INT64_TYPE__ long int\n" +
    "#define __FLT_MAX_EXP__ 128\n" +
    "#define __ORDER_BIG_ENDIAN__ 4321\n" +
    "#define __DBL_MANT_DIG__ 53\n" +
    "#define __SIZEOF_FLOAT128__ 16\n" +
    "#define __INT_LEAST64_MAX__ 0x7fffffffffffffffL\n" +
    "#define __GCC_ATOMIC_CHAR16_T_LOCK_FREE 2\n" +
    "#define __DEC64_MIN__ 1E-383DD\n" +
    "#define __WINT_TYPE__ unsigned int\n" +
    "#define __UINT_LEAST32_TYPE__ unsigned int\n" +
    "#define __SIZEOF_SHORT__ 2\n" +
    "#define __SSE__ 1\n" +
    "#define __LDBL_MIN_EXP__ (-16381)\n" +
    "#define __INT_LEAST8_MAX__ 0x7f\n" +
    "#define __SIZEOF_INT128__ 16\n" +
    "#define __LDBL_MAX_10_EXP__ 4932\n" +
    "#define __ATOMIC_RELAXED 0\n" +
    "#define __DBL_EPSILON__ ((double)2.22044604925031308085e-16L)\n" +
    "#define _LP64 1\n" +
    "#define __UINT8_C(c) c\n" +
    "#define __INT_LEAST32_TYPE__ int\n" +
    "#define __SIZEOF_WCHAR_T__ 4\n" +
    "#define __UINT64_TYPE__ long unsigned int\n" +
    "#define __INT_FAST8_TYPE__ signed char\n" +
    "#define __GNUC_STDC_INLINE__ 1\n" +
    "#define __DBL_DECIMAL_DIG__ 17\n" +
    "#define __STDC_UTF_32__ 1\n" +
    "#define __FXSR__ 1\n" +
    "#define __DEC_EVAL_METHOD__ 2\n" +
    "#define __UINT32_C(c) c ## U\n" +
    "#define __INTMAX_MAX__ 0x7fffffffffffffffL\n" +
    "#define __BYTE_ORDER__ __ORDER_LITTLE_ENDIAN__\n" +
    "#define __FLT_DENORM_MIN__ 1.40129846432481707092e-45F\n" +
    "#define __INT8_MAX__ 0x7f\n" +
    "#define __PIC__ 2\n" +
    "#define __UINT_FAST32_TYPE__ long unsigned int\n" +
    "#define __CHAR32_TYPE__ unsigned int\n" +
    "#define __FLT_MAX__ 3.40282346638528859812e+38F\n" +
    "#define __INT32_TYPE__ int\n" +
    "#define __SIZEOF_DOUBLE__ 8\n" +
    "#define __FLT_MIN_10_EXP__ (-37)\n" +
    "#define __INTMAX_TYPE__ long int\n" +
    "#define __DEC128_MAX_EXP__ 6145\n" +
    "#define __ATOMIC_CONSUME 1\n" +
    "#define __GNUC_MINOR__ 2\n" +
    "#define __UINTMAX_MAX__ 0xffffffffffffffffUL\n" +
    "#define __DEC32_MANT_DIG__ 7\n" +
    "#define __DBL_MAX_10_EXP__ 308\n" +
    "#define __LDBL_DENORM_MIN__ 3.64519953188247460253e-4951L\n" +
    "#define __INT16_C(c) c\n" +
    "#define __STDC__ 1\n" +
    "#define __PTRDIFF_TYPE__ long int\n" +
    "#define __ATOMIC_SEQ_CST 5\n" +
    "#define __UINT32_TYPE__ unsigned int\n" +
    "#define __UINTPTR_TYPE__ long unsigned int\n" +
    "#define __DEC64_SUBNORMAL_MIN__ 0.000000000000001E-383DD\n" +
    "#define __DEC128_MANT_DIG__ 34\n" +
    "#define __LDBL_MIN_10_EXP__ (-4931)\n" +
    "#define __SIZEOF_LONG_LONG__ 8\n" +
    "#define __GCC_ATOMIC_LLONG_LOCK_FREE 2\n" +
    "#define __LDBL_DIG__ 18\n" +
    "#define __FLT_DECIMAL_DIG__ 9\n" +
    "#define __UINT_FAST16_MAX__ 0xffffffffffffffffUL\n" +
    "#define __GCC_ATOMIC_SHORT_LOCK_FREE 2\n" +
    "#define __UINT_FAST8_TYPE__ unsigned char\n" +
    "#define __ATOMIC_ACQ_REL 4\n" +
    "#define __ATOMIC_RELEASE 3\n" +
    "";
    public static void main(String[] args) {
      System.out.println(builtin);
    }
}
