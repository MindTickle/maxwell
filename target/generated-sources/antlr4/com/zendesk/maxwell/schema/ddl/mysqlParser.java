// Generated from com/zendesk/maxwell/schema/ddl/mysql.g4 by ANTLR 4.5
package com.zendesk.maxwell.schema.ddl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mysqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ACTION=9, 
		ADD=10, AFTER=11, ALGORITHM=12, ALTER=13, ALWAYS=14, ANALYZE=15, AS=16, 
		ASC=17, ASCII=18, AUTO_INCREMENT=19, AVG_ROW_LENGTH=20, BEGIN=21, BIGINT=22, 
		BINARY=23, BIT=24, BLOB=25, BOOL=26, BOOLEAN=27, BTREE=28, BY=29, BYTE=30, 
		CASCADE=31, CHANGE=32, CHAR=33, CHARACTER=34, CHARSET=35, CHECK=36, CHECKSUM=37, 
		COALESCE=38, COLLATE=39, COLUMN=40, COLUMNS=41, COLUMN_FORMAT=42, COMMENT=43, 
		COMPACT=44, COMPRESSED=45, CONNECTION=46, CONSTRAINT=47, CONVERT=48, COPY=49, 
		CREATE=50, CURRENT_TIMESTAMP=51, CURRENT_USER=52, DATA=53, DATABASE=54, 
		DATE=55, DATETIME=56, DECIMAL=57, DEFAULT=58, DEFINER=59, DELAY_KEY_WRITE=60, 
		DELETE=61, DESC=62, DIRECTORY=63, DISABLE=64, DISCARD=65, DISK=66, DOUBLE=67, 
		DROP=68, DYNAMIC=69, ENABLE=70, ENGINE=71, ENUM=72, EXCHANGE=73, EXCLUSIVE=74, 
		EXISTS=75, FALSE=76, FIRST=77, FIXED=78, FLOAT=79, FLOAT4=80, FLOAT8=81, 
		FORCE=82, FOREIGN=83, FULL=84, FULLTEXT=85, GENERATED=86, GEOMETRY=87, 
		GEOMETRYCOLLECTION=88, HASH=89, IF=90, IGNORE=91, IMPORT=92, INDEX=93, 
		INPLACE=94, INSERT_METHOD=95, INSTANT=96, INT=97, INT1=98, INT2=99, INT3=100, 
		INT4=101, INT8=102, INTEGER=103, INTO=104, INVISIBLE=105, INVOKER=106, 
		JSON=107, KEY=108, KEYS=109, KEY_BLOCK_SIZE=110, LAST=111, LIKE=112, LINEAR=113, 
		LINESTRING=114, LIST=115, LOCALTIME=116, LOCALTIMESTAMP=117, LOCK=118, 
		LONG=119, LONGBLOB=120, LONGTEXT=121, MATCH=122, MAX_ROWS=123, MEDIUMBLOB=124, 
		MEDIUMINT=125, MEDIUMTEXT=126, MEMORY=127, MERGE=128, MIDDLEINT=129, MIN_ROWS=130, 
		MODIFY=131, MULTILINESTRING=132, MULTIPOINT=133, MULTIPOLYGON=134, NAME=135, 
		NATIONAL=136, NCHAR=137, NO=138, NONE=139, NOT=140, NOW=141, NULL=142, 
		NUMERIC=143, NVARCHAR=144, OFFLINE=145, ON=146, ONLINE=147, OPTIMIZE=148, 
		OR=149, ORDER=150, PACK_KEYS=151, PARSER=152, PARTIAL=153, PARTITION=154, 
		PARTITIONING=155, PARTITIONS=156, PASSWORD=157, POINT=158, POLYGON=159, 
		PRECISION=160, PRIMARY=161, RANGE=162, REAL=163, REBUILD=164, REDUNDANT=165, 
		REFERENCES=166, REMOVE=167, RENAME=168, REORGANIZE=169, REPAIR=170, REPLACE=171, 
		RESTRICT=172, ROW_FORMAT=173, SCHEMA=174, SECURITY=175, SERIAL=176, SET=177, 
		SHARED=178, SIGNED=179, SIMPLE=180, SMALLINT=181, SPATIAL=182, SQL=183, 
		STATS_AUTO_RECALC=184, STATS_PERSISTENT=185, STATS_SAMPLE_PAGES=186, STORAGE=187, 
		STORED=188, SUBPARTITION=189, SUBPARTITIONS=190, TABLE=191, TABLESPACE=192, 
		TEMPORARY=193, TEMPTABLE=194, TEXT=195, TIME=196, TIMESTAMP=197, TINYBLOB=198, 
		TINYINT=199, TINYTEXT=200, TO=201, TRUE=202, TRUNCATE=203, UNDEFINED=204, 
		UNICODE=205, UNION=206, UNIQUE=207, UNSIGNED=208, UPDATE=209, UPGRADE=210, 
		USING=211, VALIDATION=212, VARBINARY=213, VARCHAR=214, VARYING=215, VIEW=216, 
		VIRTUAL=217, VISIBLE=218, WITH=219, WITHOUT=220, YEAR=221, ZEROFILL=222, 
		SQL_UPGRADE_COMMENT=223, SQL_UPGRADE_ENDCOMMENT=224, MAXWELL_ELIDED_PARSE_ISSUE=225, 
		SQL_COMMENT=226, SQL_EMPTY_COMMENT=227, SQL_LINE_COMMENT=228, STRING_LITERAL=229, 
		DBL_STRING_LITERAL=230, INTEGER_LITERAL=231, IDENT=232, QUOTED_IDENT=233, 
		UNUSED_TOKENS=234, WS=235;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_tokens_available_for_names = 2, 
		RULE_all_tokens = 3, RULE_skip_parens = 4, RULE_db_name = 5, RULE_table_name = 6, 
		RULE_user = 7, RULE_user_token = 8, RULE_name = 9, RULE_name_all_tokens = 10, 
		RULE_id = 11, RULE_literal = 12, RULE_literal_with_weirdo_multistring = 13, 
		RULE_float_literal = 14, RULE_integer_literal = 15, RULE_string_literal = 16, 
		RULE_byte_literal = 17, RULE_string = 18, RULE_integer = 19, RULE_charset_name = 20, 
		RULE_default_character_set = 21, RULE_default_collation = 22, RULE_charset_token = 23, 
		RULE_collation = 24, RULE_if_not_exists = 25, RULE_alter_table = 26, RULE_alter_table_preamble = 27, 
		RULE_alter_flags = 28, RULE_alter_specifications = 29, RULE_alter_specification = 30, 
		RULE_add_column = 31, RULE_add_column_parens = 32, RULE_change_column = 33, 
		RULE_drop_column = 34, RULE_modify_column = 35, RULE_drop_key = 36, RULE_drop_primary_key = 37, 
		RULE_alter_rename_table = 38, RULE_convert_to_character_set = 39, RULE_rename_column = 40, 
		RULE_alter_partition_specification = 41, RULE_ignored_alter_specifications = 42, 
		RULE_algorithm_type = 43, RULE_lock_type = 44, RULE_partition_names = 45, 
		RULE_alter_ordering = 46, RULE_alter_ordering_column = 47, RULE_full_column_name = 48, 
		RULE_column_definition = 49, RULE_col_position = 50, RULE_data_type = 51, 
		RULE_generic_type = 52, RULE_signed_type = 53, RULE_string_type = 54, 
		RULE_long_flag = 55, RULE_enumerated_type = 56, RULE_column_options = 57, 
		RULE_primary_key = 58, RULE_enumerated_values = 59, RULE_enum_value = 60, 
		RULE_charset_def = 61, RULE_character_set = 62, RULE_nullability = 63, 
		RULE_default_value = 64, RULE_length = 65, RULE_int_flags = 66, RULE_decimal_length = 67, 
		RULE_now_function = 68, RULE_current_timestamp_length = 69, RULE_localtime_function = 70, 
		RULE_partition_by = 71, RULE_partition_by_what = 72, RULE_subpartition_by = 73, 
		RULE_partition_count = 74, RULE_partition_definitions = 75, RULE_skip_parens_inside_partition_definitions = 76, 
		RULE_alter_database = 77, RULE_alter_database_definition = 78, RULE_create_database = 79, 
		RULE_create_table = 80, RULE_create_table_preamble = 81, RULE_create_specifications = 82, 
		RULE_create_specification = 83, RULE_create_like_tbl = 84, RULE_table_creation_option = 85, 
		RULE_creation_engine = 86, RULE_creation_auto_increment = 87, RULE_creation_avg_row_length = 88, 
		RULE_creation_character_set = 89, RULE_creation_checksum = 90, RULE_creation_collation = 91, 
		RULE_creation_comment = 92, RULE_creation_connection = 93, RULE_creation_data_directory = 94, 
		RULE_creation_delay_key_write = 95, RULE_creation_index_directory = 96, 
		RULE_creation_insert_method = 97, RULE_creation_key_block_size = 98, RULE_creation_max_rows = 99, 
		RULE_creation_min_rows = 100, RULE_creation_pack_keys = 101, RULE_creation_password = 102, 
		RULE_creation_row_format = 103, RULE_creation_stats_auto_recalc = 104, 
		RULE_creation_stats_persistent = 105, RULE_creation_stats_sample_pages = 106, 
		RULE_creation_storage_option = 107, RULE_creation_tablespace = 108, RULE_creation_union = 109, 
		RULE_index_definition = 110, RULE_index_type_1 = 111, RULE_index_type_pk = 112, 
		RULE_index_type_3 = 113, RULE_index_type_4 = 114, RULE_index_type_5 = 115, 
		RULE_index_type_check = 116, RULE_index_or_key = 117, RULE_index_constraint = 118, 
		RULE_constraint_name = 119, RULE_index_name = 120, RULE_index_type = 121, 
		RULE_index_options = 122, RULE_index_column_list = 123, RULE_index_columns = 124, 
		RULE_index_column = 125, RULE_index_column_partial_def = 126, RULE_index_column_partial_length = 127, 
		RULE_index_column_asc_or_desc = 128, RULE_reference_definition = 129, 
		RULE_reference_definition_match = 130, RULE_reference_definition_on_delete = 131, 
		RULE_reference_definition_on_update = 132, RULE_reference_option = 133, 
		RULE_drop_database = 134, RULE_drop_table = 135, RULE_drop_table_options = 136, 
		RULE_if_exists = 137, RULE_rename_table = 138, RULE_rename_table_spec = 139, 
		RULE_alter_view = 140, RULE_create_view = 141, RULE_drop_view = 142, RULE_view_options = 143;
	public static final String[] ruleNames = {
		"parse", "statement", "tokens_available_for_names", "all_tokens", "skip_parens", 
		"db_name", "table_name", "user", "user_token", "name", "name_all_tokens", 
		"id", "literal", "literal_with_weirdo_multistring", "float_literal", "integer_literal", 
		"string_literal", "byte_literal", "string", "integer", "charset_name", 
		"default_character_set", "default_collation", "charset_token", "collation", 
		"if_not_exists", "alter_table", "alter_table_preamble", "alter_flags", 
		"alter_specifications", "alter_specification", "add_column", "add_column_parens", 
		"change_column", "drop_column", "modify_column", "drop_key", "drop_primary_key", 
		"alter_rename_table", "convert_to_character_set", "rename_column", "alter_partition_specification", 
		"ignored_alter_specifications", "algorithm_type", "lock_type", "partition_names", 
		"alter_ordering", "alter_ordering_column", "full_column_name", "column_definition", 
		"col_position", "data_type", "generic_type", "signed_type", "string_type", 
		"long_flag", "enumerated_type", "column_options", "primary_key", "enumerated_values", 
		"enum_value", "charset_def", "character_set", "nullability", "default_value", 
		"length", "int_flags", "decimal_length", "now_function", "current_timestamp_length", 
		"localtime_function", "partition_by", "partition_by_what", "subpartition_by", 
		"partition_count", "partition_definitions", "skip_parens_inside_partition_definitions", 
		"alter_database", "alter_database_definition", "create_database", "create_table", 
		"create_table_preamble", "create_specifications", "create_specification", 
		"create_like_tbl", "table_creation_option", "creation_engine", "creation_auto_increment", 
		"creation_avg_row_length", "creation_character_set", "creation_checksum", 
		"creation_collation", "creation_comment", "creation_connection", "creation_data_directory", 
		"creation_delay_key_write", "creation_index_directory", "creation_insert_method", 
		"creation_key_block_size", "creation_max_rows", "creation_min_rows", "creation_pack_keys", 
		"creation_password", "creation_row_format", "creation_stats_auto_recalc", 
		"creation_stats_persistent", "creation_stats_sample_pages", "creation_storage_option", 
		"creation_tablespace", "creation_union", "index_definition", "index_type_1", 
		"index_type_pk", "index_type_3", "index_type_4", "index_type_5", "index_type_check", 
		"index_or_key", "index_constraint", "constraint_name", "index_name", "index_type", 
		"index_options", "index_column_list", "index_columns", "index_column", 
		"index_column_partial_def", "index_column_partial_length", "index_column_asc_or_desc", 
		"reference_definition", "reference_definition_match", "reference_definition_on_delete", 
		"reference_definition_on_update", "reference_option", "drop_database", 
		"drop_table", "drop_table_options", "if_exists", "rename_table", "rename_table_spec", 
		"alter_view", "create_view", "drop_view", "view_options"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'.'", "'@'", "'+'", "'-'", "'='", "','", "')'", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'*/'", "'/__MAXWELL__/'", 
		null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ACTION", "ADD", 
		"AFTER", "ALGORITHM", "ALTER", "ALWAYS", "ANALYZE", "AS", "ASC", "ASCII", 
		"AUTO_INCREMENT", "AVG_ROW_LENGTH", "BEGIN", "BIGINT", "BINARY", "BIT", 
		"BLOB", "BOOL", "BOOLEAN", "BTREE", "BY", "BYTE", "CASCADE", "CHANGE", 
		"CHAR", "CHARACTER", "CHARSET", "CHECK", "CHECKSUM", "COALESCE", "COLLATE", 
		"COLUMN", "COLUMNS", "COLUMN_FORMAT", "COMMENT", "COMPACT", "COMPRESSED", 
		"CONNECTION", "CONSTRAINT", "CONVERT", "COPY", "CREATE", "CURRENT_TIMESTAMP", 
		"CURRENT_USER", "DATA", "DATABASE", "DATE", "DATETIME", "DECIMAL", "DEFAULT", 
		"DEFINER", "DELAY_KEY_WRITE", "DELETE", "DESC", "DIRECTORY", "DISABLE", 
		"DISCARD", "DISK", "DOUBLE", "DROP", "DYNAMIC", "ENABLE", "ENGINE", "ENUM", 
		"EXCHANGE", "EXCLUSIVE", "EXISTS", "FALSE", "FIRST", "FIXED", "FLOAT", 
		"FLOAT4", "FLOAT8", "FORCE", "FOREIGN", "FULL", "FULLTEXT", "GENERATED", 
		"GEOMETRY", "GEOMETRYCOLLECTION", "HASH", "IF", "IGNORE", "IMPORT", "INDEX", 
		"INPLACE", "INSERT_METHOD", "INSTANT", "INT", "INT1", "INT2", "INT3", 
		"INT4", "INT8", "INTEGER", "INTO", "INVISIBLE", "INVOKER", "JSON", "KEY", 
		"KEYS", "KEY_BLOCK_SIZE", "LAST", "LIKE", "LINEAR", "LINESTRING", "LIST", 
		"LOCALTIME", "LOCALTIMESTAMP", "LOCK", "LONG", "LONGBLOB", "LONGTEXT", 
		"MATCH", "MAX_ROWS", "MEDIUMBLOB", "MEDIUMINT", "MEDIUMTEXT", "MEMORY", 
		"MERGE", "MIDDLEINT", "MIN_ROWS", "MODIFY", "MULTILINESTRING", "MULTIPOINT", 
		"MULTIPOLYGON", "NAME", "NATIONAL", "NCHAR", "NO", "NONE", "NOT", "NOW", 
		"NULL", "NUMERIC", "NVARCHAR", "OFFLINE", "ON", "ONLINE", "OPTIMIZE", 
		"OR", "ORDER", "PACK_KEYS", "PARSER", "PARTIAL", "PARTITION", "PARTITIONING", 
		"PARTITIONS", "PASSWORD", "POINT", "POLYGON", "PRECISION", "PRIMARY", 
		"RANGE", "REAL", "REBUILD", "REDUNDANT", "REFERENCES", "REMOVE", "RENAME", 
		"REORGANIZE", "REPAIR", "REPLACE", "RESTRICT", "ROW_FORMAT", "SCHEMA", 
		"SECURITY", "SERIAL", "SET", "SHARED", "SIGNED", "SIMPLE", "SMALLINT", 
		"SPATIAL", "SQL", "STATS_AUTO_RECALC", "STATS_PERSISTENT", "STATS_SAMPLE_PAGES", 
		"STORAGE", "STORED", "SUBPARTITION", "SUBPARTITIONS", "TABLE", "TABLESPACE", 
		"TEMPORARY", "TEMPTABLE", "TEXT", "TIME", "TIMESTAMP", "TINYBLOB", "TINYINT", 
		"TINYTEXT", "TO", "TRUE", "TRUNCATE", "UNDEFINED", "UNICODE", "UNION", 
		"UNIQUE", "UNSIGNED", "UPDATE", "UPGRADE", "USING", "VALIDATION", "VARBINARY", 
		"VARCHAR", "VARYING", "VIEW", "VIRTUAL", "VISIBLE", "WITH", "WITHOUT", 
		"YEAR", "ZEROFILL", "SQL_UPGRADE_COMMENT", "SQL_UPGRADE_ENDCOMMENT", "MAXWELL_ELIDED_PARSE_ISSUE", 
		"SQL_COMMENT", "SQL_EMPTY_COMMENT", "SQL_LINE_COMMENT", "STRING_LITERAL", 
		"DBL_STRING_LITERAL", "INTEGER_LITERAL", "IDENT", "QUOTED_IDENT", "UNUSED_TOKENS", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mysql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mysqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mysqlParser.EOF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (ALTER - 13)) | (1L << (BEGIN - 13)) | (1L << (CREATE - 13)) | (1L << (DROP - 13)))) != 0) || _la==RENAME) {
				{
				setState(288);
				statement();
				}
			}

			setState(291);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Alter_viewContext alter_view() {
			return getRuleContext(Alter_viewContext.class,0);
		}
		public Alter_databaseContext alter_database() {
			return getRuleContext(Alter_databaseContext.class,0);
		}
		public Create_databaseContext create_database() {
			return getRuleContext(Create_databaseContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Create_viewContext create_view() {
			return getRuleContext(Create_viewContext.class,0);
		}
		public Drop_databaseContext drop_database() {
			return getRuleContext(Drop_databaseContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Drop_viewContext drop_view() {
			return getRuleContext(Drop_viewContext.class,0);
		}
		public Rename_tableContext rename_table() {
			return getRuleContext(Rename_tableContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(mysqlParser.BEGIN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				alter_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				alter_view();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				alter_database();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				create_database();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				create_table();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				create_view();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				drop_database();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(300);
				drop_table();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(301);
				drop_view();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(302);
				rename_table();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(303);
				match(BEGIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tokens_available_for_namesContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(mysqlParser.ACTION, 0); }
		public TerminalNode AFTER() { return getToken(mysqlParser.AFTER, 0); }
		public TerminalNode ALGORITHM() { return getToken(mysqlParser.ALGORITHM, 0); }
		public TerminalNode ALWAYS() { return getToken(mysqlParser.ALWAYS, 0); }
		public TerminalNode ASCII() { return getToken(mysqlParser.ASCII, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(mysqlParser.AUTO_INCREMENT, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(mysqlParser.AVG_ROW_LENGTH, 0); }
		public TerminalNode BEGIN() { return getToken(mysqlParser.BEGIN, 0); }
		public TerminalNode BIT() { return getToken(mysqlParser.BIT, 0); }
		public TerminalNode BOOL() { return getToken(mysqlParser.BOOL, 0); }
		public TerminalNode BOOLEAN() { return getToken(mysqlParser.BOOLEAN, 0); }
		public TerminalNode BTREE() { return getToken(mysqlParser.BTREE, 0); }
		public TerminalNode BYTE() { return getToken(mysqlParser.BYTE, 0); }
		public TerminalNode CHARSET() { return getToken(mysqlParser.CHARSET, 0); }
		public TerminalNode CHECKSUM() { return getToken(mysqlParser.CHECKSUM, 0); }
		public TerminalNode COALESCE() { return getToken(mysqlParser.COALESCE, 0); }
		public TerminalNode COLUMNS() { return getToken(mysqlParser.COLUMNS, 0); }
		public TerminalNode COLUMN_FORMAT() { return getToken(mysqlParser.COLUMN_FORMAT, 0); }
		public TerminalNode COMMENT() { return getToken(mysqlParser.COMMENT, 0); }
		public TerminalNode COMPACT() { return getToken(mysqlParser.COMPACT, 0); }
		public TerminalNode COMPRESSED() { return getToken(mysqlParser.COMPRESSED, 0); }
		public TerminalNode CONNECTION() { return getToken(mysqlParser.CONNECTION, 0); }
		public TerminalNode COPY() { return getToken(mysqlParser.COPY, 0); }
		public TerminalNode DATA() { return getToken(mysqlParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(mysqlParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(mysqlParser.DATETIME, 0); }
		public TerminalNode DEFINER() { return getToken(mysqlParser.DEFINER, 0); }
		public TerminalNode DELAY_KEY_WRITE() { return getToken(mysqlParser.DELAY_KEY_WRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(mysqlParser.DIRECTORY, 0); }
		public TerminalNode DISABLE() { return getToken(mysqlParser.DISABLE, 0); }
		public TerminalNode DISCARD() { return getToken(mysqlParser.DISCARD, 0); }
		public TerminalNode DISK() { return getToken(mysqlParser.DISK, 0); }
		public TerminalNode DYNAMIC() { return getToken(mysqlParser.DYNAMIC, 0); }
		public TerminalNode ENABLE() { return getToken(mysqlParser.ENABLE, 0); }
		public TerminalNode ENGINE() { return getToken(mysqlParser.ENGINE, 0); }
		public TerminalNode ENUM() { return getToken(mysqlParser.ENUM, 0); }
		public TerminalNode EXCHANGE() { return getToken(mysqlParser.EXCHANGE, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(mysqlParser.EXCLUSIVE, 0); }
		public TerminalNode FIRST() { return getToken(mysqlParser.FIRST, 0); }
		public TerminalNode FIXED() { return getToken(mysqlParser.FIXED, 0); }
		public TerminalNode FULL() { return getToken(mysqlParser.FULL, 0); }
		public TerminalNode GEOMETRY() { return getToken(mysqlParser.GEOMETRY, 0); }
		public TerminalNode GEOMETRYCOLLECTION() { return getToken(mysqlParser.GEOMETRYCOLLECTION, 0); }
		public TerminalNode HASH() { return getToken(mysqlParser.HASH, 0); }
		public TerminalNode IMPORT() { return getToken(mysqlParser.IMPORT, 0); }
		public TerminalNode INPLACE() { return getToken(mysqlParser.INPLACE, 0); }
		public TerminalNode INSERT_METHOD() { return getToken(mysqlParser.INSERT_METHOD, 0); }
		public TerminalNode INSTANT() { return getToken(mysqlParser.INSTANT, 0); }
		public TerminalNode INVISIBLE() { return getToken(mysqlParser.INVISIBLE, 0); }
		public TerminalNode INVOKER() { return getToken(mysqlParser.INVOKER, 0); }
		public TerminalNode JSON() { return getToken(mysqlParser.JSON, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(mysqlParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode LAST() { return getToken(mysqlParser.LAST, 0); }
		public TerminalNode LINESTRING() { return getToken(mysqlParser.LINESTRING, 0); }
		public TerminalNode LIST() { return getToken(mysqlParser.LIST, 0); }
		public TerminalNode MAX_ROWS() { return getToken(mysqlParser.MAX_ROWS, 0); }
		public TerminalNode MEMORY() { return getToken(mysqlParser.MEMORY, 0); }
		public TerminalNode MERGE() { return getToken(mysqlParser.MERGE, 0); }
		public TerminalNode MIN_ROWS() { return getToken(mysqlParser.MIN_ROWS, 0); }
		public TerminalNode MODIFY() { return getToken(mysqlParser.MODIFY, 0); }
		public TerminalNode MULTILINESTRING() { return getToken(mysqlParser.MULTILINESTRING, 0); }
		public TerminalNode MULTIPOINT() { return getToken(mysqlParser.MULTIPOINT, 0); }
		public TerminalNode MULTIPOLYGON() { return getToken(mysqlParser.MULTIPOLYGON, 0); }
		public TerminalNode NAME() { return getToken(mysqlParser.NAME, 0); }
		public TerminalNode NATIONAL() { return getToken(mysqlParser.NATIONAL, 0); }
		public TerminalNode NCHAR() { return getToken(mysqlParser.NCHAR, 0); }
		public TerminalNode NO() { return getToken(mysqlParser.NO, 0); }
		public TerminalNode NONE() { return getToken(mysqlParser.NONE, 0); }
		public TerminalNode NOW() { return getToken(mysqlParser.NOW, 0); }
		public TerminalNode NVARCHAR() { return getToken(mysqlParser.NVARCHAR, 0); }
		public TerminalNode OFFLINE() { return getToken(mysqlParser.OFFLINE, 0); }
		public TerminalNode ONLINE() { return getToken(mysqlParser.ONLINE, 0); }
		public TerminalNode PACK_KEYS() { return getToken(mysqlParser.PACK_KEYS, 0); }
		public TerminalNode PARSER() { return getToken(mysqlParser.PARSER, 0); }
		public TerminalNode PARTIAL() { return getToken(mysqlParser.PARTIAL, 0); }
		public TerminalNode PARTITIONING() { return getToken(mysqlParser.PARTITIONING, 0); }
		public TerminalNode PARTITIONS() { return getToken(mysqlParser.PARTITIONS, 0); }
		public TerminalNode PASSWORD() { return getToken(mysqlParser.PASSWORD, 0); }
		public TerminalNode POINT() { return getToken(mysqlParser.POINT, 0); }
		public TerminalNode POLYGON() { return getToken(mysqlParser.POLYGON, 0); }
		public TerminalNode REBUILD() { return getToken(mysqlParser.REBUILD, 0); }
		public TerminalNode REDUNDANT() { return getToken(mysqlParser.REDUNDANT, 0); }
		public TerminalNode REMOVE() { return getToken(mysqlParser.REMOVE, 0); }
		public TerminalNode REORGANIZE() { return getToken(mysqlParser.REORGANIZE, 0); }
		public TerminalNode REPAIR() { return getToken(mysqlParser.REPAIR, 0); }
		public TerminalNode ROW_FORMAT() { return getToken(mysqlParser.ROW_FORMAT, 0); }
		public TerminalNode SECURITY() { return getToken(mysqlParser.SECURITY, 0); }
		public TerminalNode SERIAL() { return getToken(mysqlParser.SERIAL, 0); }
		public TerminalNode SHARED() { return getToken(mysqlParser.SHARED, 0); }
		public TerminalNode SIGNED() { return getToken(mysqlParser.SIGNED, 0); }
		public TerminalNode SIMPLE() { return getToken(mysqlParser.SIMPLE, 0); }
		public TerminalNode STATS_AUTO_RECALC() { return getToken(mysqlParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode STATS_PERSISTENT() { return getToken(mysqlParser.STATS_PERSISTENT, 0); }
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(mysqlParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode STORAGE() { return getToken(mysqlParser.STORAGE, 0); }
		public TerminalNode SUBPARTITION() { return getToken(mysqlParser.SUBPARTITION, 0); }
		public TerminalNode SUBPARTITIONS() { return getToken(mysqlParser.SUBPARTITIONS, 0); }
		public TerminalNode TABLESPACE() { return getToken(mysqlParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(mysqlParser.TEMPORARY, 0); }
		public TerminalNode TEMPTABLE() { return getToken(mysqlParser.TEMPTABLE, 0); }
		public TerminalNode TEXT() { return getToken(mysqlParser.TEXT, 0); }
		public TerminalNode TIME() { return getToken(mysqlParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(mysqlParser.TIMESTAMP, 0); }
		public TerminalNode TRUNCATE() { return getToken(mysqlParser.TRUNCATE, 0); }
		public TerminalNode UNDEFINED() { return getToken(mysqlParser.UNDEFINED, 0); }
		public TerminalNode UNICODE() { return getToken(mysqlParser.UNICODE, 0); }
		public TerminalNode UPGRADE() { return getToken(mysqlParser.UPGRADE, 0); }
		public TerminalNode VALIDATION() { return getToken(mysqlParser.VALIDATION, 0); }
		public TerminalNode VIEW() { return getToken(mysqlParser.VIEW, 0); }
		public TerminalNode VISIBLE() { return getToken(mysqlParser.VISIBLE, 0); }
		public TerminalNode WITHOUT() { return getToken(mysqlParser.WITHOUT, 0); }
		public TerminalNode YEAR() { return getToken(mysqlParser.YEAR, 0); }
		public Tokens_available_for_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokens_available_for_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterTokens_available_for_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitTokens_available_for_names(this);
		}
	}

	public final Tokens_available_for_namesContext tokens_available_for_names() throws RecognitionException {
		Tokens_available_for_namesContext _localctx = new Tokens_available_for_namesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tokens_available_for_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INSTANT - 64)) | (1L << (INVISIBLE - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TABLESPACE - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (VISIBLE - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_tokensContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(mysqlParser.ACTION, 0); }
		public TerminalNode ADD() { return getToken(mysqlParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(mysqlParser.AFTER, 0); }
		public TerminalNode ALGORITHM() { return getToken(mysqlParser.ALGORITHM, 0); }
		public TerminalNode ALTER() { return getToken(mysqlParser.ALTER, 0); }
		public TerminalNode ALWAYS() { return getToken(mysqlParser.ALWAYS, 0); }
		public TerminalNode ANALYZE() { return getToken(mysqlParser.ANALYZE, 0); }
		public TerminalNode AS() { return getToken(mysqlParser.AS, 0); }
		public TerminalNode ASC() { return getToken(mysqlParser.ASC, 0); }
		public TerminalNode ASCII() { return getToken(mysqlParser.ASCII, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(mysqlParser.AUTO_INCREMENT, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(mysqlParser.AVG_ROW_LENGTH, 0); }
		public TerminalNode BEGIN() { return getToken(mysqlParser.BEGIN, 0); }
		public TerminalNode BIGINT() { return getToken(mysqlParser.BIGINT, 0); }
		public TerminalNode BINARY() { return getToken(mysqlParser.BINARY, 0); }
		public TerminalNode BIT() { return getToken(mysqlParser.BIT, 0); }
		public TerminalNode BLOB() { return getToken(mysqlParser.BLOB, 0); }
		public TerminalNode BOOL() { return getToken(mysqlParser.BOOL, 0); }
		public TerminalNode BOOLEAN() { return getToken(mysqlParser.BOOLEAN, 0); }
		public TerminalNode BTREE() { return getToken(mysqlParser.BTREE, 0); }
		public TerminalNode BY() { return getToken(mysqlParser.BY, 0); }
		public TerminalNode BYTE() { return getToken(mysqlParser.BYTE, 0); }
		public TerminalNode CASCADE() { return getToken(mysqlParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(mysqlParser.CHANGE, 0); }
		public TerminalNode CHAR() { return getToken(mysqlParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(mysqlParser.CHARACTER, 0); }
		public TerminalNode CHARSET() { return getToken(mysqlParser.CHARSET, 0); }
		public TerminalNode CHECK() { return getToken(mysqlParser.CHECK, 0); }
		public TerminalNode CHECKSUM() { return getToken(mysqlParser.CHECKSUM, 0); }
		public TerminalNode COALESCE() { return getToken(mysqlParser.COALESCE, 0); }
		public TerminalNode COLLATE() { return getToken(mysqlParser.COLLATE, 0); }
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(mysqlParser.COLUMNS, 0); }
		public TerminalNode COLUMN_FORMAT() { return getToken(mysqlParser.COLUMN_FORMAT, 0); }
		public TerminalNode COMMENT() { return getToken(mysqlParser.COMMENT, 0); }
		public TerminalNode COMPACT() { return getToken(mysqlParser.COMPACT, 0); }
		public TerminalNode COMPRESSED() { return getToken(mysqlParser.COMPRESSED, 0); }
		public TerminalNode CONNECTION() { return getToken(mysqlParser.CONNECTION, 0); }
		public TerminalNode CONSTRAINT() { return getToken(mysqlParser.CONSTRAINT, 0); }
		public TerminalNode CONVERT() { return getToken(mysqlParser.CONVERT, 0); }
		public TerminalNode COPY() { return getToken(mysqlParser.COPY, 0); }
		public TerminalNode CREATE() { return getToken(mysqlParser.CREATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(mysqlParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(mysqlParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(mysqlParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(mysqlParser.DATABASE, 0); }
		public TerminalNode DATE() { return getToken(mysqlParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(mysqlParser.DATETIME, 0); }
		public TerminalNode DECIMAL() { return getToken(mysqlParser.DECIMAL, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode DEFINER() { return getToken(mysqlParser.DEFINER, 0); }
		public TerminalNode DELAY_KEY_WRITE() { return getToken(mysqlParser.DELAY_KEY_WRITE, 0); }
		public TerminalNode DELETE() { return getToken(mysqlParser.DELETE, 0); }
		public TerminalNode DESC() { return getToken(mysqlParser.DESC, 0); }
		public TerminalNode DIRECTORY() { return getToken(mysqlParser.DIRECTORY, 0); }
		public TerminalNode DISABLE() { return getToken(mysqlParser.DISABLE, 0); }
		public TerminalNode DISCARD() { return getToken(mysqlParser.DISCARD, 0); }
		public TerminalNode DISK() { return getToken(mysqlParser.DISK, 0); }
		public TerminalNode DOUBLE() { return getToken(mysqlParser.DOUBLE, 0); }
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public TerminalNode DYNAMIC() { return getToken(mysqlParser.DYNAMIC, 0); }
		public TerminalNode ENABLE() { return getToken(mysqlParser.ENABLE, 0); }
		public TerminalNode ENGINE() { return getToken(mysqlParser.ENGINE, 0); }
		public TerminalNode ENUM() { return getToken(mysqlParser.ENUM, 0); }
		public TerminalNode EXCHANGE() { return getToken(mysqlParser.EXCHANGE, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(mysqlParser.EXCLUSIVE, 0); }
		public TerminalNode EXISTS() { return getToken(mysqlParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(mysqlParser.FALSE, 0); }
		public TerminalNode FIRST() { return getToken(mysqlParser.FIRST, 0); }
		public TerminalNode FIXED() { return getToken(mysqlParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(mysqlParser.FLOAT, 0); }
		public TerminalNode FLOAT4() { return getToken(mysqlParser.FLOAT4, 0); }
		public TerminalNode FLOAT8() { return getToken(mysqlParser.FLOAT8, 0); }
		public TerminalNode FORCE() { return getToken(mysqlParser.FORCE, 0); }
		public TerminalNode FOREIGN() { return getToken(mysqlParser.FOREIGN, 0); }
		public TerminalNode FULL() { return getToken(mysqlParser.FULL, 0); }
		public TerminalNode FULLTEXT() { return getToken(mysqlParser.FULLTEXT, 0); }
		public TerminalNode GENERATED() { return getToken(mysqlParser.GENERATED, 0); }
		public TerminalNode GEOMETRY() { return getToken(mysqlParser.GEOMETRY, 0); }
		public TerminalNode GEOMETRYCOLLECTION() { return getToken(mysqlParser.GEOMETRYCOLLECTION, 0); }
		public TerminalNode HASH() { return getToken(mysqlParser.HASH, 0); }
		public TerminalNode IF() { return getToken(mysqlParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(mysqlParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(mysqlParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(mysqlParser.INDEX, 0); }
		public TerminalNode INPLACE() { return getToken(mysqlParser.INPLACE, 0); }
		public TerminalNode INSERT_METHOD() { return getToken(mysqlParser.INSERT_METHOD, 0); }
		public TerminalNode INSTANT() { return getToken(mysqlParser.INSTANT, 0); }
		public TerminalNode INT() { return getToken(mysqlParser.INT, 0); }
		public TerminalNode INT1() { return getToken(mysqlParser.INT1, 0); }
		public TerminalNode INT2() { return getToken(mysqlParser.INT2, 0); }
		public TerminalNode INT3() { return getToken(mysqlParser.INT3, 0); }
		public TerminalNode INT4() { return getToken(mysqlParser.INT4, 0); }
		public TerminalNode INT8() { return getToken(mysqlParser.INT8, 0); }
		public TerminalNode INTEGER() { return getToken(mysqlParser.INTEGER, 0); }
		public TerminalNode INTO() { return getToken(mysqlParser.INTO, 0); }
		public TerminalNode INVISIBLE() { return getToken(mysqlParser.INVISIBLE, 0); }
		public TerminalNode INVOKER() { return getToken(mysqlParser.INVOKER, 0); }
		public TerminalNode JSON() { return getToken(mysqlParser.JSON, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public TerminalNode KEYS() { return getToken(mysqlParser.KEYS, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(mysqlParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode LAST() { return getToken(mysqlParser.LAST, 0); }
		public TerminalNode LIKE() { return getToken(mysqlParser.LIKE, 0); }
		public TerminalNode LINEAR() { return getToken(mysqlParser.LINEAR, 0); }
		public TerminalNode LINESTRING() { return getToken(mysqlParser.LINESTRING, 0); }
		public TerminalNode LIST() { return getToken(mysqlParser.LIST, 0); }
		public TerminalNode LOCALTIME() { return getToken(mysqlParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(mysqlParser.LOCALTIMESTAMP, 0); }
		public TerminalNode LOCK() { return getToken(mysqlParser.LOCK, 0); }
		public TerminalNode LONG() { return getToken(mysqlParser.LONG, 0); }
		public TerminalNode LONGBLOB() { return getToken(mysqlParser.LONGBLOB, 0); }
		public TerminalNode LONGTEXT() { return getToken(mysqlParser.LONGTEXT, 0); }
		public TerminalNode MATCH() { return getToken(mysqlParser.MATCH, 0); }
		public TerminalNode MAX_ROWS() { return getToken(mysqlParser.MAX_ROWS, 0); }
		public TerminalNode MEDIUMBLOB() { return getToken(mysqlParser.MEDIUMBLOB, 0); }
		public TerminalNode MEDIUMINT() { return getToken(mysqlParser.MEDIUMINT, 0); }
		public TerminalNode MEDIUMTEXT() { return getToken(mysqlParser.MEDIUMTEXT, 0); }
		public TerminalNode MEMORY() { return getToken(mysqlParser.MEMORY, 0); }
		public TerminalNode MERGE() { return getToken(mysqlParser.MERGE, 0); }
		public TerminalNode MIDDLEINT() { return getToken(mysqlParser.MIDDLEINT, 0); }
		public TerminalNode MIN_ROWS() { return getToken(mysqlParser.MIN_ROWS, 0); }
		public TerminalNode MODIFY() { return getToken(mysqlParser.MODIFY, 0); }
		public TerminalNode MULTILINESTRING() { return getToken(mysqlParser.MULTILINESTRING, 0); }
		public TerminalNode MULTIPOINT() { return getToken(mysqlParser.MULTIPOINT, 0); }
		public TerminalNode MULTIPOLYGON() { return getToken(mysqlParser.MULTIPOLYGON, 0); }
		public TerminalNode NAME() { return getToken(mysqlParser.NAME, 0); }
		public TerminalNode NATIONAL() { return getToken(mysqlParser.NATIONAL, 0); }
		public TerminalNode NCHAR() { return getToken(mysqlParser.NCHAR, 0); }
		public TerminalNode NO() { return getToken(mysqlParser.NO, 0); }
		public TerminalNode NONE() { return getToken(mysqlParser.NONE, 0); }
		public TerminalNode NOT() { return getToken(mysqlParser.NOT, 0); }
		public TerminalNode NOW() { return getToken(mysqlParser.NOW, 0); }
		public TerminalNode NULL() { return getToken(mysqlParser.NULL, 0); }
		public TerminalNode NUMERIC() { return getToken(mysqlParser.NUMERIC, 0); }
		public TerminalNode NVARCHAR() { return getToken(mysqlParser.NVARCHAR, 0); }
		public TerminalNode OFFLINE() { return getToken(mysqlParser.OFFLINE, 0); }
		public TerminalNode ON() { return getToken(mysqlParser.ON, 0); }
		public TerminalNode ONLINE() { return getToken(mysqlParser.ONLINE, 0); }
		public TerminalNode OPTIMIZE() { return getToken(mysqlParser.OPTIMIZE, 0); }
		public TerminalNode OR() { return getToken(mysqlParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(mysqlParser.ORDER, 0); }
		public TerminalNode PACK_KEYS() { return getToken(mysqlParser.PACK_KEYS, 0); }
		public TerminalNode PARSER() { return getToken(mysqlParser.PARSER, 0); }
		public TerminalNode PARTIAL() { return getToken(mysqlParser.PARTIAL, 0); }
		public TerminalNode PARTITION() { return getToken(mysqlParser.PARTITION, 0); }
		public TerminalNode PARTITIONING() { return getToken(mysqlParser.PARTITIONING, 0); }
		public TerminalNode PARTITIONS() { return getToken(mysqlParser.PARTITIONS, 0); }
		public TerminalNode PASSWORD() { return getToken(mysqlParser.PASSWORD, 0); }
		public TerminalNode POINT() { return getToken(mysqlParser.POINT, 0); }
		public TerminalNode POLYGON() { return getToken(mysqlParser.POLYGON, 0); }
		public TerminalNode PRECISION() { return getToken(mysqlParser.PRECISION, 0); }
		public TerminalNode PRIMARY() { return getToken(mysqlParser.PRIMARY, 0); }
		public TerminalNode RANGE() { return getToken(mysqlParser.RANGE, 0); }
		public TerminalNode REAL() { return getToken(mysqlParser.REAL, 0); }
		public TerminalNode REBUILD() { return getToken(mysqlParser.REBUILD, 0); }
		public TerminalNode REDUNDANT() { return getToken(mysqlParser.REDUNDANT, 0); }
		public TerminalNode REFERENCES() { return getToken(mysqlParser.REFERENCES, 0); }
		public TerminalNode REMOVE() { return getToken(mysqlParser.REMOVE, 0); }
		public TerminalNode RENAME() { return getToken(mysqlParser.RENAME, 0); }
		public TerminalNode REORGANIZE() { return getToken(mysqlParser.REORGANIZE, 0); }
		public TerminalNode REPAIR() { return getToken(mysqlParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(mysqlParser.REPLACE, 0); }
		public TerminalNode RESTRICT() { return getToken(mysqlParser.RESTRICT, 0); }
		public TerminalNode ROW_FORMAT() { return getToken(mysqlParser.ROW_FORMAT, 0); }
		public TerminalNode SCHEMA() { return getToken(mysqlParser.SCHEMA, 0); }
		public TerminalNode SECURITY() { return getToken(mysqlParser.SECURITY, 0); }
		public TerminalNode SERIAL() { return getToken(mysqlParser.SERIAL, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public TerminalNode SHARED() { return getToken(mysqlParser.SHARED, 0); }
		public TerminalNode SIGNED() { return getToken(mysqlParser.SIGNED, 0); }
		public TerminalNode SIMPLE() { return getToken(mysqlParser.SIMPLE, 0); }
		public TerminalNode SMALLINT() { return getToken(mysqlParser.SMALLINT, 0); }
		public TerminalNode SPATIAL() { return getToken(mysqlParser.SPATIAL, 0); }
		public TerminalNode SQL() { return getToken(mysqlParser.SQL, 0); }
		public TerminalNode STATS_AUTO_RECALC() { return getToken(mysqlParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode STATS_PERSISTENT() { return getToken(mysqlParser.STATS_PERSISTENT, 0); }
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(mysqlParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode STORAGE() { return getToken(mysqlParser.STORAGE, 0); }
		public TerminalNode STORED() { return getToken(mysqlParser.STORED, 0); }
		public TerminalNode SUBPARTITION() { return getToken(mysqlParser.SUBPARTITION, 0); }
		public TerminalNode SUBPARTITIONS() { return getToken(mysqlParser.SUBPARTITIONS, 0); }
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public TerminalNode TABLESPACE() { return getToken(mysqlParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(mysqlParser.TEMPORARY, 0); }
		public TerminalNode TEMPTABLE() { return getToken(mysqlParser.TEMPTABLE, 0); }
		public TerminalNode TEXT() { return getToken(mysqlParser.TEXT, 0); }
		public TerminalNode TIME() { return getToken(mysqlParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(mysqlParser.TIMESTAMP, 0); }
		public TerminalNode TINYBLOB() { return getToken(mysqlParser.TINYBLOB, 0); }
		public TerminalNode TINYINT() { return getToken(mysqlParser.TINYINT, 0); }
		public TerminalNode TINYTEXT() { return getToken(mysqlParser.TINYTEXT, 0); }
		public TerminalNode TO() { return getToken(mysqlParser.TO, 0); }
		public TerminalNode TRUE() { return getToken(mysqlParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(mysqlParser.TRUNCATE, 0); }
		public TerminalNode UNDEFINED() { return getToken(mysqlParser.UNDEFINED, 0); }
		public TerminalNode UNICODE() { return getToken(mysqlParser.UNICODE, 0); }
		public TerminalNode UNION() { return getToken(mysqlParser.UNION, 0); }
		public TerminalNode UNIQUE() { return getToken(mysqlParser.UNIQUE, 0); }
		public TerminalNode UNSIGNED() { return getToken(mysqlParser.UNSIGNED, 0); }
		public TerminalNode UPDATE() { return getToken(mysqlParser.UPDATE, 0); }
		public TerminalNode UPGRADE() { return getToken(mysqlParser.UPGRADE, 0); }
		public TerminalNode USING() { return getToken(mysqlParser.USING, 0); }
		public TerminalNode VALIDATION() { return getToken(mysqlParser.VALIDATION, 0); }
		public TerminalNode VARBINARY() { return getToken(mysqlParser.VARBINARY, 0); }
		public TerminalNode VARCHAR() { return getToken(mysqlParser.VARCHAR, 0); }
		public TerminalNode VARYING() { return getToken(mysqlParser.VARYING, 0); }
		public TerminalNode VIEW() { return getToken(mysqlParser.VIEW, 0); }
		public TerminalNode VIRTUAL() { return getToken(mysqlParser.VIRTUAL, 0); }
		public TerminalNode VISIBLE() { return getToken(mysqlParser.VISIBLE, 0); }
		public TerminalNode WITH() { return getToken(mysqlParser.WITH, 0); }
		public TerminalNode WITHOUT() { return getToken(mysqlParser.WITHOUT, 0); }
		public TerminalNode YEAR() { return getToken(mysqlParser.YEAR, 0); }
		public TerminalNode ZEROFILL() { return getToken(mysqlParser.ZEROFILL, 0); }
		public All_tokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAll_tokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAll_tokens(this);
		}
	}

	public final All_tokensContext all_tokens() throws RecognitionException {
		All_tokensContext _localctx = new All_tokensContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_all_tokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << ADD) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALTER) | (1L << ALWAYS) | (1L << ANALYZE) | (1L << AS) | (1L << ASC) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BLOB) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BY) | (1L << BYTE) | (1L << CASCADE) | (1L << CHANGE) | (1L << CHAR) | (1L << CHARACTER) | (1L << CHARSET) | (1L << CHECK) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLLATE) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << CONSTRAINT) | (1L << CONVERT) | (1L << COPY) | (1L << CREATE) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATABASE) | (1L << DATE) | (1L << DATETIME) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DELETE) | (1L << DESC) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DOUBLE - 64)) | (1L << (DROP - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (EXISTS - 64)) | (1L << (FALSE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FLOAT - 64)) | (1L << (FLOAT4 - 64)) | (1L << (FLOAT8 - 64)) | (1L << (FORCE - 64)) | (1L << (FOREIGN - 64)) | (1L << (FULL - 64)) | (1L << (FULLTEXT - 64)) | (1L << (GENERATED - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (INDEX - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INSTANT - 64)) | (1L << (INT - 64)) | (1L << (INT1 - 64)) | (1L << (INT2 - 64)) | (1L << (INT3 - 64)) | (1L << (INT4 - 64)) | (1L << (INT8 - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (INVISIBLE - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY - 64)) | (1L << (KEYS - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LIKE - 64)) | (1L << (LINEAR - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOCK - 64)) | (1L << (LONG - 64)) | (1L << (LONGBLOB - 64)) | (1L << (LONGTEXT - 64)) | (1L << (MATCH - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEDIUMBLOB - 64)) | (1L << (MEDIUMINT - 64)) | (1L << (MEDIUMTEXT - 64)) | (1L << (MEMORY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (MIDDLEINT - 128)) | (1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOT - 128)) | (1L << (NOW - 128)) | (1L << (NULL - 128)) | (1L << (NUMERIC - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ON - 128)) | (1L << (ONLINE - 128)) | (1L << (OPTIMIZE - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIMARY - 128)) | (1L << (RANGE - 128)) | (1L << (REAL - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REFERENCES - 128)) | (1L << (REMOVE - 128)) | (1L << (RENAME - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (REPLACE - 128)) | (1L << (RESTRICT - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SCHEMA - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SET - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (SMALLINT - 128)) | (1L << (SPATIAL - 128)) | (1L << (SQL - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (STORED - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)) | (1L << (TABLE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TABLESPACE - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TINYBLOB - 192)) | (1L << (TINYINT - 192)) | (1L << (TINYTEXT - 192)) | (1L << (TO - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UNION - 192)) | (1L << (UNIQUE - 192)) | (1L << (UNSIGNED - 192)) | (1L << (UPDATE - 192)) | (1L << (UPGRADE - 192)) | (1L << (USING - 192)) | (1L << (VALIDATION - 192)) | (1L << (VARBINARY - 192)) | (1L << (VARCHAR - 192)) | (1L << (VARYING - 192)) | (1L << (VIEW - 192)) | (1L << (VIRTUAL - 192)) | (1L << (VISIBLE - 192)) | (1L << (WITH - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (ZEROFILL - 192)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Skip_parensContext extends ParserRuleContext {
		public TerminalNode MAXWELL_ELIDED_PARSE_ISSUE() { return getToken(mysqlParser.MAXWELL_ELIDED_PARSE_ISSUE, 0); }
		public Skip_parensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_parens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterSkip_parens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitSkip_parens(this);
		}
	}

	public final Skip_parensContext skip_parens() throws RecognitionException {
		Skip_parensContext _localctx = new Skip_parensContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_skip_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==MAXWELL_ELIDED_PARSE_ISSUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Db_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Db_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDb_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDb_name(this);
		}
	}

	public final Db_nameContext db_name() throws RecognitionException {
		Db_nameContext _localctx = new Db_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_db_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Db_nameContext db_name() {
			return getRuleContext(Db_nameContext.class,0);
		}
		public Name_all_tokensContext name_all_tokens() {
			return getRuleContext(Name_all_tokensContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_table_name);
		try {
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(314);
				db_name();
				setState(315);
				match(T__1);
				setState(316);
				name_all_tokens();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(T__1);
				setState(319);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserContext extends ParserRuleContext {
		public List<User_tokenContext> user_token() {
			return getRuleContexts(User_tokenContext.class);
		}
		public User_tokenContext user_token(int i) {
			return getRuleContext(User_tokenContext.class,i);
		}
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitUser(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_user);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			user_token();
			setState(326);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(324);
				match(T__2);
				setState(325);
				user_token();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_tokenContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public TerminalNode QUOTED_IDENT() { return getToken(mysqlParser.QUOTED_IDENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public User_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterUser_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitUser_token(this);
		}
	}

	public final User_tokenContext user_token() throws RecognitionException {
		User_tokenContext _localctx = new User_tokenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_user_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(328);
				match(IDENT);
				}
				break;
			case QUOTED_IDENT:
				{
				setState(329);
				match(QUOTED_IDENT);
				}
				break;
			case STRING_LITERAL:
			case DBL_STRING_LITERAL:
				{
				setState(330);
				string_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Tokens_available_for_namesContext tokens_available_for_names() {
			return getRuleContext(Tokens_available_for_namesContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public TerminalNode DBL_STRING_LITERAL() { return getToken(mysqlParser.DBL_STRING_LITERAL, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			switch (_input.LA(1)) {
			case IDENT:
			case QUOTED_IDENT:
				{
				setState(333);
				id();
				}
				break;
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case ALWAYS:
			case ASCII:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BIT:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BYTE:
			case CHARSET:
			case CHECKSUM:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case CONNECTION:
			case COPY:
			case DATA:
			case DATE:
			case DATETIME:
			case DEFINER:
			case DELAY_KEY_WRITE:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DYNAMIC:
			case ENABLE:
			case ENGINE:
			case ENUM:
			case EXCHANGE:
			case EXCLUSIVE:
			case FIRST:
			case FIXED:
			case FULL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case HASH:
			case IMPORT:
			case INPLACE:
			case INSERT_METHOD:
			case INSTANT:
			case INVISIBLE:
			case INVOKER:
			case JSON:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LINESTRING:
			case LIST:
			case MAX_ROWS:
			case MEMORY:
			case MERGE:
			case MIN_ROWS:
			case MODIFY:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case NAME:
			case NATIONAL:
			case NCHAR:
			case NO:
			case NONE:
			case NOW:
			case NVARCHAR:
			case OFFLINE:
			case ONLINE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case POINT:
			case POLYGON:
			case REBUILD:
			case REDUNDANT:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case ROW_FORMAT:
			case SECURITY:
			case SERIAL:
			case SHARED:
			case SIGNED:
			case SIMPLE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case TABLESPACE:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TRUNCATE:
			case UNDEFINED:
			case UNICODE:
			case UPGRADE:
			case VALIDATION:
			case VIEW:
			case VISIBLE:
			case WITHOUT:
			case YEAR:
				{
				setState(334);
				tokens_available_for_names();
				}
				break;
			case INTEGER_LITERAL:
				{
				setState(335);
				match(INTEGER_LITERAL);
				}
				break;
			case DBL_STRING_LITERAL:
				{
				setState(336);
				match(DBL_STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_all_tokensContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public All_tokensContext all_tokens() {
			return getRuleContext(All_tokensContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public TerminalNode DBL_STRING_LITERAL() { return getToken(mysqlParser.DBL_STRING_LITERAL, 0); }
		public Name_all_tokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_all_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterName_all_tokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitName_all_tokens(this);
		}
	}

	public final Name_all_tokensContext name_all_tokens() throws RecognitionException {
		Name_all_tokensContext _localctx = new Name_all_tokensContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name_all_tokens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			switch (_input.LA(1)) {
			case IDENT:
			case QUOTED_IDENT:
				{
				setState(339);
				id();
				}
				break;
			case ACTION:
			case ADD:
			case AFTER:
			case ALGORITHM:
			case ALTER:
			case ALWAYS:
			case ANALYZE:
			case AS:
			case ASC:
			case ASCII:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BIGINT:
			case BINARY:
			case BIT:
			case BLOB:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BY:
			case BYTE:
			case CASCADE:
			case CHANGE:
			case CHAR:
			case CHARACTER:
			case CHARSET:
			case CHECK:
			case CHECKSUM:
			case COALESCE:
			case COLLATE:
			case COLUMN:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case CONNECTION:
			case CONSTRAINT:
			case CONVERT:
			case COPY:
			case CREATE:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATABASE:
			case DATE:
			case DATETIME:
			case DECIMAL:
			case DEFAULT:
			case DEFINER:
			case DELAY_KEY_WRITE:
			case DELETE:
			case DESC:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DOUBLE:
			case DROP:
			case DYNAMIC:
			case ENABLE:
			case ENGINE:
			case ENUM:
			case EXCHANGE:
			case EXCLUSIVE:
			case EXISTS:
			case FALSE:
			case FIRST:
			case FIXED:
			case FLOAT:
			case FLOAT4:
			case FLOAT8:
			case FORCE:
			case FOREIGN:
			case FULL:
			case FULLTEXT:
			case GENERATED:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case HASH:
			case IF:
			case IGNORE:
			case IMPORT:
			case INDEX:
			case INPLACE:
			case INSERT_METHOD:
			case INSTANT:
			case INT:
			case INT1:
			case INT2:
			case INT3:
			case INT4:
			case INT8:
			case INTEGER:
			case INTO:
			case INVISIBLE:
			case INVOKER:
			case JSON:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LIKE:
			case LINEAR:
			case LINESTRING:
			case LIST:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCK:
			case LONG:
			case LONGBLOB:
			case LONGTEXT:
			case MATCH:
			case MAX_ROWS:
			case MEDIUMBLOB:
			case MEDIUMINT:
			case MEDIUMTEXT:
			case MEMORY:
			case MERGE:
			case MIDDLEINT:
			case MIN_ROWS:
			case MODIFY:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case NAME:
			case NATIONAL:
			case NCHAR:
			case NO:
			case NONE:
			case NOT:
			case NOW:
			case NULL:
			case NUMERIC:
			case NVARCHAR:
			case OFFLINE:
			case ON:
			case ONLINE:
			case OPTIMIZE:
			case OR:
			case ORDER:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITION:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case POINT:
			case POLYGON:
			case PRECISION:
			case PRIMARY:
			case RANGE:
			case REAL:
			case REBUILD:
			case REDUNDANT:
			case REFERENCES:
			case REMOVE:
			case RENAME:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case RESTRICT:
			case ROW_FORMAT:
			case SCHEMA:
			case SECURITY:
			case SERIAL:
			case SET:
			case SHARED:
			case SIGNED:
			case SIMPLE:
			case SMALLINT:
			case SPATIAL:
			case SQL:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case STORED:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case TABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TINYBLOB:
			case TINYINT:
			case TINYTEXT:
			case TO:
			case TRUE:
			case TRUNCATE:
			case UNDEFINED:
			case UNICODE:
			case UNION:
			case UNIQUE:
			case UNSIGNED:
			case UPDATE:
			case UPGRADE:
			case USING:
			case VALIDATION:
			case VARBINARY:
			case VARCHAR:
			case VARYING:
			case VIEW:
			case VIRTUAL:
			case VISIBLE:
			case WITH:
			case WITHOUT:
			case YEAR:
			case ZEROFILL:
				{
				setState(340);
				all_tokens();
				}
				break;
			case INTEGER_LITERAL:
				{
				setState(341);
				match(INTEGER_LITERAL);
				}
				break;
			case DBL_STRING_LITERAL:
				{
				setState(342);
				match(DBL_STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public TerminalNode QUOTED_IDENT() { return getToken(mysqlParser.QUOTED_IDENT, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==QUOTED_IDENT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Byte_literalContext byte_literal() {
			return getRuleContext(Byte_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(mysqlParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(mysqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(mysqlParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(347);
				float_literal();
				}
				break;
			case 2:
				{
				setState(348);
				integer_literal();
				}
				break;
			case 3:
				{
				setState(349);
				string_literal();
				}
				break;
			case 4:
				{
				setState(350);
				byte_literal();
				}
				break;
			case 5:
				{
				setState(351);
				match(NULL);
				}
				break;
			case 6:
				{
				setState(352);
				match(TRUE);
				}
				break;
			case 7:
				{
				setState(353);
				match(FALSE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_with_weirdo_multistringContext extends ParserRuleContext {
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Byte_literalContext byte_literal() {
			return getRuleContext(Byte_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(mysqlParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(mysqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(mysqlParser.FALSE, 0); }
		public List<String_literalContext> string_literal() {
			return getRuleContexts(String_literalContext.class);
		}
		public String_literalContext string_literal(int i) {
			return getRuleContext(String_literalContext.class,i);
		}
		public Literal_with_weirdo_multistringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_with_weirdo_multistring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterLiteral_with_weirdo_multistring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitLiteral_with_weirdo_multistring(this);
		}
	}

	public final Literal_with_weirdo_multistringContext literal_with_weirdo_multistring() throws RecognitionException {
		Literal_with_weirdo_multistringContext _localctx = new Literal_with_weirdo_multistringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal_with_weirdo_multistring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(356);
				float_literal();
				}
				break;
			case 2:
				{
				setState(357);
				integer_literal();
				}
				break;
			case 3:
				{
				setState(359); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(358);
					string_literal();
					}
					}
					setState(361); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING_LITERAL || _la==DBL_STRING_LITERAL );
				}
				break;
			case 4:
				{
				setState(363);
				byte_literal();
				}
				break;
			case 5:
				{
				setState(364);
				match(NULL);
				}
				break;
			case 6:
				{
				setState(365);
				match(TRUE);
				}
				break;
			case 7:
				{
				setState(366);
				match(FALSE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_literalContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(mysqlParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(mysqlParser.INTEGER_LITERAL, i);
		}
		public Float_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterFloat_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitFloat_literal(this);
		}
	}

	public final Float_literalContext float_literal() throws RecognitionException {
		Float_literalContext _localctx = new Float_literalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_float_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(369);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(373);
			_la = _input.LA(1);
			if (_la==INTEGER_LITERAL) {
				{
				setState(372);
				match(INTEGER_LITERAL);
				}
			}

			setState(375);
			match(T__1);
			setState(376);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitInteger_literal(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(378);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(381);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(mysqlParser.STRING_LITERAL, 0); }
		public TerminalNode DBL_STRING_LITERAL() { return getToken(mysqlParser.DBL_STRING_LITERAL, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==DBL_STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Byte_literalContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(mysqlParser.STRING_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Byte_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byte_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterByte_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitByte_literal(this);
		}
	}

	public final Byte_literalContext byte_literal() throws RecognitionException {
		Byte_literalContext _localctx = new Byte_literalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_byte_literal);
		try {
			setState(388);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(IDENT);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(STRING_LITERAL);
				setState(387);
				match(INTEGER_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(mysqlParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Charset_nameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode QUOTED_IDENT() { return getToken(mysqlParser.QUOTED_IDENT, 0); }
		public TerminalNode BINARY() { return getToken(mysqlParser.BINARY, 0); }
		public TerminalNode ASCII() { return getToken(mysqlParser.ASCII, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public Charset_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCharset_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCharset_name(this);
		}
	}

	public final Charset_nameContext charset_name() throws RecognitionException {
		Charset_nameContext _localctx = new Charset_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_charset_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(394);
				match(IDENT);
				}
				break;
			case STRING_LITERAL:
			case DBL_STRING_LITERAL:
				{
				setState(395);
				string_literal();
				}
				break;
			case QUOTED_IDENT:
				{
				setState(396);
				match(QUOTED_IDENT);
				}
				break;
			case BINARY:
				{
				setState(397);
				match(BINARY);
				}
				break;
			case ASCII:
				{
				setState(398);
				match(ASCII);
				}
				break;
			case DEFAULT:
				{
				setState(399);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_character_setContext extends ParserRuleContext {
		public Charset_tokenContext charset_token() {
			return getRuleContext(Charset_tokenContext.class,0);
		}
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public CollationContext collation() {
			return getRuleContext(CollationContext.class,0);
		}
		public Default_character_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_character_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDefault_character_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDefault_character_set(this);
		}
	}

	public final Default_character_setContext default_character_set() throws RecognitionException {
		Default_character_setContext _localctx = new Default_character_setContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_default_character_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(402);
				match(DEFAULT);
				}
			}

			setState(405);
			charset_token();
			setState(407);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(406);
				match(T__5);
				}
			}

			setState(409);
			charset_name();
			setState(411);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(410);
				collation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_collationContext extends ParserRuleContext {
		public CollationContext collation() {
			return getRuleContext(CollationContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public Default_collationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_collation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDefault_collation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDefault_collation(this);
		}
	}

	public final Default_collationContext default_collation() throws RecognitionException {
		Default_collationContext _localctx = new Default_collationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_default_collation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(413);
				match(DEFAULT);
				}
			}

			setState(416);
			collation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Charset_tokenContext extends ParserRuleContext {
		public TerminalNode CHARSET() { return getToken(mysqlParser.CHARSET, 0); }
		public TerminalNode CHARACTER() { return getToken(mysqlParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public TerminalNode CHAR() { return getToken(mysqlParser.CHAR, 0); }
		public Charset_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCharset_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCharset_token(this);
		}
	}

	public final Charset_tokenContext charset_token() throws RecognitionException {
		Charset_tokenContext _localctx = new Charset_tokenContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_charset_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			switch (_input.LA(1)) {
			case CHARSET:
				{
				setState(418);
				match(CHARSET);
				}
				break;
			case CHARACTER:
				{
				{
				setState(419);
				match(CHARACTER);
				setState(420);
				match(SET);
				}
				}
				break;
			case CHAR:
				{
				{
				setState(421);
				match(CHAR);
				setState(422);
				match(SET);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollationContext extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(mysqlParser.COLLATE, 0); }
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode QUOTED_IDENT() { return getToken(mysqlParser.QUOTED_IDENT, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public CollationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCollation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCollation(this);
		}
	}

	public final CollationContext collation() throws RecognitionException {
		CollationContext _localctx = new CollationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_collation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(COLLATE);
			setState(427);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(426);
				match(T__5);
				}
			}

			setState(433);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(429);
				match(IDENT);
				}
				break;
			case STRING_LITERAL:
			case DBL_STRING_LITERAL:
				{
				setState(430);
				string_literal();
				}
				break;
			case QUOTED_IDENT:
				{
				setState(431);
				match(QUOTED_IDENT);
				}
				break;
			case DEFAULT:
				{
				setState(432);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_not_existsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(mysqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(mysqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(mysqlParser.EXISTS, 0); }
		public If_not_existsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_not_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIf_not_exists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIf_not_exists(this);
		}
	}

	public final If_not_existsContext if_not_exists() throws RecognitionException {
		If_not_existsContext _localctx = new If_not_existsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_not_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(IF);
			setState(436);
			match(NOT);
			setState(437);
			match(EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_tableContext extends ParserRuleContext {
		public Alter_table_preambleContext alter_table_preamble() {
			return getRuleContext(Alter_table_preambleContext.class,0);
		}
		public Alter_specificationsContext alter_specifications() {
			return getRuleContext(Alter_specificationsContext.class,0);
		}
		public Alter_partition_specificationContext alter_partition_specification() {
			return getRuleContext(Alter_partition_specificationContext.class,0);
		}
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_table(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alter_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			alter_table_preamble();
			setState(440);
			alter_specifications();
			setState(442);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ANALYZE) | (1L << CHECK) | (1L << COALESCE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DISCARD - 65)) | (1L << (DROP - 65)) | (1L << (EXCHANGE - 65)) | (1L << (IMPORT - 65)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (OPTIMIZE - 148)) | (1L << (PARTITION - 148)) | (1L << (REBUILD - 148)) | (1L << (REMOVE - 148)) | (1L << (REORGANIZE - 148)) | (1L << (REPAIR - 148)) | (1L << (TRUNCATE - 148)) | (1L << (UPGRADE - 148)))) != 0)) {
				{
				setState(441);
				alter_partition_specification();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_preambleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(mysqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Alter_flagsContext alter_flags() {
			return getRuleContext(Alter_flagsContext.class,0);
		}
		public Alter_table_preambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_table_preamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_table_preamble(this);
		}
	}

	public final Alter_table_preambleContext alter_table_preamble() throws RecognitionException {
		Alter_table_preambleContext _localctx = new Alter_table_preambleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alter_table_preamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(ALTER);
			setState(446);
			_la = _input.LA(1);
			if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (IGNORE - 91)) | (1L << (OFFLINE - 91)) | (1L << (ONLINE - 91)))) != 0)) {
				{
				setState(445);
				alter_flags();
				}
			}

			setState(448);
			match(TABLE);
			setState(449);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_flagsContext extends ParserRuleContext {
		public TerminalNode ONLINE() { return getToken(mysqlParser.ONLINE, 0); }
		public TerminalNode OFFLINE() { return getToken(mysqlParser.OFFLINE, 0); }
		public TerminalNode IGNORE() { return getToken(mysqlParser.IGNORE, 0); }
		public Alter_flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_flags(this);
		}
	}

	public final Alter_flagsContext alter_flags() throws RecognitionException {
		Alter_flagsContext _localctx = new Alter_flagsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_alter_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (IGNORE - 91)) | (1L << (OFFLINE - 91)) | (1L << (ONLINE - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_specificationsContext extends ParserRuleContext {
		public List<Alter_specificationContext> alter_specification() {
			return getRuleContexts(Alter_specificationContext.class);
		}
		public Alter_specificationContext alter_specification(int i) {
			return getRuleContext(Alter_specificationContext.class,i);
		}
		public Alter_specificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_specifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_specifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_specifications(this);
		}
	}

	public final Alter_specificationsContext alter_specifications() throws RecognitionException {
		Alter_specificationsContext _localctx = new Alter_specificationsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_alter_specifications);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			alter_specification();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(454);
				match(T__6);
				setState(455);
				alter_specification();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_specificationContext extends ParserRuleContext {
		public Add_columnContext add_column() {
			return getRuleContext(Add_columnContext.class,0);
		}
		public Add_column_parensContext add_column_parens() {
			return getRuleContext(Add_column_parensContext.class,0);
		}
		public Change_columnContext change_column() {
			return getRuleContext(Change_columnContext.class,0);
		}
		public Drop_columnContext drop_column() {
			return getRuleContext(Drop_columnContext.class,0);
		}
		public Modify_columnContext modify_column() {
			return getRuleContext(Modify_columnContext.class,0);
		}
		public Rename_columnContext rename_column() {
			return getRuleContext(Rename_columnContext.class,0);
		}
		public Drop_keyContext drop_key() {
			return getRuleContext(Drop_keyContext.class,0);
		}
		public Drop_primary_keyContext drop_primary_key() {
			return getRuleContext(Drop_primary_keyContext.class,0);
		}
		public Alter_rename_tableContext alter_rename_table() {
			return getRuleContext(Alter_rename_tableContext.class,0);
		}
		public Convert_to_character_setContext convert_to_character_set() {
			return getRuleContext(Convert_to_character_setContext.class,0);
		}
		public Default_character_setContext default_character_set() {
			return getRuleContext(Default_character_setContext.class,0);
		}
		public List<Table_creation_optionContext> table_creation_option() {
			return getRuleContexts(Table_creation_optionContext.class);
		}
		public Table_creation_optionContext table_creation_option(int i) {
			return getRuleContext(Table_creation_optionContext.class,i);
		}
		public Ignored_alter_specificationsContext ignored_alter_specifications() {
			return getRuleContext(Ignored_alter_specificationsContext.class,0);
		}
		public Alter_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_specification(this);
		}
	}

	public final Alter_specificationContext alter_specification() throws RecognitionException {
		Alter_specificationContext _localctx = new Alter_specificationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_alter_specification);
		try {
			int _alt;
			setState(478);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				add_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				add_column_parens();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				change_column();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				drop_column();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(465);
				modify_column();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(466);
				rename_column();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(467);
				drop_key();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(468);
				drop_primary_key();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(469);
				alter_rename_table();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(470);
				convert_to_character_set();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(471);
				default_character_set();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(473); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(472);
						table_creation_option();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(475); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(477);
				ignored_alter_specifications();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_columnContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(mysqlParser.ADD, 0); }
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public Col_positionContext col_position() {
			return getRuleContext(Col_positionContext.class,0);
		}
		public Add_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAdd_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAdd_column(this);
		}
	}

	public final Add_columnContext add_column() throws RecognitionException {
		Add_columnContext _localctx = new Add_columnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_add_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(ADD);
			setState(482);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(481);
				match(COLUMN);
				}
			}

			setState(484);
			column_definition();
			setState(486);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(485);
				col_position();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_column_parensContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(mysqlParser.ADD, 0); }
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public List<Index_definitionContext> index_definition() {
			return getRuleContexts(Index_definitionContext.class);
		}
		public Index_definitionContext index_definition(int i) {
			return getRuleContext(Index_definitionContext.class,i);
		}
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public Add_column_parensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_column_parens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAdd_column_parens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAdd_column_parens(this);
		}
	}

	public final Add_column_parensContext add_column_parens() throws RecognitionException {
		Add_column_parensContext _localctx = new Add_column_parensContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_add_column_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(ADD);
			setState(490);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(489);
				match(COLUMN);
				}
			}

			setState(492);
			match(T__0);
			setState(495);
			switch (_input.LA(1)) {
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case ALWAYS:
			case ASCII:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BIT:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BYTE:
			case CHARSET:
			case CHECKSUM:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case CONNECTION:
			case COPY:
			case DATA:
			case DATE:
			case DATETIME:
			case DEFINER:
			case DELAY_KEY_WRITE:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DYNAMIC:
			case ENABLE:
			case ENGINE:
			case ENUM:
			case EXCHANGE:
			case EXCLUSIVE:
			case FIRST:
			case FIXED:
			case FULL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case HASH:
			case IMPORT:
			case INPLACE:
			case INSERT_METHOD:
			case INSTANT:
			case INVISIBLE:
			case INVOKER:
			case JSON:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LINESTRING:
			case LIST:
			case MAX_ROWS:
			case MEMORY:
			case MERGE:
			case MIN_ROWS:
			case MODIFY:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case NAME:
			case NATIONAL:
			case NCHAR:
			case NO:
			case NONE:
			case NOW:
			case NVARCHAR:
			case OFFLINE:
			case ONLINE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case POINT:
			case POLYGON:
			case REBUILD:
			case REDUNDANT:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case ROW_FORMAT:
			case SECURITY:
			case SERIAL:
			case SHARED:
			case SIGNED:
			case SIMPLE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case TABLESPACE:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TRUNCATE:
			case UNDEFINED:
			case UNICODE:
			case UPGRADE:
			case VALIDATION:
			case VIEW:
			case VISIBLE:
			case WITHOUT:
			case YEAR:
			case DBL_STRING_LITERAL:
			case INTEGER_LITERAL:
			case IDENT:
			case QUOTED_IDENT:
				{
				setState(493);
				column_definition();
				}
				break;
			case CHECK:
			case CONSTRAINT:
			case FOREIGN:
			case FULLTEXT:
			case INDEX:
			case KEY:
			case PRIMARY:
			case SPATIAL:
			case UNIQUE:
				{
				setState(494);
				index_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(497);
				match(T__6);
				setState(500);
				switch (_input.LA(1)) {
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case ALWAYS:
				case ASCII:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BIT:
				case BOOL:
				case BOOLEAN:
				case BTREE:
				case BYTE:
				case CHARSET:
				case CHECKSUM:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case CONNECTION:
				case COPY:
				case DATA:
				case DATE:
				case DATETIME:
				case DEFINER:
				case DELAY_KEY_WRITE:
				case DIRECTORY:
				case DISABLE:
				case DISCARD:
				case DISK:
				case DYNAMIC:
				case ENABLE:
				case ENGINE:
				case ENUM:
				case EXCHANGE:
				case EXCLUSIVE:
				case FIRST:
				case FIXED:
				case FULL:
				case GEOMETRY:
				case GEOMETRYCOLLECTION:
				case HASH:
				case IMPORT:
				case INPLACE:
				case INSERT_METHOD:
				case INSTANT:
				case INVISIBLE:
				case INVOKER:
				case JSON:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LINESTRING:
				case LIST:
				case MAX_ROWS:
				case MEMORY:
				case MERGE:
				case MIN_ROWS:
				case MODIFY:
				case MULTILINESTRING:
				case MULTIPOINT:
				case MULTIPOLYGON:
				case NAME:
				case NATIONAL:
				case NCHAR:
				case NO:
				case NONE:
				case NOW:
				case NVARCHAR:
				case OFFLINE:
				case ONLINE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PARTITIONS:
				case PASSWORD:
				case POINT:
				case POLYGON:
				case REBUILD:
				case REDUNDANT:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case ROW_FORMAT:
				case SECURITY:
				case SERIAL:
				case SHARED:
				case SIGNED:
				case SIMPLE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUBPARTITIONS:
				case TABLESPACE:
				case TEMPORARY:
				case TEMPTABLE:
				case TEXT:
				case TIME:
				case TIMESTAMP:
				case TRUNCATE:
				case UNDEFINED:
				case UNICODE:
				case UPGRADE:
				case VALIDATION:
				case VIEW:
				case VISIBLE:
				case WITHOUT:
				case YEAR:
				case DBL_STRING_LITERAL:
				case INTEGER_LITERAL:
				case IDENT:
				case QUOTED_IDENT:
					{
					setState(498);
					column_definition();
					}
					break;
				case CHECK:
				case CONSTRAINT:
				case FOREIGN:
				case FULLTEXT:
				case INDEX:
				case KEY:
				case PRIMARY:
				case SPATIAL:
				case UNIQUE:
					{
					setState(499);
					index_definition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(507);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Change_columnContext extends ParserRuleContext {
		public TerminalNode CHANGE() { return getToken(mysqlParser.CHANGE, 0); }
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public Col_positionContext col_position() {
			return getRuleContext(Col_positionContext.class,0);
		}
		public Change_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterChange_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitChange_column(this);
		}
	}

	public final Change_columnContext change_column() throws RecognitionException {
		Change_columnContext _localctx = new Change_columnContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_change_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(CHANGE);
			setState(511);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(510);
				match(COLUMN);
				}
			}

			setState(513);
			full_column_name();
			setState(514);
			column_definition();
			setState(516);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(515);
				col_position();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_columnContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public Full_column_nameContext full_column_name() {
			return getRuleContext(Full_column_nameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public TerminalNode CASCADE() { return getToken(mysqlParser.CASCADE, 0); }
		public Drop_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_column(this);
		}
	}

	public final Drop_columnContext drop_column() throws RecognitionException {
		Drop_columnContext _localctx = new Drop_columnContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_drop_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(DROP);
			setState(520);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(519);
				match(COLUMN);
				}
			}

			setState(522);
			full_column_name();
			setState(524);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(523);
				match(CASCADE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modify_columnContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(mysqlParser.MODIFY, 0); }
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public Col_positionContext col_position() {
			return getRuleContext(Col_positionContext.class,0);
		}
		public Modify_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modify_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterModify_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitModify_column(this);
		}
	}

	public final Modify_columnContext modify_column() throws RecognitionException {
		Modify_columnContext _localctx = new Modify_columnContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_modify_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(MODIFY);
			setState(528);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(527);
				match(COLUMN);
				}
			}

			setState(530);
			column_definition();
			setState(532);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(531);
				col_position();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_keyContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(mysqlParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public TerminalNode FOREIGN() { return getToken(mysqlParser.FOREIGN, 0); }
		public Drop_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_key(this);
		}
	}

	public final Drop_keyContext drop_key() throws RecognitionException {
		Drop_keyContext _localctx = new Drop_keyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_drop_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(DROP);
			setState(536);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(535);
				match(FOREIGN);
				}
			}

			setState(538);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(539);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_primary_keyContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public TerminalNode PRIMARY() { return getToken(mysqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Drop_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_primary_key(this);
		}
	}

	public final Drop_primary_keyContext drop_primary_key() throws RecognitionException {
		Drop_primary_keyContext _localctx = new Drop_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_drop_primary_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(DROP);
			setState(542);
			match(PRIMARY);
			setState(543);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_rename_tableContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(mysqlParser.RENAME, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TO() { return getToken(mysqlParser.TO, 0); }
		public TerminalNode AS() { return getToken(mysqlParser.AS, 0); }
		public Alter_rename_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_rename_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_rename_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_rename_table(this);
		}
	}

	public final Alter_rename_tableContext alter_rename_table() throws RecognitionException {
		Alter_rename_tableContext _localctx = new Alter_rename_tableContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_alter_rename_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(RENAME);
			setState(547);
			_la = _input.LA(1);
			if (_la==AS || _la==TO) {
				{
				setState(546);
				_la = _input.LA(1);
				if ( !(_la==AS || _la==TO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(549);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Convert_to_character_setContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(mysqlParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(mysqlParser.TO, 0); }
		public Charset_tokenContext charset_token() {
			return getRuleContext(Charset_tokenContext.class,0);
		}
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public CollationContext collation() {
			return getRuleContext(CollationContext.class,0);
		}
		public Convert_to_character_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convert_to_character_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterConvert_to_character_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitConvert_to_character_set(this);
		}
	}

	public final Convert_to_character_setContext convert_to_character_set() throws RecognitionException {
		Convert_to_character_setContext _localctx = new Convert_to_character_setContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_convert_to_character_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(CONVERT);
			setState(552);
			match(TO);
			setState(553);
			charset_token();
			setState(554);
			charset_name();
			setState(556);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(555);
				collation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_columnContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(mysqlParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode TO() { return getToken(mysqlParser.TO, 0); }
		public Rename_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterRename_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitRename_column(this);
		}
	}

	public final Rename_columnContext rename_column() throws RecognitionException {
		Rename_columnContext _localctx = new Rename_columnContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_rename_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(RENAME);
			setState(559);
			match(COLUMN);
			setState(560);
			name();
			setState(561);
			match(TO);
			setState(562);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_partition_specificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(mysqlParser.ADD, 0); }
		public TerminalNode PARTITION() { return getToken(mysqlParser.PARTITION, 0); }
		public Skip_parensContext skip_parens() {
			return getRuleContext(Skip_parensContext.class,0);
		}
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode TRUNCATE() { return getToken(mysqlParser.TRUNCATE, 0); }
		public TerminalNode DISCARD() { return getToken(mysqlParser.DISCARD, 0); }
		public TerminalNode TABLESPACE() { return getToken(mysqlParser.TABLESPACE, 0); }
		public TerminalNode IMPORT() { return getToken(mysqlParser.IMPORT, 0); }
		public TerminalNode COALESCE() { return getToken(mysqlParser.COALESCE, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public TerminalNode REORGANIZE() { return getToken(mysqlParser.REORGANIZE, 0); }
		public TerminalNode INTO() { return getToken(mysqlParser.INTO, 0); }
		public TerminalNode EXCHANGE() { return getToken(mysqlParser.EXCHANGE, 0); }
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public List<TerminalNode> WITH() { return getTokens(mysqlParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(mysqlParser.WITH, i);
		}
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode VALIDATION() { return getToken(mysqlParser.VALIDATION, 0); }
		public TerminalNode WITHOUT() { return getToken(mysqlParser.WITHOUT, 0); }
		public TerminalNode ANALYZE() { return getToken(mysqlParser.ANALYZE, 0); }
		public TerminalNode CHECK() { return getToken(mysqlParser.CHECK, 0); }
		public TerminalNode OPTIMIZE() { return getToken(mysqlParser.OPTIMIZE, 0); }
		public TerminalNode REBUILD() { return getToken(mysqlParser.REBUILD, 0); }
		public TerminalNode REPAIR() { return getToken(mysqlParser.REPAIR, 0); }
		public TerminalNode REMOVE() { return getToken(mysqlParser.REMOVE, 0); }
		public TerminalNode PARTITIONING() { return getToken(mysqlParser.PARTITIONING, 0); }
		public TerminalNode UPGRADE() { return getToken(mysqlParser.UPGRADE, 0); }
		public Partition_byContext partition_by() {
			return getRuleContext(Partition_byContext.class,0);
		}
		public Alter_partition_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_partition_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_partition_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_partition_specification(this);
		}
	}

	public final Alter_partition_specificationContext alter_partition_specification() throws RecognitionException {
		Alter_partition_specificationContext _localctx = new Alter_partition_specificationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_alter_partition_specification);
		int _la;
		try {
			setState(624);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				match(ADD);
				setState(565);
				match(PARTITION);
				setState(566);
				skip_parens();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				match(DROP);
				setState(568);
				match(PARTITION);
				setState(569);
				partition_names();
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				match(TRUNCATE);
				setState(571);
				match(PARTITION);
				setState(572);
				partition_names();
				}
				break;
			case DISCARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				match(DISCARD);
				setState(574);
				match(PARTITION);
				setState(575);
				partition_names();
				setState(576);
				match(TABLESPACE);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 5);
				{
				setState(578);
				match(IMPORT);
				setState(579);
				match(PARTITION);
				setState(580);
				partition_names();
				setState(581);
				match(TABLESPACE);
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 6);
				{
				setState(583);
				match(COALESCE);
				setState(584);
				match(PARTITION);
				setState(585);
				match(INTEGER_LITERAL);
				}
				break;
			case REORGANIZE:
				enterOuterAlt(_localctx, 7);
				{
				setState(586);
				match(REORGANIZE);
				setState(587);
				match(PARTITION);
				setState(592);
				_la = _input.LA(1);
				if (_la==IDENT || _la==QUOTED_IDENT) {
					{
					setState(588);
					partition_names();
					setState(589);
					match(INTO);
					setState(590);
					skip_parens();
					}
				}

				}
				break;
			case EXCHANGE:
				enterOuterAlt(_localctx, 8);
				{
				setState(594);
				match(EXCHANGE);
				setState(595);
				match(PARTITION);
				setState(596);
				match(IDENT);
				setState(597);
				match(WITH);
				setState(598);
				match(TABLE);
				setState(599);
				table_name();
				setState(602);
				_la = _input.LA(1);
				if (_la==WITH || _la==WITHOUT) {
					{
					setState(600);
					_la = _input.LA(1);
					if ( !(_la==WITH || _la==WITHOUT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(601);
					match(VALIDATION);
					}
				}

				}
				break;
			case ANALYZE:
				enterOuterAlt(_localctx, 9);
				{
				setState(604);
				match(ANALYZE);
				setState(605);
				match(PARTITION);
				setState(606);
				partition_names();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 10);
				{
				setState(607);
				match(CHECK);
				setState(608);
				match(PARTITION);
				setState(609);
				partition_names();
				}
				break;
			case OPTIMIZE:
				enterOuterAlt(_localctx, 11);
				{
				setState(610);
				match(OPTIMIZE);
				setState(611);
				match(PARTITION);
				setState(612);
				partition_names();
				}
				break;
			case REBUILD:
				enterOuterAlt(_localctx, 12);
				{
				setState(613);
				match(REBUILD);
				setState(614);
				match(PARTITION);
				setState(615);
				partition_names();
				}
				break;
			case REPAIR:
				enterOuterAlt(_localctx, 13);
				{
				setState(616);
				match(REPAIR);
				setState(617);
				match(PARTITION);
				setState(618);
				partition_names();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 14);
				{
				setState(619);
				match(REMOVE);
				setState(620);
				match(PARTITIONING);
				}
				break;
			case UPGRADE:
				enterOuterAlt(_localctx, 15);
				{
				setState(621);
				match(UPGRADE);
				setState(622);
				match(PARTITIONING);
				}
				break;
			case PARTITION:
				enterOuterAlt(_localctx, 16);
				{
				setState(623);
				partition_by();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ignored_alter_specificationsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(mysqlParser.ADD, 0); }
		public Index_definitionContext index_definition() {
			return getRuleContext(Index_definitionContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(mysqlParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(mysqlParser.INDEX, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode VISIBLE() { return getToken(mysqlParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(mysqlParser.INVISIBLE, 0); }
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode DISABLE() { return getToken(mysqlParser.DISABLE, 0); }
		public TerminalNode KEYS() { return getToken(mysqlParser.KEYS, 0); }
		public TerminalNode ENABLE() { return getToken(mysqlParser.ENABLE, 0); }
		public TerminalNode ORDER() { return getToken(mysqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(mysqlParser.BY, 0); }
		public List<Alter_orderingContext> alter_ordering() {
			return getRuleContexts(Alter_orderingContext.class);
		}
		public Alter_orderingContext alter_ordering(int i) {
			return getRuleContext(Alter_orderingContext.class,i);
		}
		public TerminalNode FORCE() { return getToken(mysqlParser.FORCE, 0); }
		public TerminalNode DISCARD() { return getToken(mysqlParser.DISCARD, 0); }
		public TerminalNode TABLESPACE() { return getToken(mysqlParser.TABLESPACE, 0); }
		public TerminalNode IMPORT() { return getToken(mysqlParser.IMPORT, 0); }
		public TerminalNode ALGORITHM() { return getToken(mysqlParser.ALGORITHM, 0); }
		public Algorithm_typeContext algorithm_type() {
			return getRuleContext(Algorithm_typeContext.class,0);
		}
		public TerminalNode LOCK() { return getToken(mysqlParser.LOCK, 0); }
		public Lock_typeContext lock_type() {
			return getRuleContext(Lock_typeContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(mysqlParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(mysqlParser.TO, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Ignored_alter_specificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignored_alter_specifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIgnored_alter_specifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIgnored_alter_specifications(this);
		}
	}

	public final Ignored_alter_specificationsContext ignored_alter_specifications() throws RecognitionException {
		Ignored_alter_specificationsContext _localctx = new Ignored_alter_specificationsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ignored_alter_specifications);
		int _la;
		try {
			int _alt;
			setState(683);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(ADD);
				setState(627);
				index_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				match(ALTER);
				setState(629);
				match(INDEX);
				setState(630);
				name();
				setState(631);
				_la = _input.LA(1);
				if ( !(_la==INVISIBLE || _la==VISIBLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				match(ALTER);
				setState(635);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(634);
					match(COLUMN);
					}
				}

				setState(637);
				name();
				setState(643);
				switch (_input.LA(1)) {
				case SET:
					{
					{
					setState(638);
					match(SET);
					setState(639);
					match(DEFAULT);
					setState(640);
					literal();
					}
					}
					break;
				case DROP:
					{
					{
					setState(641);
					match(DROP);
					setState(642);
					match(DEFAULT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(645);
				match(DROP);
				setState(646);
				match(INDEX);
				setState(647);
				index_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(648);
				match(DISABLE);
				setState(649);
				match(KEYS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(650);
				match(ENABLE);
				setState(651);
				match(KEYS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(652);
				match(ORDER);
				setState(653);
				match(BY);
				setState(654);
				alter_ordering();
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(655);
						match(T__6);
						setState(656);
						alter_ordering();
						}
						} 
					}
					setState(661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(662);
				match(FORCE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(663);
				match(DISCARD);
				setState(664);
				match(TABLESPACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(665);
				match(IMPORT);
				setState(666);
				match(TABLESPACE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(667);
				match(ALGORITHM);
				setState(669);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(668);
					match(T__5);
					}
				}

				setState(671);
				algorithm_type();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(672);
				match(LOCK);
				setState(674);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(673);
					match(T__5);
					}
				}

				setState(676);
				lock_type();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(677);
				match(RENAME);
				setState(678);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(679);
				name();
				setState(680);
				match(TO);
				setState(681);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Algorithm_typeContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode INPLACE() { return getToken(mysqlParser.INPLACE, 0); }
		public TerminalNode COPY() { return getToken(mysqlParser.COPY, 0); }
		public TerminalNode INSTANT() { return getToken(mysqlParser.INSTANT, 0); }
		public Algorithm_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithm_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlgorithm_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlgorithm_type(this);
		}
	}

	public final Algorithm_typeContext algorithm_type() throws RecognitionException {
		Algorithm_typeContext _localctx = new Algorithm_typeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_algorithm_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (COPY - 49)) | (1L << (DEFAULT - 49)) | (1L << (INPLACE - 49)) | (1L << (INSTANT - 49)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lock_typeContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode NONE() { return getToken(mysqlParser.NONE, 0); }
		public TerminalNode SHARED() { return getToken(mysqlParser.SHARED, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(mysqlParser.EXCLUSIVE, 0); }
		public Lock_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lock_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterLock_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitLock_type(this);
		}
	}

	public final Lock_typeContext lock_type() throws RecognitionException {
		Lock_typeContext _localctx = new Lock_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_lock_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==EXCLUSIVE || _la==NONE || _la==SHARED) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_namesContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Partition_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPartition_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPartition_names(this);
		}
	}

	public final Partition_namesContext partition_names() throws RecognitionException {
		Partition_namesContext _localctx = new Partition_namesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			id();
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(690);
				match(T__6);
				setState(691);
				id();
				}
				}
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_orderingContext extends ParserRuleContext {
		public Alter_ordering_columnContext alter_ordering_column() {
			return getRuleContext(Alter_ordering_columnContext.class,0);
		}
		public TerminalNode ASC() { return getToken(mysqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(mysqlParser.DESC, 0); }
		public Alter_orderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_ordering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_ordering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_ordering(this);
		}
	}

	public final Alter_orderingContext alter_ordering() throws RecognitionException {
		Alter_orderingContext _localctx = new Alter_orderingContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alter_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			alter_ordering_column();
			setState(699);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(698);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_ordering_columnContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Alter_ordering_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_ordering_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_ordering_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_ordering_column(this);
		}
	}

	public final Alter_ordering_columnContext alter_ordering_column() throws RecognitionException {
		Alter_ordering_columnContext _localctx = new Alter_ordering_columnContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alter_ordering_column);
		try {
			setState(712);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				name();
				setState(702);
				match(T__1);
				setState(703);
				name();
				setState(704);
				match(T__1);
				setState(705);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				name();
				setState(708);
				match(T__1);
				setState(709);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_column_nameContext extends ParserRuleContext {
		public NameContext col_name;
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Full_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterFull_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitFull_column_name(this);
		}
	}

	public final Full_column_nameContext full_column_name() throws RecognitionException {
		Full_column_nameContext _localctx = new Full_column_nameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_full_column_name);
		try {
			setState(725);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				((Full_column_nameContext)_localctx).col_name = name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				name();
				setState(716);
				match(T__1);
				setState(717);
				((Full_column_nameContext)_localctx).col_name = name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				name();
				setState(720);
				match(T__1);
				setState(721);
				name();
				setState(722);
				match(T__1);
				setState(723);
				((Full_column_nameContext)_localctx).col_name = name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public NameContext col_name;
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitColumn_definition(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(727);
				((Column_definitionContext)_localctx).col_name = name();
				}
				break;
			case 2:
				{
				setState(728);
				name();
				setState(729);
				match(T__1);
				setState(730);
				((Column_definitionContext)_localctx).col_name = name();
				}
				break;
			case 3:
				{
				setState(732);
				name();
				setState(733);
				match(T__1);
				setState(734);
				name();
				setState(735);
				match(T__1);
				setState(736);
				((Column_definitionContext)_localctx).col_name = name();
				}
				break;
			}
			setState(740);
			data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_positionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(mysqlParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(mysqlParser.AFTER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Col_positionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCol_position(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCol_position(this);
		}
	}

	public final Col_positionContext col_position() throws RecognitionException {
		Col_positionContext _localctx = new Col_positionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_col_position);
		try {
			setState(745);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(743);
				match(AFTER);
				setState(744);
				name();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public Generic_typeContext generic_type() {
			return getRuleContext(Generic_typeContext.class,0);
		}
		public Signed_typeContext signed_type() {
			return getRuleContext(Signed_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Enumerated_typeContext enumerated_type() {
			return getRuleContext(Enumerated_typeContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_data_type);
		try {
			setState(751);
			switch (_input.LA(1)) {
			case BINARY:
			case BIT:
			case BLOB:
			case BOOL:
			case BOOLEAN:
			case DATE:
			case DATETIME:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case JSON:
			case LINESTRING:
			case LONGBLOB:
			case MEDIUMBLOB:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case POINT:
			case POLYGON:
			case TIME:
			case TIMESTAMP:
			case TINYBLOB:
			case VARBINARY:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				generic_type();
				}
				break;
			case BIGINT:
			case DECIMAL:
			case DOUBLE:
			case FIXED:
			case FLOAT:
			case FLOAT4:
			case FLOAT8:
			case INT:
			case INT1:
			case INT2:
			case INT3:
			case INT4:
			case INT8:
			case INTEGER:
			case MEDIUMINT:
			case MIDDLEINT:
			case NUMERIC:
			case REAL:
			case SERIAL:
			case SMALLINT:
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				signed_type();
				}
				break;
			case CHAR:
			case CHARACTER:
			case LONG:
			case LONGTEXT:
			case MEDIUMTEXT:
			case NATIONAL:
			case NCHAR:
			case NVARCHAR:
			case TEXT:
			case TINYTEXT:
			case VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				string_type();
				}
				break;
			case ENUM:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(750);
				enumerated_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_typeContext extends ParserRuleContext {
		public Token col_type;
		public TerminalNode BIT() { return getToken(mysqlParser.BIT, 0); }
		public TerminalNode BINARY() { return getToken(mysqlParser.BINARY, 0); }
		public TerminalNode BLOB() { return getToken(mysqlParser.BLOB, 0); }
		public TerminalNode YEAR() { return getToken(mysqlParser.YEAR, 0); }
		public TerminalNode TIME() { return getToken(mysqlParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(mysqlParser.TIMESTAMP, 0); }
		public TerminalNode DATETIME() { return getToken(mysqlParser.DATETIME, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public List<Column_optionsContext> column_options() {
			return getRuleContexts(Column_optionsContext.class);
		}
		public Column_optionsContext column_options(int i) {
			return getRuleContext(Column_optionsContext.class,i);
		}
		public TerminalNode DATE() { return getToken(mysqlParser.DATE, 0); }
		public TerminalNode TINYBLOB() { return getToken(mysqlParser.TINYBLOB, 0); }
		public TerminalNode MEDIUMBLOB() { return getToken(mysqlParser.MEDIUMBLOB, 0); }
		public TerminalNode LONGBLOB() { return getToken(mysqlParser.LONGBLOB, 0); }
		public TerminalNode BOOLEAN() { return getToken(mysqlParser.BOOLEAN, 0); }
		public TerminalNode BOOL() { return getToken(mysqlParser.BOOL, 0); }
		public TerminalNode GEOMETRY() { return getToken(mysqlParser.GEOMETRY, 0); }
		public TerminalNode GEOMETRYCOLLECTION() { return getToken(mysqlParser.GEOMETRYCOLLECTION, 0); }
		public TerminalNode LINESTRING() { return getToken(mysqlParser.LINESTRING, 0); }
		public TerminalNode MULTILINESTRING() { return getToken(mysqlParser.MULTILINESTRING, 0); }
		public TerminalNode MULTIPOINT() { return getToken(mysqlParser.MULTIPOINT, 0); }
		public TerminalNode MULTIPOLYGON() { return getToken(mysqlParser.MULTIPOLYGON, 0); }
		public TerminalNode POINT() { return getToken(mysqlParser.POINT, 0); }
		public TerminalNode POLYGON() { return getToken(mysqlParser.POLYGON, 0); }
		public TerminalNode JSON() { return getToken(mysqlParser.JSON, 0); }
		public TerminalNode VARBINARY() { return getToken(mysqlParser.VARBINARY, 0); }
		public Generic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterGeneric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitGeneric_type(this);
		}
	}

	public final Generic_typeContext generic_type() throws RecognitionException {
		Generic_typeContext _localctx = new Generic_typeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_generic_type);
		int _la;
		try {
			int _alt;
			setState(792);
			switch (_input.LA(1)) {
			case BINARY:
			case BIT:
			case BLOB:
			case DATETIME:
			case TIME:
			case TIMESTAMP:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				((Generic_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BINARY) | (1L << BIT) | (1L << BLOB) | (1L << DATETIME))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (TIME - 196)) | (1L << (TIMESTAMP - 196)) | (1L << (YEAR - 196)))) != 0)) ) {
					((Generic_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(755);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(754);
					length();
					}
				}

				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(757);
						column_options();
						}
						} 
					}
					setState(762);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case BOOL:
			case BOOLEAN:
			case DATE:
			case LONGBLOB:
			case MEDIUMBLOB:
			case TINYBLOB:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				((Generic_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BOOLEAN) | (1L << DATE))) != 0) || _la==LONGBLOB || _la==MEDIUMBLOB || _la==TINYBLOB) ) {
					((Generic_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(764);
						column_options();
						}
						} 
					}
					setState(769);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				}
				break;
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case LINESTRING:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case POINT:
			case POLYGON:
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				((Generic_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (GEOMETRY - 87)) | (1L << (GEOMETRYCOLLECTION - 87)) | (1L << (LINESTRING - 87)) | (1L << (MULTILINESTRING - 87)) | (1L << (MULTIPOINT - 87)) | (1L << (MULTIPOLYGON - 87)))) != 0) || _la==POINT || _la==POLYGON) ) {
					((Generic_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(771);
						column_options();
						}
						} 
					}
					setState(776);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 4);
				{
				setState(777);
				((Generic_typeContext)_localctx).col_type = match(JSON);
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(778);
						column_options();
						}
						} 
					}
					setState(783);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
				break;
			case VARBINARY:
				enterOuterAlt(_localctx, 5);
				{
				setState(784);
				((Generic_typeContext)_localctx).col_type = match(VARBINARY);
				setState(785);
				length();
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(786);
						column_options();
						}
						} 
					}
					setState(791);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_typeContext extends ParserRuleContext {
		public Token col_type;
		public TerminalNode TINYINT() { return getToken(mysqlParser.TINYINT, 0); }
		public TerminalNode INT1() { return getToken(mysqlParser.INT1, 0); }
		public TerminalNode SMALLINT() { return getToken(mysqlParser.SMALLINT, 0); }
		public TerminalNode INT2() { return getToken(mysqlParser.INT2, 0); }
		public TerminalNode MEDIUMINT() { return getToken(mysqlParser.MEDIUMINT, 0); }
		public TerminalNode INT3() { return getToken(mysqlParser.INT3, 0); }
		public TerminalNode INT() { return getToken(mysqlParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(mysqlParser.INTEGER, 0); }
		public TerminalNode INT4() { return getToken(mysqlParser.INT4, 0); }
		public TerminalNode BIGINT() { return getToken(mysqlParser.BIGINT, 0); }
		public TerminalNode INT8() { return getToken(mysqlParser.INT8, 0); }
		public TerminalNode FIXED() { return getToken(mysqlParser.FIXED, 0); }
		public TerminalNode FLOAT4() { return getToken(mysqlParser.FLOAT4, 0); }
		public TerminalNode FLOAT8() { return getToken(mysqlParser.FLOAT8, 0); }
		public TerminalNode MIDDLEINT() { return getToken(mysqlParser.MIDDLEINT, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public List<Int_flagsContext> int_flags() {
			return getRuleContexts(Int_flagsContext.class);
		}
		public Int_flagsContext int_flags(int i) {
			return getRuleContext(Int_flagsContext.class,i);
		}
		public List<Column_optionsContext> column_options() {
			return getRuleContexts(Column_optionsContext.class);
		}
		public Column_optionsContext column_options(int i) {
			return getRuleContext(Column_optionsContext.class,i);
		}
		public TerminalNode REAL() { return getToken(mysqlParser.REAL, 0); }
		public TerminalNode FLOAT() { return getToken(mysqlParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(mysqlParser.DECIMAL, 0); }
		public TerminalNode NUMERIC() { return getToken(mysqlParser.NUMERIC, 0); }
		public Decimal_lengthContext decimal_length() {
			return getRuleContext(Decimal_lengthContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(mysqlParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(mysqlParser.PRECISION, 0); }
		public TerminalNode SERIAL() { return getToken(mysqlParser.SERIAL, 0); }
		public Signed_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterSigned_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitSigned_type(this);
		}
	}

	public final Signed_typeContext signed_type() throws RecognitionException {
		Signed_typeContext _localctx = new Signed_typeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_signed_type);
		int _la;
		try {
			int _alt;
			setState(852);
			switch (_input.LA(1)) {
			case BIGINT:
			case FIXED:
			case FLOAT4:
			case FLOAT8:
			case INT:
			case INT1:
			case INT2:
			case INT3:
			case INT4:
			case INT8:
			case INTEGER:
			case MEDIUMINT:
			case MIDDLEINT:
			case SMALLINT:
			case TINYINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				((Signed_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BIGINT || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (FIXED - 78)) | (1L << (FLOAT4 - 78)) | (1L << (FLOAT8 - 78)) | (1L << (INT - 78)) | (1L << (INT1 - 78)) | (1L << (INT2 - 78)) | (1L << (INT3 - 78)) | (1L << (INT4 - 78)) | (1L << (INT8 - 78)) | (1L << (INTEGER - 78)) | (1L << (MEDIUMINT - 78)) | (1L << (MIDDLEINT - 78)))) != 0) || _la==SMALLINT || _la==TINYINT) ) {
					((Signed_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(796);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(795);
					length();
					}
				}

				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (SIGNED - 179)) | (1L << (UNSIGNED - 179)) | (1L << (ZEROFILL - 179)))) != 0)) {
					{
					{
					setState(798);
					int_flags();
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(804);
						column_options();
						}
						} 
					}
					setState(809);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				}
				break;
			case DECIMAL:
			case FLOAT:
			case NUMERIC:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				((Signed_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==FLOAT || _la==NUMERIC || _la==REAL) ) {
					((Signed_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(812);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(811);
					decimal_length();
					}
				}

				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (SIGNED - 179)) | (1L << (UNSIGNED - 179)) | (1L << (ZEROFILL - 179)))) != 0)) {
					{
					{
					setState(814);
					int_flags();
					}
					}
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(820);
						column_options();
						}
						} 
					}
					setState(825);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(826);
				((Signed_typeContext)_localctx).col_type = match(DOUBLE);
				setState(828);
				_la = _input.LA(1);
				if (_la==PRECISION) {
					{
					setState(827);
					match(PRECISION);
					}
				}

				setState(831);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(830);
					decimal_length();
					}
				}

				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (SIGNED - 179)) | (1L << (UNSIGNED - 179)) | (1L << (ZEROFILL - 179)))) != 0)) {
					{
					{
					setState(833);
					int_flags();
					}
					}
					setState(838);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(839);
						column_options();
						}
						} 
					}
					setState(844);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				}
				break;
			case SERIAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(845);
				((Signed_typeContext)_localctx).col_type = match(SERIAL);
				setState(849);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(846);
						column_options();
						}
						} 
					}
					setState(851);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_typeContext extends ParserRuleContext {
		public Boolean utf8 =  false;
		public Token col_type;
		public TerminalNode CHAR() { return getToken(mysqlParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(mysqlParser.CHARACTER, 0); }
		public TerminalNode VARCHAR() { return getToken(mysqlParser.VARCHAR, 0); }
		public TerminalNode NATIONAL() { return getToken(mysqlParser.NATIONAL, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public List<Column_optionsContext> column_options() {
			return getRuleContexts(Column_optionsContext.class);
		}
		public Column_optionsContext column_options(int i) {
			return getRuleContext(Column_optionsContext.class,i);
		}
		public List<TerminalNode> BYTE() { return getTokens(mysqlParser.BYTE); }
		public TerminalNode BYTE(int i) {
			return getToken(mysqlParser.BYTE, i);
		}
		public List<TerminalNode> UNICODE() { return getTokens(mysqlParser.UNICODE); }
		public TerminalNode UNICODE(int i) {
			return getToken(mysqlParser.UNICODE, i);
		}
		public TerminalNode VARYING() { return getToken(mysqlParser.VARYING, 0); }
		public TerminalNode NCHAR() { return getToken(mysqlParser.NCHAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(mysqlParser.NVARCHAR, 0); }
		public TerminalNode TINYTEXT() { return getToken(mysqlParser.TINYTEXT, 0); }
		public TerminalNode MEDIUMTEXT() { return getToken(mysqlParser.MEDIUMTEXT, 0); }
		public TerminalNode LONGTEXT() { return getToken(mysqlParser.LONGTEXT, 0); }
		public TerminalNode TEXT() { return getToken(mysqlParser.TEXT, 0); }
		public Long_flagContext long_flag() {
			return getRuleContext(Long_flagContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(mysqlParser.BINARY, 0); }
		public TerminalNode VARBINARY() { return getToken(mysqlParser.VARBINARY, 0); }
		public TerminalNode LONG() { return getToken(mysqlParser.LONG, 0); }
		public String_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterString_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitString_type(this);
		}
	}

	public final String_typeContext string_type() throws RecognitionException {
		String_typeContext _localctx = new String_typeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_string_type);
		int _la;
		try {
			int _alt;
			setState(955);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				_la = _input.LA(1);
				if (_la==NATIONAL) {
					{
					setState(854);
					match(NATIONAL);
					((String_typeContext)_localctx).utf8 = true;
					}
				}

				setState(858);
				((String_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER || _la==VARCHAR) ) {
					((String_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(860);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(859);
					length();
					}
				}

				setState(867);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(865);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(862);
							column_options();
							}
							break;
						case BYTE:
							{
							setState(863);
							match(BYTE);
							}
							break;
						case UNICODE:
							{
							setState(864);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(869);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				_la = _input.LA(1);
				if (_la==NATIONAL) {
					{
					setState(870);
					match(NATIONAL);
					((String_typeContext)_localctx).utf8 = true;
					}
				}

				setState(874);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(875);
				((String_typeContext)_localctx).col_type = match(VARYING);
				setState(876);
				length();
				setState(882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(880);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(877);
							column_options();
							}
							break;
						case BYTE:
							{
							setState(878);
							match(BYTE);
							}
							break;
						case UNICODE:
							{
							setState(879);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(884);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(885);
				((String_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NCHAR || _la==NVARCHAR) ) {
					((String_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(887);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(886);
					length();
					}
				}

				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(889);
						column_options();
						}
						} 
					}
					setState(894);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				((String_typeContext)_localctx).utf8 = true;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(896);
				match(NCHAR);
				setState(897);
				((String_typeContext)_localctx).col_type = match(VARCHAR);
				setState(899);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(898);
					length();
					}
				}

				setState(904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(901);
						column_options();
						}
						} 
					}
					setState(906);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				((String_typeContext)_localctx).utf8 = true;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(908);
				((String_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LONGTEXT || _la==MEDIUMTEXT || _la==TINYTEXT) ) {
					((String_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(912);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(909);
							column_options();
							}
							break;
						case BYTE:
							{
							setState(910);
							match(BYTE);
							}
							break;
						case UNICODE:
							{
							setState(911);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(916);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(917);
				((String_typeContext)_localctx).col_type = match(TEXT);
				setState(919);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(918);
					length();
					}
				}

				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(924);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(921);
							column_options();
							}
							break;
						case BYTE:
							{
							setState(922);
							match(BYTE);
							}
							break;
						case UNICODE:
							{
							setState(923);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(928);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(929);
				long_flag();
				setState(930);
				((String_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BINARY || _la==VARCHAR) ) {
					((String_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(933);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(931);
							column_options();
							}
							break;
						case UNICODE:
							{
							setState(932);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(937);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(938);
				long_flag();
				setState(939);
				((String_typeContext)_localctx).col_type = match(VARBINARY);
				setState(943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(940);
						column_options();
						}
						} 
					}
					setState(945);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(946);
				((String_typeContext)_localctx).col_type = match(LONG);
				setState(952);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(950);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(947);
							column_options();
							}
							break;
						case BYTE:
							{
							setState(948);
							match(BYTE);
							}
							break;
						case UNICODE:
							{
							setState(949);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(954);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Long_flagContext extends ParserRuleContext {
		public TerminalNode LONG() { return getToken(mysqlParser.LONG, 0); }
		public Long_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterLong_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitLong_flag(this);
		}
	}

	public final Long_flagContext long_flag() throws RecognitionException {
		Long_flagContext _localctx = new Long_flagContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_long_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(LONG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerated_typeContext extends ParserRuleContext {
		public Token col_type;
		public Enumerated_valuesContext enumerated_values() {
			return getRuleContext(Enumerated_valuesContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(mysqlParser.ENUM, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public List<Column_optionsContext> column_options() {
			return getRuleContexts(Column_optionsContext.class);
		}
		public Column_optionsContext column_options(int i) {
			return getRuleContext(Column_optionsContext.class,i);
		}
		public Enumerated_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerated_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterEnumerated_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitEnumerated_type(this);
		}
	}

	public final Enumerated_typeContext enumerated_type() throws RecognitionException {
		Enumerated_typeContext _localctx = new Enumerated_typeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_enumerated_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			((Enumerated_typeContext)_localctx).col_type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ENUM || _la==SET) ) {
				((Enumerated_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(960);
			match(T__0);
			setState(961);
			enumerated_values();
			setState(962);
			match(T__7);
			setState(966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(963);
					column_options();
					}
					} 
				}
				setState(968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_optionsContext extends ParserRuleContext {
		public NullabilityContext nullability() {
			return getRuleContext(NullabilityContext.class,0);
		}
		public Charset_defContext charset_def() {
			return getRuleContext(Charset_defContext.class,0);
		}
		public CollationContext collation() {
			return getRuleContext(CollationContext.class,0);
		}
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public Primary_keyContext primary_key() {
			return getRuleContext(Primary_keyContext.class,0);
		}
		public TerminalNode ON() { return getToken(mysqlParser.ON, 0); }
		public TerminalNode UPDATE() { return getToken(mysqlParser.UPDATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(mysqlParser.CURRENT_TIMESTAMP, 0); }
		public Now_functionContext now_function() {
			return getRuleContext(Now_functionContext.class,0);
		}
		public Current_timestamp_lengthContext current_timestamp_length() {
			return getRuleContext(Current_timestamp_lengthContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(mysqlParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(mysqlParser.AUTO_INCREMENT, 0); }
		public TerminalNode BINARY() { return getToken(mysqlParser.BINARY, 0); }
		public TerminalNode COMMENT() { return getToken(mysqlParser.COMMENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode COLUMN_FORMAT() { return getToken(mysqlParser.COLUMN_FORMAT, 0); }
		public TerminalNode FIXED() { return getToken(mysqlParser.FIXED, 0); }
		public TerminalNode DYNAMIC() { return getToken(mysqlParser.DYNAMIC, 0); }
		public TerminalNode COMPRESSED() { return getToken(mysqlParser.COMPRESSED, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode STORAGE() { return getToken(mysqlParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(mysqlParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(mysqlParser.MEMORY, 0); }
		public TerminalNode VIRTUAL() { return getToken(mysqlParser.VIRTUAL, 0); }
		public TerminalNode STORED() { return getToken(mysqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(mysqlParser.AS, 0); }
		public Skip_parensContext skip_parens() {
			return getRuleContext(Skip_parensContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(mysqlParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(mysqlParser.ALWAYS, 0); }
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(mysqlParser.CHECK, 0); }
		public Column_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterColumn_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitColumn_options(this);
		}
	}

	public final Column_optionsContext column_options() throws RecognitionException {
		Column_optionsContext _localctx = new Column_optionsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_column_options);
		int _la;
		try {
			setState(1006);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(969);
				nullability();
				}
				break;
			case ASCII:
			case CHARACTER:
			case CHARSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				charset_def();
				}
				break;
			case COLLATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(971);
				collation();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(972);
				default_value();
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 5);
				{
				setState(973);
				primary_key();
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 6);
				{
				setState(974);
				match(ON);
				setState(975);
				match(UPDATE);
				setState(981);
				switch (_input.LA(1)) {
				case CURRENT_TIMESTAMP:
					{
					setState(976);
					match(CURRENT_TIMESTAMP);
					setState(978);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(977);
						current_timestamp_length();
						}
					}

					}
					break;
				case NOW:
					{
					setState(980);
					now_function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(983);
				match(UNIQUE);
				setState(985);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(984);
					match(KEY);
					}
					break;
				}
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 8);
				{
				setState(987);
				match(KEY);
				}
				break;
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(988);
				match(AUTO_INCREMENT);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 10);
				{
				setState(989);
				match(BINARY);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 11);
				{
				setState(990);
				match(COMMENT);
				setState(991);
				string_literal();
				}
				break;
			case COLUMN_FORMAT:
				enterOuterAlt(_localctx, 12);
				{
				setState(992);
				match(COLUMN_FORMAT);
				setState(993);
				_la = _input.LA(1);
				if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (COMPRESSED - 45)) | (1L << (DEFAULT - 45)) | (1L << (DYNAMIC - 45)) | (1L << (FIXED - 45)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STORAGE:
				enterOuterAlt(_localctx, 13);
				{
				setState(994);
				match(STORAGE);
				setState(995);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==DISK || _la==MEMORY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STORED:
			case VIRTUAL:
				enterOuterAlt(_localctx, 14);
				{
				setState(996);
				_la = _input.LA(1);
				if ( !(_la==STORED || _la==VIRTUAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case AS:
			case GENERATED:
				enterOuterAlt(_localctx, 15);
				{
				setState(999);
				_la = _input.LA(1);
				if (_la==GENERATED) {
					{
					setState(997);
					match(GENERATED);
					setState(998);
					match(ALWAYS);
					}
				}

				setState(1001);
				match(AS);
				setState(1002);
				skip_parens();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 16);
				{
				setState(1003);
				reference_definition();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 17);
				{
				setState(1004);
				match(CHECK);
				setState(1005);
				skip_parens();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_keyContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(mysqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPrimary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPrimary_key(this);
		}
	}

	public final Primary_keyContext primary_key() throws RecognitionException {
		Primary_keyContext _localctx = new Primary_keyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_primary_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(PRIMARY);
			setState(1009);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerated_valuesContext extends ParserRuleContext {
		public List<Enum_valueContext> enum_value() {
			return getRuleContexts(Enum_valueContext.class);
		}
		public Enum_valueContext enum_value(int i) {
			return getRuleContext(Enum_valueContext.class,i);
		}
		public Enumerated_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerated_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterEnumerated_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitEnumerated_values(this);
		}
	}

	public final Enumerated_valuesContext enumerated_values() throws RecognitionException {
		Enumerated_valuesContext _localctx = new Enumerated_valuesContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_enumerated_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			enum_value();
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1012);
				match(T__6);
				setState(1013);
				enum_value();
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_valueContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Enum_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterEnum_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitEnum_value(this);
		}
	}

	public final Enum_valueContext enum_value() throws RecognitionException {
		Enum_valueContext _localctx = new Enum_valueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_enum_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Charset_defContext extends ParserRuleContext {
		public Character_setContext character_set() {
			return getRuleContext(Character_setContext.class,0);
		}
		public TerminalNode ASCII() { return getToken(mysqlParser.ASCII, 0); }
		public Charset_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCharset_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCharset_def(this);
		}
	}

	public final Charset_defContext charset_def() throws RecognitionException {
		Charset_defContext _localctx = new Charset_defContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_charset_def);
		try {
			setState(1023);
			switch (_input.LA(1)) {
			case CHARACTER:
			case CHARSET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				character_set();
				}
				break;
			case ASCII:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				match(ASCII);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_setContext extends ParserRuleContext {
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode CHARSET() { return getToken(mysqlParser.CHARSET, 0); }
		public TerminalNode CHARACTER() { return getToken(mysqlParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public Character_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCharacter_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCharacter_set(this);
		}
	}

	public final Character_setContext character_set() throws RecognitionException {
		Character_setContext _localctx = new Character_setContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_character_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			switch (_input.LA(1)) {
			case CHARACTER:
				{
				{
				setState(1025);
				match(CHARACTER);
				setState(1026);
				match(SET);
				}
				}
				break;
			case CHARSET:
				{
				setState(1027);
				match(CHARSET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1030);
			charset_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullabilityContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(mysqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(mysqlParser.NULL, 0); }
		public NullabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterNullability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitNullability(this);
		}
	}

	public final NullabilityContext nullability() throws RecognitionException {
		NullabilityContext _localctx = new NullabilityContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_nullability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(1032);
				match(NOT);
				setState(1033);
				match(NULL);
				}
				break;
			case NULL:
				{
				setState(1034);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public Literal_with_weirdo_multistringContext literal_with_weirdo_multistring() {
			return getRuleContext(Literal_with_weirdo_multistringContext.class,0);
		}
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(mysqlParser.CURRENT_TIMESTAMP, 0); }
		public Now_functionContext now_function() {
			return getRuleContext(Now_functionContext.class,0);
		}
		public Localtime_functionContext localtime_function() {
			return getRuleContext(Localtime_functionContext.class,0);
		}
		public Current_timestamp_lengthContext current_timestamp_length() {
			return getRuleContext(Current_timestamp_lengthContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDefault_value(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_default_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(DEFAULT);
			setState(1039);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1038);
				match(T__0);
				}
			}

			setState(1048);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__4:
			case FALSE:
			case NULL:
			case TRUE:
			case STRING_LITERAL:
			case DBL_STRING_LITERAL:
			case INTEGER_LITERAL:
			case IDENT:
				{
				setState(1041);
				literal_with_weirdo_multistring();
				}
				break;
			case CURRENT_TIMESTAMP:
				{
				setState(1042);
				match(CURRENT_TIMESTAMP);
				setState(1044);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1043);
					current_timestamp_length();
					}
				}

				}
				break;
			case NOW:
				{
				setState(1046);
				now_function();
				}
				break;
			case LOCALTIME:
			case LOCALTIMESTAMP:
				{
				setState(1047);
				localtime_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1051);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1050);
				match(T__7);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitLength(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(T__0);
			setState(1054);
			match(INTEGER_LITERAL);
			setState(1055);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_flagsContext extends ParserRuleContext {
		public TerminalNode SIGNED() { return getToken(mysqlParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(mysqlParser.UNSIGNED, 0); }
		public TerminalNode ZEROFILL() { return getToken(mysqlParser.ZEROFILL, 0); }
		public Int_flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterInt_flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitInt_flags(this);
		}
	}

	public final Int_flagsContext int_flags() throws RecognitionException {
		Int_flagsContext _localctx = new Int_flagsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_int_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			_la = _input.LA(1);
			if ( !(((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (SIGNED - 179)) | (1L << (UNSIGNED - 179)) | (1L << (ZEROFILL - 179)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decimal_lengthContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(mysqlParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(mysqlParser.INTEGER_LITERAL, i);
		}
		public Decimal_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDecimal_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDecimal_length(this);
		}
	}

	public final Decimal_lengthContext decimal_length() throws RecognitionException {
		Decimal_lengthContext _localctx = new Decimal_lengthContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_decimal_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(T__0);
			setState(1060);
			match(INTEGER_LITERAL);
			setState(1063);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(1061);
				match(T__6);
				setState(1062);
				match(INTEGER_LITERAL);
				}
			}

			setState(1065);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Now_functionContext extends ParserRuleContext {
		public TerminalNode NOW() { return getToken(mysqlParser.NOW, 0); }
		public Now_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_now_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterNow_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitNow_function(this);
		}
	}

	public final Now_functionContext now_function() throws RecognitionException {
		Now_functionContext _localctx = new Now_functionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_now_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(NOW);
			setState(1068);
			match(T__0);
			setState(1069);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Current_timestamp_lengthContext extends ParserRuleContext {
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public Current_timestamp_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_current_timestamp_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCurrent_timestamp_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCurrent_timestamp_length(this);
		}
	}

	public final Current_timestamp_lengthContext current_timestamp_length() throws RecognitionException {
		Current_timestamp_lengthContext _localctx = new Current_timestamp_lengthContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_current_timestamp_length);
		try {
			setState(1074);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				length();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				match(T__0);
				setState(1073);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Localtime_functionContext extends ParserRuleContext {
		public TerminalNode LOCALTIME() { return getToken(mysqlParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(mysqlParser.LOCALTIMESTAMP, 0); }
		public Localtime_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localtime_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterLocaltime_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitLocaltime_function(this);
		}
	}

	public final Localtime_functionContext localtime_function() throws RecognitionException {
		Localtime_functionContext _localctx = new Localtime_functionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localtime_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_la = _input.LA(1);
			if ( !(_la==LOCALTIME || _la==LOCALTIMESTAMP) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1079);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1077);
				match(T__0);
				setState(1078);
				match(T__7);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_byContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(mysqlParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(mysqlParser.BY, 0); }
		public Partition_by_whatContext partition_by_what() {
			return getRuleContext(Partition_by_whatContext.class,0);
		}
		public Partition_countContext partition_count() {
			return getRuleContext(Partition_countContext.class,0);
		}
		public Subpartition_byContext subpartition_by() {
			return getRuleContext(Subpartition_byContext.class,0);
		}
		public Partition_definitionsContext partition_definitions() {
			return getRuleContext(Partition_definitionsContext.class,0);
		}
		public Partition_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPartition_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPartition_by(this);
		}
	}

	public final Partition_byContext partition_by() throws RecognitionException {
		Partition_byContext _localctx = new Partition_byContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_partition_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(PARTITION);
			setState(1082);
			match(BY);
			setState(1083);
			partition_by_what();
			setState(1085);
			_la = _input.LA(1);
			if (_la==PARTITIONS) {
				{
				setState(1084);
				partition_count();
				}
			}

			setState(1088);
			_la = _input.LA(1);
			if (_la==SUBPARTITION) {
				{
				setState(1087);
				subpartition_by();
				}
			}

			setState(1091);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1090);
				partition_definitions();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_by_whatContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(mysqlParser.HASH, 0); }
		public Skip_parensContext skip_parens() {
			return getRuleContext(Skip_parensContext.class,0);
		}
		public TerminalNode LINEAR() { return getToken(mysqlParser.LINEAR, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public TerminalNode ALGORITHM() { return getToken(mysqlParser.ALGORITHM, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public TerminalNode RANGE() { return getToken(mysqlParser.RANGE, 0); }
		public TerminalNode COLUMNS() { return getToken(mysqlParser.COLUMNS, 0); }
		public TerminalNode LIST() { return getToken(mysqlParser.LIST, 0); }
		public Partition_by_whatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_by_what; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPartition_by_what(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPartition_by_what(this);
		}
	}

	public final Partition_by_whatContext partition_by_what() throws RecognitionException {
		Partition_by_whatContext _localctx = new Partition_by_whatContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_partition_by_what);
		int _la;
		try {
			setState(1118);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				_la = _input.LA(1);
				if (_la==LINEAR) {
					{
					setState(1093);
					match(LINEAR);
					}
				}

				setState(1096);
				match(HASH);
				setState(1097);
				skip_parens();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				_la = _input.LA(1);
				if (_la==LINEAR) {
					{
					setState(1098);
					match(LINEAR);
					}
				}

				setState(1101);
				match(KEY);
				setState(1105);
				_la = _input.LA(1);
				if (_la==ALGORITHM) {
					{
					setState(1102);
					match(ALGORITHM);
					setState(1103);
					match(T__5);
					setState(1104);
					match(INTEGER_LITERAL);
					}
				}

				setState(1107);
				skip_parens();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1108);
				match(RANGE);
				setState(1110);
				_la = _input.LA(1);
				if (_la==COLUMNS) {
					{
					setState(1109);
					match(COLUMNS);
					}
				}

				setState(1112);
				skip_parens();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1113);
				match(LIST);
				setState(1115);
				_la = _input.LA(1);
				if (_la==COLUMNS) {
					{
					setState(1114);
					match(COLUMNS);
					}
				}

				setState(1117);
				skip_parens();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subpartition_byContext extends ParserRuleContext {
		public TerminalNode SUBPARTITION() { return getToken(mysqlParser.SUBPARTITION, 0); }
		public TerminalNode BY() { return getToken(mysqlParser.BY, 0); }
		public Partition_by_whatContext partition_by_what() {
			return getRuleContext(Partition_by_whatContext.class,0);
		}
		public TerminalNode SUBPARTITIONS() { return getToken(mysqlParser.SUBPARTITIONS, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Subpartition_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpartition_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterSubpartition_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitSubpartition_by(this);
		}
	}

	public final Subpartition_byContext subpartition_by() throws RecognitionException {
		Subpartition_byContext _localctx = new Subpartition_byContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_subpartition_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(SUBPARTITION);
			setState(1121);
			match(BY);
			setState(1122);
			partition_by_what();
			setState(1125);
			_la = _input.LA(1);
			if (_la==SUBPARTITIONS) {
				{
				setState(1123);
				match(SUBPARTITIONS);
				setState(1124);
				match(INTEGER_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_countContext extends ParserRuleContext {
		public TerminalNode PARTITIONS() { return getToken(mysqlParser.PARTITIONS, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Partition_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPartition_count(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPartition_count(this);
		}
	}

	public final Partition_countContext partition_count() throws RecognitionException {
		Partition_countContext _localctx = new Partition_countContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_partition_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			match(PARTITIONS);
			setState(1128);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_definitionsContext extends ParserRuleContext {
		public Skip_parens_inside_partition_definitionsContext skip_parens_inside_partition_definitions() {
			return getRuleContext(Skip_parens_inside_partition_definitionsContext.class,0);
		}
		public Partition_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPartition_definitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPartition_definitions(this);
		}
	}

	public final Partition_definitionsContext partition_definitions() throws RecognitionException {
		Partition_definitionsContext _localctx = new Partition_definitionsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_partition_definitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(T__0);
			setState(1131);
			skip_parens_inside_partition_definitions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Skip_parens_inside_partition_definitionsContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(mysqlParser.PARTITION, 0); }
		public TerminalNode MAXWELL_ELIDED_PARSE_ISSUE() { return getToken(mysqlParser.MAXWELL_ELIDED_PARSE_ISSUE, 0); }
		public Skip_parens_inside_partition_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_parens_inside_partition_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterSkip_parens_inside_partition_definitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitSkip_parens_inside_partition_definitions(this);
		}
	}

	public final Skip_parens_inside_partition_definitionsContext skip_parens_inside_partition_definitions() throws RecognitionException {
		Skip_parens_inside_partition_definitionsContext _localctx = new Skip_parens_inside_partition_definitionsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_skip_parens_inside_partition_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			_la = _input.LA(1);
			if ( !(_la==PARTITION || _la==MAXWELL_ELIDED_PARSE_ISSUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_databaseContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(mysqlParser.ALTER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Alter_database_definitionContext alter_database_definition() {
			return getRuleContext(Alter_database_definitionContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(mysqlParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(mysqlParser.SCHEMA, 0); }
		public Alter_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_database(this);
		}
	}

	public final Alter_databaseContext alter_database() throws RecognitionException {
		Alter_databaseContext _localctx = new Alter_databaseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_alter_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(ALTER);
			setState(1136);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1137);
			name();
			setState(1138);
			alter_database_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_database_definitionContext extends ParserRuleContext {
		public List<Default_character_setContext> default_character_set() {
			return getRuleContexts(Default_character_setContext.class);
		}
		public Default_character_setContext default_character_set(int i) {
			return getRuleContext(Default_character_setContext.class,i);
		}
		public List<Default_collationContext> default_collation() {
			return getRuleContexts(Default_collationContext.class);
		}
		public Default_collationContext default_collation(int i) {
			return getRuleContext(Default_collationContext.class,i);
		}
		public TerminalNode UPGRADE() { return getToken(mysqlParser.UPGRADE, 0); }
		public TerminalNode DATA() { return getToken(mysqlParser.DATA, 0); }
		public TerminalNode DIRECTORY() { return getToken(mysqlParser.DIRECTORY, 0); }
		public TerminalNode NAME() { return getToken(mysqlParser.NAME, 0); }
		public Alter_database_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_database_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_database_definition(this);
		}
	}

	public final Alter_database_definitionContext alter_database_definition() throws RecognitionException {
		Alter_database_definitionContext _localctx = new Alter_database_definitionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_alter_database_definition);
		int _la;
		try {
			setState(1150);
			switch (_input.LA(1)) {
			case CHAR:
			case CHARACTER:
			case CHARSET:
			case COLLATE:
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1142);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(1140);
						default_character_set();
						}
						break;
					case 2:
						{
						setState(1141);
						default_collation();
						}
						break;
					}
					}
					setState(1144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CHARACTER) | (1L << CHARSET) | (1L << COLLATE) | (1L << DEFAULT))) != 0) );
				}
				break;
			case UPGRADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1146);
				match(UPGRADE);
				setState(1147);
				match(DATA);
				setState(1148);
				match(DIRECTORY);
				setState(1149);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_databaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(mysqlParser.CREATE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(mysqlParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(mysqlParser.SCHEMA, 0); }
		public If_not_existsContext if_not_exists() {
			return getRuleContext(If_not_existsContext.class,0);
		}
		public List<Default_character_setContext> default_character_set() {
			return getRuleContexts(Default_character_setContext.class);
		}
		public Default_character_setContext default_character_set(int i) {
			return getRuleContext(Default_character_setContext.class,i);
		}
		public List<Default_collationContext> default_collation() {
			return getRuleContexts(Default_collationContext.class);
		}
		public Default_collationContext default_collation(int i) {
			return getRuleContext(Default_collationContext.class,i);
		}
		public Create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_database(this);
		}
	}

	public final Create_databaseContext create_database() throws RecognitionException {
		Create_databaseContext _localctx = new Create_databaseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(CREATE);
			setState(1153);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1155);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1154);
				if_not_exists();
				}
			}

			setState(1157);
			name();
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CHARACTER) | (1L << CHARSET) | (1L << COLLATE) | (1L << DEFAULT))) != 0)) {
				{
				setState(1160);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1158);
					default_character_set();
					}
					break;
				case 2:
					{
					setState(1159);
					default_collation();
					}
					break;
				}
				}
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tableContext extends ParserRuleContext {
		public Create_table_preambleContext create_table_preamble() {
			return getRuleContext(Create_table_preambleContext.class,0);
		}
		public Create_specificationsContext create_specifications() {
			return getRuleContext(Create_specificationsContext.class,0);
		}
		public Create_like_tblContext create_like_tbl() {
			return getRuleContext(Create_like_tblContext.class,0);
		}
		public List<Table_creation_optionContext> table_creation_option() {
			return getRuleContexts(Table_creation_optionContext.class);
		}
		public Table_creation_optionContext table_creation_option(int i) {
			return getRuleContext(Table_creation_optionContext.class,i);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_table(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			create_table_preamble();
			setState(1177);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1166);
				create_specifications();
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << CHARACTER) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COLLATE) | (1L << COMMENT) | (1L << CONNECTION) | (1L << DATA) | (1L << DEFAULT) | (1L << DELAY_KEY_WRITE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (ENGINE - 71)) | (1L << (INDEX - 71)) | (1L << (INSERT_METHOD - 71)) | (1L << (KEY_BLOCK_SIZE - 71)) | (1L << (MAX_ROWS - 71)) | (1L << (MIN_ROWS - 71)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (PACK_KEYS - 151)) | (1L << (PARTITION - 151)) | (1L << (PASSWORD - 151)) | (1L << (ROW_FORMAT - 151)) | (1L << (STATS_AUTO_RECALC - 151)) | (1L << (STATS_PERSISTENT - 151)) | (1L << (STATS_SAMPLE_PAGES - 151)) | (1L << (STORAGE - 151)) | (1L << (TABLESPACE - 151)) | (1L << (UNION - 151)))) != 0)) {
					{
					{
					setState(1167);
					table_creation_option();
					setState(1169);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(1168);
						match(T__6);
						}
					}

					}
					}
					setState(1175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1176);
				create_like_tbl();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preambleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(mysqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(mysqlParser.TEMPORARY, 0); }
		public If_not_existsContext if_not_exists() {
			return getRuleContext(If_not_existsContext.class,0);
		}
		public Create_table_preambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_table_preamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_table_preamble(this);
		}
	}

	public final Create_table_preambleContext create_table_preamble() throws RecognitionException {
		Create_table_preambleContext _localctx = new Create_table_preambleContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_create_table_preamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(CREATE);
			setState(1181);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1180);
				match(TEMPORARY);
				}
			}

			setState(1183);
			match(TABLE);
			setState(1185);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1184);
				if_not_exists();
				}
			}

			setState(1187);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_specificationsContext extends ParserRuleContext {
		public List<Create_specificationContext> create_specification() {
			return getRuleContexts(Create_specificationContext.class);
		}
		public Create_specificationContext create_specification(int i) {
			return getRuleContext(Create_specificationContext.class,i);
		}
		public Create_specificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_specifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_specifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_specifications(this);
		}
	}

	public final Create_specificationsContext create_specifications() throws RecognitionException {
		Create_specificationsContext _localctx = new Create_specificationsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_create_specifications);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(T__0);
			setState(1190);
			create_specification();
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1191);
				match(T__6);
				setState(1192);
				create_specification();
				}
				}
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1198);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_specificationContext extends ParserRuleContext {
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Index_definitionContext index_definition() {
			return getRuleContext(Index_definitionContext.class,0);
		}
		public Create_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_specification(this);
		}
	}

	public final Create_specificationContext create_specification() throws RecognitionException {
		Create_specificationContext _localctx = new Create_specificationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_create_specification);
		try {
			setState(1202);
			switch (_input.LA(1)) {
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case ALWAYS:
			case ASCII:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BIT:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BYTE:
			case CHARSET:
			case CHECKSUM:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case CONNECTION:
			case COPY:
			case DATA:
			case DATE:
			case DATETIME:
			case DEFINER:
			case DELAY_KEY_WRITE:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DYNAMIC:
			case ENABLE:
			case ENGINE:
			case ENUM:
			case EXCHANGE:
			case EXCLUSIVE:
			case FIRST:
			case FIXED:
			case FULL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case HASH:
			case IMPORT:
			case INPLACE:
			case INSERT_METHOD:
			case INSTANT:
			case INVISIBLE:
			case INVOKER:
			case JSON:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LINESTRING:
			case LIST:
			case MAX_ROWS:
			case MEMORY:
			case MERGE:
			case MIN_ROWS:
			case MODIFY:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case NAME:
			case NATIONAL:
			case NCHAR:
			case NO:
			case NONE:
			case NOW:
			case NVARCHAR:
			case OFFLINE:
			case ONLINE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case POINT:
			case POLYGON:
			case REBUILD:
			case REDUNDANT:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case ROW_FORMAT:
			case SECURITY:
			case SERIAL:
			case SHARED:
			case SIGNED:
			case SIMPLE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case TABLESPACE:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TRUNCATE:
			case UNDEFINED:
			case UNICODE:
			case UPGRADE:
			case VALIDATION:
			case VIEW:
			case VISIBLE:
			case WITHOUT:
			case YEAR:
			case DBL_STRING_LITERAL:
			case INTEGER_LITERAL:
			case IDENT:
			case QUOTED_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				column_definition();
				}
				break;
			case CHECK:
			case CONSTRAINT:
			case FOREIGN:
			case FULLTEXT:
			case INDEX:
			case KEY:
			case PRIMARY:
			case SPATIAL:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				index_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_like_tblContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(mysqlParser.LIKE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_like_tblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_like_tbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_like_tbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_like_tbl(this);
		}
	}

	public final Create_like_tblContext create_like_tbl() throws RecognitionException {
		Create_like_tblContext _localctx = new Create_like_tblContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_create_like_tbl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1204);
				match(T__0);
				}
			}

			setState(1207);
			match(LIKE);
			setState(1208);
			table_name();
			setState(1210);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(1209);
				match(T__7);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_creation_optionContext extends ParserRuleContext {
		public Creation_engineContext creation_engine() {
			return getRuleContext(Creation_engineContext.class,0);
		}
		public Creation_auto_incrementContext creation_auto_increment() {
			return getRuleContext(Creation_auto_incrementContext.class,0);
		}
		public Creation_avg_row_lengthContext creation_avg_row_length() {
			return getRuleContext(Creation_avg_row_lengthContext.class,0);
		}
		public Creation_character_setContext creation_character_set() {
			return getRuleContext(Creation_character_setContext.class,0);
		}
		public Creation_checksumContext creation_checksum() {
			return getRuleContext(Creation_checksumContext.class,0);
		}
		public Creation_collationContext creation_collation() {
			return getRuleContext(Creation_collationContext.class,0);
		}
		public Creation_commentContext creation_comment() {
			return getRuleContext(Creation_commentContext.class,0);
		}
		public Creation_connectionContext creation_connection() {
			return getRuleContext(Creation_connectionContext.class,0);
		}
		public Creation_data_directoryContext creation_data_directory() {
			return getRuleContext(Creation_data_directoryContext.class,0);
		}
		public Creation_delay_key_writeContext creation_delay_key_write() {
			return getRuleContext(Creation_delay_key_writeContext.class,0);
		}
		public Creation_index_directoryContext creation_index_directory() {
			return getRuleContext(Creation_index_directoryContext.class,0);
		}
		public Creation_insert_methodContext creation_insert_method() {
			return getRuleContext(Creation_insert_methodContext.class,0);
		}
		public Creation_key_block_sizeContext creation_key_block_size() {
			return getRuleContext(Creation_key_block_sizeContext.class,0);
		}
		public Creation_max_rowsContext creation_max_rows() {
			return getRuleContext(Creation_max_rowsContext.class,0);
		}
		public Creation_min_rowsContext creation_min_rows() {
			return getRuleContext(Creation_min_rowsContext.class,0);
		}
		public Creation_pack_keysContext creation_pack_keys() {
			return getRuleContext(Creation_pack_keysContext.class,0);
		}
		public Creation_passwordContext creation_password() {
			return getRuleContext(Creation_passwordContext.class,0);
		}
		public Creation_row_formatContext creation_row_format() {
			return getRuleContext(Creation_row_formatContext.class,0);
		}
		public Creation_stats_auto_recalcContext creation_stats_auto_recalc() {
			return getRuleContext(Creation_stats_auto_recalcContext.class,0);
		}
		public Creation_stats_persistentContext creation_stats_persistent() {
			return getRuleContext(Creation_stats_persistentContext.class,0);
		}
		public Creation_stats_sample_pagesContext creation_stats_sample_pages() {
			return getRuleContext(Creation_stats_sample_pagesContext.class,0);
		}
		public Creation_storage_optionContext creation_storage_option() {
			return getRuleContext(Creation_storage_optionContext.class,0);
		}
		public Creation_tablespaceContext creation_tablespace() {
			return getRuleContext(Creation_tablespaceContext.class,0);
		}
		public Creation_unionContext creation_union() {
			return getRuleContext(Creation_unionContext.class,0);
		}
		public Partition_byContext partition_by() {
			return getRuleContext(Partition_byContext.class,0);
		}
		public Table_creation_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_creation_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterTable_creation_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitTable_creation_option(this);
		}
	}

	public final Table_creation_optionContext table_creation_option() throws RecognitionException {
		Table_creation_optionContext _localctx = new Table_creation_optionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_table_creation_option);
		try {
			setState(1237);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1212);
				creation_engine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1213);
				creation_auto_increment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1214);
				creation_avg_row_length();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1215);
				creation_character_set();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1216);
				creation_checksum();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1217);
				creation_collation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1218);
				creation_comment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1219);
				creation_connection();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1220);
				creation_data_directory();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1221);
				creation_delay_key_write();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1222);
				creation_index_directory();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1223);
				creation_insert_method();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1224);
				creation_key_block_size();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1225);
				creation_max_rows();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1226);
				creation_min_rows();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1227);
				creation_pack_keys();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1228);
				creation_password();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1229);
				creation_row_format();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1230);
				creation_stats_auto_recalc();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1231);
				creation_stats_persistent();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1232);
				creation_stats_sample_pages();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1233);
				creation_storage_option();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1234);
				creation_tablespace();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1235);
				creation_union();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1236);
				partition_by();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_engineContext extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(mysqlParser.ENGINE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode MEMORY() { return getToken(mysqlParser.MEMORY, 0); }
		public TerminalNode MERGE() { return getToken(mysqlParser.MERGE, 0); }
		public Creation_engineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_engine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_engine(this);
		}
	}

	public final Creation_engineContext creation_engine() throws RecognitionException {
		Creation_engineContext _localctx = new Creation_engineContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_creation_engine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(ENGINE);
			setState(1241);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1240);
				match(T__5);
				}
			}

			setState(1247);
			switch (_input.LA(1)) {
			case IDENT:
			case QUOTED_IDENT:
				{
				setState(1243);
				id();
				}
				break;
			case STRING_LITERAL:
			case DBL_STRING_LITERAL:
				{
				setState(1244);
				string_literal();
				}
				break;
			case MEMORY:
				{
				setState(1245);
				match(MEMORY);
				}
				break;
			case MERGE:
				{
				setState(1246);
				match(MERGE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_auto_incrementContext extends ParserRuleContext {
		public TerminalNode AUTO_INCREMENT() { return getToken(mysqlParser.AUTO_INCREMENT, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_auto_incrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_auto_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_auto_increment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_auto_increment(this);
		}
	}

	public final Creation_auto_incrementContext creation_auto_increment() throws RecognitionException {
		Creation_auto_incrementContext _localctx = new Creation_auto_incrementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_creation_auto_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(AUTO_INCREMENT);
			setState(1251);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1250);
				match(T__5);
				}
			}

			setState(1253);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_avg_row_lengthContext extends ParserRuleContext {
		public TerminalNode AVG_ROW_LENGTH() { return getToken(mysqlParser.AVG_ROW_LENGTH, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_avg_row_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_avg_row_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_avg_row_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_avg_row_length(this);
		}
	}

	public final Creation_avg_row_lengthContext creation_avg_row_length() throws RecognitionException {
		Creation_avg_row_lengthContext _localctx = new Creation_avg_row_lengthContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_creation_avg_row_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(AVG_ROW_LENGTH);
			setState(1257);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1256);
				match(T__5);
				}
			}

			setState(1259);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_character_setContext extends ParserRuleContext {
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode CHARSET() { return getToken(mysqlParser.CHARSET, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode CHARACTER() { return getToken(mysqlParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public Creation_character_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_character_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_character_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_character_set(this);
		}
	}

	public final Creation_character_setContext creation_character_set() throws RecognitionException {
		Creation_character_setContext _localctx = new Creation_character_setContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_creation_character_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1261);
				match(DEFAULT);
				}
			}

			setState(1267);
			switch (_input.LA(1)) {
			case CHARACTER:
				{
				{
				setState(1264);
				match(CHARACTER);
				setState(1265);
				match(SET);
				}
				}
				break;
			case CHARSET:
				{
				setState(1266);
				match(CHARSET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1270);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1269);
				match(T__5);
				}
			}

			setState(1272);
			charset_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_checksumContext extends ParserRuleContext {
		public TerminalNode CHECKSUM() { return getToken(mysqlParser.CHECKSUM, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_checksumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_checksum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_checksum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_checksum(this);
		}
	}

	public final Creation_checksumContext creation_checksum() throws RecognitionException {
		Creation_checksumContext _localctx = new Creation_checksumContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_creation_checksum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			match(CHECKSUM);
			setState(1275);
			match(T__5);
			setState(1276);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_collationContext extends ParserRuleContext {
		public Default_collationContext default_collation() {
			return getRuleContext(Default_collationContext.class,0);
		}
		public Creation_collationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_collation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_collation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_collation(this);
		}
	}

	public final Creation_collationContext creation_collation() throws RecognitionException {
		Creation_collationContext _localctx = new Creation_collationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_creation_collation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			default_collation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_commentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(mysqlParser.COMMENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Creation_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_comment(this);
		}
	}

	public final Creation_commentContext creation_comment() throws RecognitionException {
		Creation_commentContext _localctx = new Creation_commentContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_creation_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(COMMENT);
			setState(1282);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1281);
				match(T__5);
				}
			}

			setState(1284);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_connectionContext extends ParserRuleContext {
		public TerminalNode CONNECTION() { return getToken(mysqlParser.CONNECTION, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Creation_connectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_connection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_connection(this);
		}
	}

	public final Creation_connectionContext creation_connection() throws RecognitionException {
		Creation_connectionContext _localctx = new Creation_connectionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_creation_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(CONNECTION);
			setState(1288);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1287);
				match(T__5);
				}
			}

			setState(1290);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_data_directoryContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(mysqlParser.DATA, 0); }
		public TerminalNode DIRECTORY() { return getToken(mysqlParser.DIRECTORY, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Creation_data_directoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_data_directory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_data_directory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_data_directory(this);
		}
	}

	public final Creation_data_directoryContext creation_data_directory() throws RecognitionException {
		Creation_data_directoryContext _localctx = new Creation_data_directoryContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_creation_data_directory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(DATA);
			setState(1293);
			match(DIRECTORY);
			setState(1295);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1294);
				match(T__5);
				}
			}

			setState(1297);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_delay_key_writeContext extends ParserRuleContext {
		public TerminalNode DELAY_KEY_WRITE() { return getToken(mysqlParser.DELAY_KEY_WRITE, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_delay_key_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_delay_key_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_delay_key_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_delay_key_write(this);
		}
	}

	public final Creation_delay_key_writeContext creation_delay_key_write() throws RecognitionException {
		Creation_delay_key_writeContext _localctx = new Creation_delay_key_writeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_creation_delay_key_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			match(DELAY_KEY_WRITE);
			setState(1301);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1300);
				match(T__5);
				}
			}

			setState(1303);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_index_directoryContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(mysqlParser.INDEX, 0); }
		public TerminalNode DIRECTORY() { return getToken(mysqlParser.DIRECTORY, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Creation_index_directoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_index_directory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_index_directory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_index_directory(this);
		}
	}

	public final Creation_index_directoryContext creation_index_directory() throws RecognitionException {
		Creation_index_directoryContext _localctx = new Creation_index_directoryContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_creation_index_directory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			match(INDEX);
			setState(1306);
			match(DIRECTORY);
			setState(1308);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1307);
				match(T__5);
				}
			}

			setState(1310);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_insert_methodContext extends ParserRuleContext {
		public TerminalNode INSERT_METHOD() { return getToken(mysqlParser.INSERT_METHOD, 0); }
		public TerminalNode NO() { return getToken(mysqlParser.NO, 0); }
		public TerminalNode FIRST() { return getToken(mysqlParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(mysqlParser.LAST, 0); }
		public Creation_insert_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_insert_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_insert_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_insert_method(this);
		}
	}

	public final Creation_insert_methodContext creation_insert_method() throws RecognitionException {
		Creation_insert_methodContext _localctx = new Creation_insert_methodContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_creation_insert_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			match(INSERT_METHOD);
			setState(1314);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1313);
				match(T__5);
				}
			}

			setState(1316);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FIRST - 77)) | (1L << (LAST - 77)) | (1L << (NO - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_key_block_sizeContext extends ParserRuleContext {
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(mysqlParser.KEY_BLOCK_SIZE, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_key_block_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_key_block_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_key_block_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_key_block_size(this);
		}
	}

	public final Creation_key_block_sizeContext creation_key_block_size() throws RecognitionException {
		Creation_key_block_sizeContext _localctx = new Creation_key_block_sizeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_creation_key_block_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			match(KEY_BLOCK_SIZE);
			setState(1320);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1319);
				match(T__5);
				}
			}

			setState(1322);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_max_rowsContext extends ParserRuleContext {
		public TerminalNode MAX_ROWS() { return getToken(mysqlParser.MAX_ROWS, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_max_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_max_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_max_rows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_max_rows(this);
		}
	}

	public final Creation_max_rowsContext creation_max_rows() throws RecognitionException {
		Creation_max_rowsContext _localctx = new Creation_max_rowsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_creation_max_rows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			match(MAX_ROWS);
			setState(1326);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1325);
				match(T__5);
				}
			}

			setState(1328);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_min_rowsContext extends ParserRuleContext {
		public TerminalNode MIN_ROWS() { return getToken(mysqlParser.MIN_ROWS, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_min_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_min_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_min_rows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_min_rows(this);
		}
	}

	public final Creation_min_rowsContext creation_min_rows() throws RecognitionException {
		Creation_min_rowsContext _localctx = new Creation_min_rowsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_creation_min_rows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(MIN_ROWS);
			setState(1332);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1331);
				match(T__5);
				}
			}

			setState(1334);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_pack_keysContext extends ParserRuleContext {
		public TerminalNode PACK_KEYS() { return getToken(mysqlParser.PACK_KEYS, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public Creation_pack_keysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_pack_keys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_pack_keys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_pack_keys(this);
		}
	}

	public final Creation_pack_keysContext creation_pack_keys() throws RecognitionException {
		Creation_pack_keysContext _localctx = new Creation_pack_keysContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_creation_pack_keys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(PACK_KEYS);
			setState(1338);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1337);
				match(T__5);
				}
			}

			setState(1342);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				{
				setState(1340);
				integer();
				}
				break;
			case DEFAULT:
				{
				setState(1341);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_passwordContext extends ParserRuleContext {
		public TerminalNode PASSWORD() { return getToken(mysqlParser.PASSWORD, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Creation_passwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_password(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_password(this);
		}
	}

	public final Creation_passwordContext creation_password() throws RecognitionException {
		Creation_passwordContext _localctx = new Creation_passwordContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_creation_password);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			match(PASSWORD);
			setState(1346);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1345);
				match(T__5);
				}
			}

			setState(1348);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_row_formatContext extends ParserRuleContext {
		public TerminalNode ROW_FORMAT() { return getToken(mysqlParser.ROW_FORMAT, 0); }
		public List<TerminalNode> DEFAULT() { return getTokens(mysqlParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(mysqlParser.DEFAULT, i);
		}
		public TerminalNode DYNAMIC() { return getToken(mysqlParser.DYNAMIC, 0); }
		public TerminalNode FIXED() { return getToken(mysqlParser.FIXED, 0); }
		public TerminalNode COMPRESSED() { return getToken(mysqlParser.COMPRESSED, 0); }
		public TerminalNode REDUNDANT() { return getToken(mysqlParser.REDUNDANT, 0); }
		public TerminalNode COMPACT() { return getToken(mysqlParser.COMPACT, 0); }
		public Creation_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_row_format(this);
		}
	}

	public final Creation_row_formatContext creation_row_format() throws RecognitionException {
		Creation_row_formatContext _localctx = new Creation_row_formatContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_creation_row_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(ROW_FORMAT);
			setState(1352);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1351);
				match(T__5);
				}
			}

			setState(1354);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (COMPACT - 44)) | (1L << (COMPRESSED - 44)) | (1L << (DEFAULT - 44)) | (1L << (DYNAMIC - 44)) | (1L << (FIXED - 44)))) != 0) || _la==REDUNDANT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_stats_auto_recalcContext extends ParserRuleContext {
		public TerminalNode STATS_AUTO_RECALC() { return getToken(mysqlParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Creation_stats_auto_recalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_stats_auto_recalc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_stats_auto_recalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_stats_auto_recalc(this);
		}
	}

	public final Creation_stats_auto_recalcContext creation_stats_auto_recalc() throws RecognitionException {
		Creation_stats_auto_recalcContext _localctx = new Creation_stats_auto_recalcContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_creation_stats_auto_recalc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(STATS_AUTO_RECALC);
			setState(1358);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1357);
				match(T__5);
				}
			}

			setState(1360);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==INTEGER_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_stats_persistentContext extends ParserRuleContext {
		public TerminalNode STATS_PERSISTENT() { return getToken(mysqlParser.STATS_PERSISTENT, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Creation_stats_persistentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_stats_persistent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_stats_persistent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_stats_persistent(this);
		}
	}

	public final Creation_stats_persistentContext creation_stats_persistent() throws RecognitionException {
		Creation_stats_persistentContext _localctx = new Creation_stats_persistentContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_creation_stats_persistent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			match(STATS_PERSISTENT);
			setState(1364);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1363);
				match(T__5);
				}
			}

			setState(1366);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==INTEGER_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_stats_sample_pagesContext extends ParserRuleContext {
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(mysqlParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Creation_stats_sample_pagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_stats_sample_pages; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_stats_sample_pages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_stats_sample_pages(this);
		}
	}

	public final Creation_stats_sample_pagesContext creation_stats_sample_pages() throws RecognitionException {
		Creation_stats_sample_pagesContext _localctx = new Creation_stats_sample_pagesContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_creation_stats_sample_pages);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			match(STATS_SAMPLE_PAGES);
			setState(1370);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1369);
				match(T__5);
				}
			}

			setState(1372);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_storage_optionContext extends ParserRuleContext {
		public TerminalNode STORAGE() { return getToken(mysqlParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(mysqlParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(mysqlParser.MEMORY, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public Creation_storage_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_storage_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_storage_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_storage_option(this);
		}
	}

	public final Creation_storage_optionContext creation_storage_option() throws RecognitionException {
		Creation_storage_optionContext _localctx = new Creation_storage_optionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_creation_storage_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			match(STORAGE);
			setState(1375);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==DISK || _la==MEMORY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_tablespaceContext extends ParserRuleContext {
		public TerminalNode TABLESPACE() { return getToken(mysqlParser.TABLESPACE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Creation_tablespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_tablespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_tablespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_tablespace(this);
		}
	}

	public final Creation_tablespaceContext creation_tablespace() throws RecognitionException {
		Creation_tablespaceContext _localctx = new Creation_tablespaceContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_creation_tablespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			match(TABLESPACE);
			setState(1378);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_unionContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(mysqlParser.UNION, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Creation_unionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_union(this);
		}
	}

	public final Creation_unionContext creation_union() throws RecognitionException {
		Creation_unionContext _localctx = new Creation_unionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_creation_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(UNION);
			setState(1382);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1381);
				match(T__5);
				}
			}

			setState(1384);
			match(T__0);
			setState(1385);
			name();
			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1386);
				match(T__6);
				setState(1387);
				name();
				}
				}
				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1393);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_definitionContext extends ParserRuleContext {
		public Index_type_1Context index_type_1() {
			return getRuleContext(Index_type_1Context.class,0);
		}
		public Index_type_pkContext index_type_pk() {
			return getRuleContext(Index_type_pkContext.class,0);
		}
		public Index_type_3Context index_type_3() {
			return getRuleContext(Index_type_3Context.class,0);
		}
		public Index_type_4Context index_type_4() {
			return getRuleContext(Index_type_4Context.class,0);
		}
		public Index_type_5Context index_type_5() {
			return getRuleContext(Index_type_5Context.class,0);
		}
		public Index_type_checkContext index_type_check() {
			return getRuleContext(Index_type_checkContext.class,0);
		}
		public Index_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_definition(this);
		}
	}

	public final Index_definitionContext index_definition() throws RecognitionException {
		Index_definitionContext _localctx = new Index_definitionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_index_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1395);
				index_type_1();
				}
				break;
			case 2:
				{
				setState(1396);
				index_type_pk();
				}
				break;
			case 3:
				{
				setState(1397);
				index_type_3();
				}
				break;
			case 4:
				{
				setState(1398);
				index_type_4();
				}
				break;
			case 5:
				{
				setState(1399);
				index_type_5();
				}
				break;
			case 6:
				{
				setState(1400);
				index_type_check();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_1Context extends ParserRuleContext {
		public Index_or_keyContext index_or_key() {
			return getRuleContext(Index_or_keyContext.class,0);
		}
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public List<Index_optionsContext> index_options() {
			return getRuleContexts(Index_optionsContext.class);
		}
		public Index_optionsContext index_options(int i) {
			return getRuleContext(Index_optionsContext.class,i);
		}
		public Index_type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_1(this);
		}
	}

	public final Index_type_1Context index_type_1() throws RecognitionException {
		Index_type_1Context _localctx = new Index_type_1Context(_ctx, getState());
		enterRule(_localctx, 222, RULE_index_type_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			index_or_key();
			setState(1405);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INSTANT - 64)) | (1L << (INVISIBLE - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TABLESPACE - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (VISIBLE - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1404);
				index_name();
				}
			}

			setState(1408);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1407);
				index_type();
				}
			}

			setState(1410);
			index_column_list();
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==INVISIBLE || _la==KEY_BLOCK_SIZE || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (USING - 211)) | (1L << (VISIBLE - 211)) | (1L << (WITH - 211)))) != 0)) {
				{
				{
				setState(1411);
				index_options();
				}
				}
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_pkContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(mysqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public List<Index_typeContext> index_type() {
			return getRuleContexts(Index_typeContext.class);
		}
		public Index_typeContext index_type(int i) {
			return getRuleContext(Index_typeContext.class,i);
		}
		public List<Index_nameContext> index_name() {
			return getRuleContexts(Index_nameContext.class);
		}
		public Index_nameContext index_name(int i) {
			return getRuleContext(Index_nameContext.class,i);
		}
		public List<Index_optionsContext> index_options() {
			return getRuleContexts(Index_optionsContext.class);
		}
		public Index_optionsContext index_options(int i) {
			return getRuleContext(Index_optionsContext.class,i);
		}
		public Index_type_pkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_pk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_pk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_pk(this);
		}
	}

	public final Index_type_pkContext index_type_pk() throws RecognitionException {
		Index_type_pkContext _localctx = new Index_type_pkContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_index_type_pk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1417);
				index_constraint();
				}
			}

			setState(1420);
			match(PRIMARY);
			setState(1421);
			match(KEY);
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INSTANT - 64)) | (1L << (INVISIBLE - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TABLESPACE - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (USING - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (VISIBLE - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1424);
				switch (_input.LA(1)) {
				case USING:
					{
					setState(1422);
					index_type();
					}
					break;
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case ALWAYS:
				case ASCII:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BIT:
				case BOOL:
				case BOOLEAN:
				case BTREE:
				case BYTE:
				case CHARSET:
				case CHECKSUM:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case CONNECTION:
				case COPY:
				case DATA:
				case DATE:
				case DATETIME:
				case DEFINER:
				case DELAY_KEY_WRITE:
				case DIRECTORY:
				case DISABLE:
				case DISCARD:
				case DISK:
				case DYNAMIC:
				case ENABLE:
				case ENGINE:
				case ENUM:
				case EXCHANGE:
				case EXCLUSIVE:
				case FIRST:
				case FIXED:
				case FULL:
				case GEOMETRY:
				case GEOMETRYCOLLECTION:
				case HASH:
				case IMPORT:
				case INPLACE:
				case INSERT_METHOD:
				case INSTANT:
				case INVISIBLE:
				case INVOKER:
				case JSON:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LINESTRING:
				case LIST:
				case MAX_ROWS:
				case MEMORY:
				case MERGE:
				case MIN_ROWS:
				case MODIFY:
				case MULTILINESTRING:
				case MULTIPOINT:
				case MULTIPOLYGON:
				case NAME:
				case NATIONAL:
				case NCHAR:
				case NO:
				case NONE:
				case NOW:
				case NVARCHAR:
				case OFFLINE:
				case ONLINE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PARTITIONS:
				case PASSWORD:
				case POINT:
				case POLYGON:
				case REBUILD:
				case REDUNDANT:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case ROW_FORMAT:
				case SECURITY:
				case SERIAL:
				case SHARED:
				case SIGNED:
				case SIMPLE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUBPARTITIONS:
				case TABLESPACE:
				case TEMPORARY:
				case TEMPTABLE:
				case TEXT:
				case TIME:
				case TIMESTAMP:
				case TRUNCATE:
				case UNDEFINED:
				case UNICODE:
				case UPGRADE:
				case VALIDATION:
				case VIEW:
				case VISIBLE:
				case WITHOUT:
				case YEAR:
				case DBL_STRING_LITERAL:
				case INTEGER_LITERAL:
				case IDENT:
				case QUOTED_IDENT:
					{
					setState(1423);
					index_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1429);
			index_column_list();
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==INVISIBLE || _la==KEY_BLOCK_SIZE || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (USING - 211)) | (1L << (VISIBLE - 211)) | (1L << (WITH - 211)))) != 0)) {
				{
				{
				setState(1430);
				index_options();
				}
				}
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_3Context extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(mysqlParser.UNIQUE, 0); }
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public Index_or_keyContext index_or_key() {
			return getRuleContext(Index_or_keyContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public List<Index_optionsContext> index_options() {
			return getRuleContexts(Index_optionsContext.class);
		}
		public Index_optionsContext index_options(int i) {
			return getRuleContext(Index_optionsContext.class,i);
		}
		public Index_type_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_3(this);
		}
	}

	public final Index_type_3Context index_type_3() throws RecognitionException {
		Index_type_3Context _localctx = new Index_type_3Context(_ctx, getState());
		enterRule(_localctx, 226, RULE_index_type_3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1436);
				index_constraint();
				}
			}

			setState(1439);
			match(UNIQUE);
			setState(1441);
			_la = _input.LA(1);
			if (_la==INDEX || _la==KEY) {
				{
				setState(1440);
				index_or_key();
				}
			}

			setState(1444);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INSTANT - 64)) | (1L << (INVISIBLE - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TABLESPACE - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (VISIBLE - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1443);
				index_name();
				}
			}

			setState(1447);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1446);
				index_type();
				}
			}

			setState(1449);
			index_column_list();
			setState(1453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==INVISIBLE || _la==KEY_BLOCK_SIZE || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (USING - 211)) | (1L << (VISIBLE - 211)) | (1L << (WITH - 211)))) != 0)) {
				{
				{
				setState(1450);
				index_options();
				}
				}
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_4Context extends ParserRuleContext {
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public TerminalNode FULLTEXT() { return getToken(mysqlParser.FULLTEXT, 0); }
		public TerminalNode SPATIAL() { return getToken(mysqlParser.SPATIAL, 0); }
		public Index_or_keyContext index_or_key() {
			return getRuleContext(Index_or_keyContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public List<Index_optionsContext> index_options() {
			return getRuleContexts(Index_optionsContext.class);
		}
		public Index_optionsContext index_options(int i) {
			return getRuleContext(Index_optionsContext.class,i);
		}
		public Index_type_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_4(this);
		}
	}

	public final Index_type_4Context index_type_4() throws RecognitionException {
		Index_type_4Context _localctx = new Index_type_4Context(_ctx, getState());
		enterRule(_localctx, 228, RULE_index_type_4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			_la = _input.LA(1);
			if ( !(_la==FULLTEXT || _la==SPATIAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1458);
			_la = _input.LA(1);
			if (_la==INDEX || _la==KEY) {
				{
				setState(1457);
				index_or_key();
				}
			}

			setState(1461);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INSTANT - 64)) | (1L << (INVISIBLE - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TABLESPACE - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (VISIBLE - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1460);
				index_name();
				}
			}

			setState(1463);
			index_column_list();
			setState(1467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==INVISIBLE || _la==KEY_BLOCK_SIZE || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (USING - 211)) | (1L << (VISIBLE - 211)) | (1L << (WITH - 211)))) != 0)) {
				{
				{
				setState(1464);
				index_options();
				}
				}
				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_5Context extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(mysqlParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_type_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_5(this);
		}
	}

	public final Index_type_5Context index_type_5() throws RecognitionException {
		Index_type_5Context _localctx = new Index_type_5Context(_ctx, getState());
		enterRule(_localctx, 230, RULE_index_type_5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1470);
				index_constraint();
				}
			}

			setState(1473);
			match(FOREIGN);
			setState(1474);
			match(KEY);
			setState(1476);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INSTANT - 64)) | (1L << (INVISIBLE - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TABLESPACE - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (VISIBLE - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1475);
				index_name();
				}
			}

			setState(1478);
			index_column_list();
			setState(1479);
			reference_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_checkContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(mysqlParser.CHECK, 0); }
		public Skip_parensContext skip_parens() {
			return getRuleContext(Skip_parensContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public Index_type_checkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_check(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_check(this);
		}
	}

	public final Index_type_checkContext index_type_check() throws RecognitionException {
		Index_type_checkContext _localctx = new Index_type_checkContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_index_type_check);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1481);
				index_constraint();
				}
			}

			setState(1484);
			match(CHECK);
			setState(1485);
			skip_parens();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_or_keyContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(mysqlParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Index_or_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_or_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_or_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_or_key(this);
		}
	}

	public final Index_or_keyContext index_or_key() throws RecognitionException {
		Index_or_keyContext _localctx = new Index_or_keyContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_index_or_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_constraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(mysqlParser.CONSTRAINT, 0); }
		public Constraint_nameContext constraint_name() {
			return getRuleContext(Constraint_nameContext.class,0);
		}
		public Index_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_constraint(this);
		}
	}

	public final Index_constraintContext index_constraint() throws RecognitionException {
		Index_constraintContext _localctx = new Index_constraintContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_index_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1489);
			match(CONSTRAINT);
			setState(1491);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INSTANT - 64)) | (1L << (INVISIBLE - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TABLESPACE - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (VISIBLE - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1490);
				constraint_name();
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constraint_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Constraint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterConstraint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitConstraint_name(this);
		}
	}

	public final Constraint_nameContext constraint_name() throws RecognitionException {
		Constraint_nameContext _localctx = new Constraint_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_constraint_name);
		try {
			setState(1498);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1494);
				name();
				setState(1495);
				match(T__1);
				setState(1496);
				name();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_typeContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(mysqlParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(mysqlParser.BTREE, 0); }
		public TerminalNode HASH() { return getToken(mysqlParser.HASH, 0); }
		public Index_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type(this);
		}
	}

	public final Index_typeContext index_type() throws RecognitionException {
		Index_typeContext _localctx = new Index_typeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_index_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			match(USING);
			setState(1503);
			_la = _input.LA(1);
			if ( !(_la==BTREE || _la==HASH) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(mysqlParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public TerminalNode WITH() { return getToken(mysqlParser.WITH, 0); }
		public TerminalNode PARSER() { return getToken(mysqlParser.PARSER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(mysqlParser.COMMENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode VISIBLE() { return getToken(mysqlParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(mysqlParser.INVISIBLE, 0); }
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_options(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_index_options);
		int _la;
		try {
			setState(1515);
			switch (_input.LA(1)) {
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1505);
				match(KEY_BLOCK_SIZE);
				setState(1506);
				match(T__5);
				setState(1507);
				match(INTEGER_LITERAL);
				}
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				index_type();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1509);
				match(WITH);
				setState(1510);
				match(PARSER);
				setState(1511);
				name();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1512);
				match(COMMENT);
				setState(1513);
				string_literal();
				}
				break;
			case INVISIBLE:
			case VISIBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1514);
				_la = _input.LA(1);
				if ( !(_la==INVISIBLE || _la==VISIBLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_listContext extends ParserRuleContext {
		public Index_columnsContext index_columns() {
			return getRuleContext(Index_columnsContext.class,0);
		}
		public Index_column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_column_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_column_list(this);
		}
	}

	public final Index_column_listContext index_column_list() throws RecognitionException {
		Index_column_listContext _localctx = new Index_column_listContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_index_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			match(T__0);
			setState(1518);
			index_columns();
			setState(1519);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_columnsContext extends ParserRuleContext {
		public List<Index_columnContext> index_column() {
			return getRuleContexts(Index_columnContext.class);
		}
		public Index_columnContext index_column(int i) {
			return getRuleContext(Index_columnContext.class,i);
		}
		public Index_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_columns(this);
		}
	}

	public final Index_columnsContext index_columns() throws RecognitionException {
		Index_columnsContext _localctx = new Index_columnsContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_index_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			index_column();
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1522);
				match(T__6);
				setState(1523);
				index_column();
				}
				}
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_columnContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Index_column_partial_defContext index_column_partial_def() {
			return getRuleContext(Index_column_partial_defContext.class,0);
		}
		public Index_column_asc_or_descContext index_column_asc_or_desc() {
			return getRuleContext(Index_column_asc_or_descContext.class,0);
		}
		public Index_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_column(this);
		}
	}

	public final Index_columnContext index_column() throws RecognitionException {
		Index_columnContext _localctx = new Index_columnContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_index_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			name();
			setState(1531);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1530);
				index_column_partial_def();
				}
			}

			setState(1534);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1533);
				index_column_asc_or_desc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_partial_defContext extends ParserRuleContext {
		public Index_column_partial_lengthContext index_column_partial_length() {
			return getRuleContext(Index_column_partial_lengthContext.class,0);
		}
		public Index_column_partial_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_partial_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_column_partial_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_column_partial_def(this);
		}
	}

	public final Index_column_partial_defContext index_column_partial_def() throws RecognitionException {
		Index_column_partial_defContext _localctx = new Index_column_partial_defContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_index_column_partial_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(T__0);
			setState(1537);
			index_column_partial_length();
			setState(1538);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_partial_lengthContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(mysqlParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(mysqlParser.INTEGER_LITERAL, i);
		}
		public Index_column_partial_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_partial_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_column_partial_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_column_partial_length(this);
		}
	}

	public final Index_column_partial_lengthContext index_column_partial_length() throws RecognitionException {
		Index_column_partial_lengthContext _localctx = new Index_column_partial_lengthContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_index_column_partial_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1540);
				match(INTEGER_LITERAL);
				}
				}
				setState(1543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER_LITERAL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_asc_or_descContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(mysqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(mysqlParser.DESC, 0); }
		public Index_column_asc_or_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_asc_or_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_column_asc_or_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_column_asc_or_desc(this);
		}
	}

	public final Index_column_asc_or_descContext index_column_asc_or_desc() throws RecognitionException {
		Index_column_asc_or_descContext _localctx = new Index_column_asc_or_descContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_index_column_asc_or_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definitionContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(mysqlParser.REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public List<Reference_definition_matchContext> reference_definition_match() {
			return getRuleContexts(Reference_definition_matchContext.class);
		}
		public Reference_definition_matchContext reference_definition_match(int i) {
			return getRuleContext(Reference_definition_matchContext.class,i);
		}
		public List<Reference_definition_on_deleteContext> reference_definition_on_delete() {
			return getRuleContexts(Reference_definition_on_deleteContext.class);
		}
		public Reference_definition_on_deleteContext reference_definition_on_delete(int i) {
			return getRuleContext(Reference_definition_on_deleteContext.class,i);
		}
		public List<Reference_definition_on_updateContext> reference_definition_on_update() {
			return getRuleContexts(Reference_definition_on_updateContext.class);
		}
		public Reference_definition_on_updateContext reference_definition_on_update(int i) {
			return getRuleContext(Reference_definition_on_updateContext.class,i);
		}
		public Reference_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterReference_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitReference_definition(this);
		}
	}

	public final Reference_definitionContext reference_definition() throws RecognitionException {
		Reference_definitionContext _localctx = new Reference_definitionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_reference_definition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			match(REFERENCES);
			setState(1548);
			table_name();
			setState(1549);
			index_column_list();
			setState(1555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1553);
					switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
					case 1:
						{
						setState(1550);
						reference_definition_match();
						}
						break;
					case 2:
						{
						setState(1551);
						reference_definition_on_delete();
						}
						break;
					case 3:
						{
						setState(1552);
						reference_definition_on_update();
						}
						break;
					}
					} 
				}
				setState(1557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definition_matchContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(mysqlParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(mysqlParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(mysqlParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(mysqlParser.SIMPLE, 0); }
		public Reference_definition_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterReference_definition_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitReference_definition_match(this);
		}
	}

	public final Reference_definition_matchContext reference_definition_match() throws RecognitionException {
		Reference_definition_matchContext _localctx = new Reference_definition_matchContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_reference_definition_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1558);
				match(MATCH);
				setState(1559);
				match(FULL);
				}
				break;
			case 2:
				{
				setState(1560);
				match(MATCH);
				setState(1561);
				match(PARTIAL);
				}
				break;
			case 3:
				{
				setState(1562);
				match(MATCH);
				setState(1563);
				match(SIMPLE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definition_on_deleteContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(mysqlParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(mysqlParser.DELETE, 0); }
		public Reference_optionContext reference_option() {
			return getRuleContext(Reference_optionContext.class,0);
		}
		public Reference_definition_on_deleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition_on_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterReference_definition_on_delete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitReference_definition_on_delete(this);
		}
	}

	public final Reference_definition_on_deleteContext reference_definition_on_delete() throws RecognitionException {
		Reference_definition_on_deleteContext _localctx = new Reference_definition_on_deleteContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_reference_definition_on_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			match(ON);
			setState(1567);
			match(DELETE);
			setState(1568);
			reference_option();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definition_on_updateContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(mysqlParser.ON, 0); }
		public TerminalNode UPDATE() { return getToken(mysqlParser.UPDATE, 0); }
		public Reference_optionContext reference_option() {
			return getRuleContext(Reference_optionContext.class,0);
		}
		public Reference_definition_on_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition_on_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterReference_definition_on_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitReference_definition_on_update(this);
		}
	}

	public final Reference_definition_on_updateContext reference_definition_on_update() throws RecognitionException {
		Reference_definition_on_updateContext _localctx = new Reference_definition_on_updateContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_reference_definition_on_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			match(ON);
			setState(1571);
			match(UPDATE);
			setState(1572);
			reference_option();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_optionContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(mysqlParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(mysqlParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public TerminalNode NULL() { return getToken(mysqlParser.NULL, 0); }
		public TerminalNode NO() { return getToken(mysqlParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(mysqlParser.ACTION, 0); }
		public Reference_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterReference_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitReference_option(this);
		}
	}

	public final Reference_optionContext reference_option() throws RecognitionException {
		Reference_optionContext _localctx = new Reference_optionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_reference_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			switch (_input.LA(1)) {
			case RESTRICT:
				{
				setState(1574);
				match(RESTRICT);
				}
				break;
			case CASCADE:
				{
				setState(1575);
				match(CASCADE);
				}
				break;
			case SET:
				{
				setState(1576);
				match(SET);
				setState(1577);
				match(NULL);
				}
				break;
			case NO:
				{
				setState(1578);
				match(NO);
				setState(1579);
				match(ACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_databaseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(mysqlParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(mysqlParser.SCHEMA, 0); }
		public If_existsContext if_exists() {
			return getRuleContext(If_existsContext.class,0);
		}
		public Drop_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_database(this);
		}
	}

	public final Drop_databaseContext drop_database() throws RecognitionException {
		Drop_databaseContext _localctx = new Drop_databaseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_drop_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			match(DROP);
			setState(1583);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1585);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1584);
				if_exists();
				}
			}

			setState(1587);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_tableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode TEMPORARY() { return getToken(mysqlParser.TEMPORARY, 0); }
		public If_existsContext if_exists() {
			return getRuleContext(If_existsContext.class,0);
		}
		public List<Drop_table_optionsContext> drop_table_options() {
			return getRuleContexts(Drop_table_optionsContext.class);
		}
		public Drop_table_optionsContext drop_table_options(int i) {
			return getRuleContext(Drop_table_optionsContext.class,i);
		}
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_table(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_drop_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(DROP);
			setState(1591);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1590);
				match(TEMPORARY);
				}
			}

			setState(1593);
			match(TABLE);
			setState(1595);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1594);
				if_exists();
				}
			}

			setState(1597);
			table_name();
			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1598);
				match(T__6);
				setState(1599);
				table_name();
				}
				}
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASCADE || _la==RESTRICT) {
				{
				{
				setState(1605);
				drop_table_options();
				}
				}
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_optionsContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(mysqlParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(mysqlParser.CASCADE, 0); }
		public Drop_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_table_options(this);
		}
	}

	public final Drop_table_optionsContext drop_table_options() throws RecognitionException {
		Drop_table_optionsContext _localctx = new Drop_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_drop_table_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			_la = _input.LA(1);
			if ( !(_la==CASCADE || _la==RESTRICT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_existsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(mysqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(mysqlParser.EXISTS, 0); }
		public If_existsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIf_exists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIf_exists(this);
		}
	}

	public final If_existsContext if_exists() throws RecognitionException {
		If_existsContext _localctx = new If_existsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_if_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			match(IF);
			setState(1614);
			match(EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_tableContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(mysqlParser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public List<Rename_table_specContext> rename_table_spec() {
			return getRuleContexts(Rename_table_specContext.class);
		}
		public Rename_table_specContext rename_table_spec(int i) {
			return getRuleContext(Rename_table_specContext.class,i);
		}
		public Rename_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterRename_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitRename_table(this);
		}
	}

	public final Rename_tableContext rename_table() throws RecognitionException {
		Rename_tableContext _localctx = new Rename_tableContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_rename_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			match(RENAME);
			setState(1617);
			match(TABLE);
			setState(1618);
			rename_table_spec();
			setState(1623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1619);
				match(T__6);
				setState(1620);
				rename_table_spec();
				}
				}
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_table_specContext extends ParserRuleContext {
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode TO() { return getToken(mysqlParser.TO, 0); }
		public Rename_table_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_table_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterRename_table_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitRename_table_spec(this);
		}
	}

	public final Rename_table_specContext rename_table_spec() throws RecognitionException {
		Rename_table_specContext _localctx = new Rename_table_specContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_rename_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			table_name();
			setState(1627);
			match(TO);
			setState(1628);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_viewContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(mysqlParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(mysqlParser.VIEW, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<View_optionsContext> view_options() {
			return getRuleContexts(View_optionsContext.class);
		}
		public View_optionsContext view_options(int i) {
			return getRuleContext(View_optionsContext.class,i);
		}
		public Alter_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_view(this);
		}
	}

	public final Alter_viewContext alter_view() throws RecognitionException {
		Alter_viewContext _localctx = new Alter_viewContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_alter_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(ALTER);
			setState(1634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALGORITHM || _la==DEFINER || _la==SQL) {
				{
				{
				setState(1631);
				view_options();
				}
				}
				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1637);
			match(VIEW);
			setState(1638);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_viewContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(mysqlParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(mysqlParser.VIEW, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OR() { return getToken(mysqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(mysqlParser.REPLACE, 0); }
		public List<View_optionsContext> view_options() {
			return getRuleContexts(View_optionsContext.class);
		}
		public View_optionsContext view_options(int i) {
			return getRuleContext(View_optionsContext.class,i);
		}
		public Create_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_view(this);
		}
	}

	public final Create_viewContext create_view() throws RecognitionException {
		Create_viewContext _localctx = new Create_viewContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_create_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(CREATE);
			setState(1643);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1641);
				match(OR);
				setState(1642);
				match(REPLACE);
				}
			}

			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALGORITHM || _la==DEFINER || _la==SQL) {
				{
				{
				setState(1645);
				view_options();
				}
				}
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1651);
			match(VIEW);
			setState(1652);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_viewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(mysqlParser.VIEW, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode IF() { return getToken(mysqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(mysqlParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(mysqlParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(mysqlParser.CASCADE, 0); }
		public Drop_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_view(this);
		}
	}

	public final Drop_viewContext drop_view() throws RecognitionException {
		Drop_viewContext _localctx = new Drop_viewContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_drop_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			match(DROP);
			setState(1655);
			match(VIEW);
			setState(1658);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1656);
				match(IF);
				setState(1657);
				match(EXISTS);
				}
			}

			setState(1660);
			name();
			setState(1665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1661);
				match(T__6);
				setState(1662);
				name();
				}
				}
				setState(1667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1669);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1668);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_optionsContext extends ParserRuleContext {
		public TerminalNode ALGORITHM() { return getToken(mysqlParser.ALGORITHM, 0); }
		public TerminalNode UNDEFINED() { return getToken(mysqlParser.UNDEFINED, 0); }
		public TerminalNode MERGE() { return getToken(mysqlParser.MERGE, 0); }
		public TerminalNode TEMPTABLE() { return getToken(mysqlParser.TEMPTABLE, 0); }
		public TerminalNode DEFINER() { return getToken(mysqlParser.DEFINER, 0); }
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode CURRENT_USER() { return getToken(mysqlParser.CURRENT_USER, 0); }
		public TerminalNode SQL() { return getToken(mysqlParser.SQL, 0); }
		public TerminalNode SECURITY() { return getToken(mysqlParser.SECURITY, 0); }
		public TerminalNode INVOKER() { return getToken(mysqlParser.INVOKER, 0); }
		public View_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterView_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitView_options(this);
		}
	}

	public final View_optionsContext view_options() throws RecognitionException {
		View_optionsContext _localctx = new View_optionsContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_view_options);
		int _la;
		try {
			setState(1683);
			switch (_input.LA(1)) {
			case ALGORITHM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1671);
				match(ALGORITHM);
				setState(1672);
				match(T__5);
				setState(1673);
				_la = _input.LA(1);
				if ( !(_la==MERGE || _la==TEMPTABLE || _la==UNDEFINED) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case DEFINER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1674);
				match(DEFINER);
				setState(1675);
				match(T__5);
				setState(1678);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
				case DBL_STRING_LITERAL:
				case IDENT:
				case QUOTED_IDENT:
					{
					setState(1676);
					user();
					}
					break;
				case CURRENT_USER:
					{
					setState(1677);
					match(CURRENT_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SQL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1680);
				match(SQL);
				setState(1681);
				match(SECURITY);
				setState(1682);
				_la = _input.LA(1);
				if ( !(_la==DEFINER || _la==INVOKER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00ed\u0698\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\3\2\5\2\u0124"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0133\n\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0144"+
		"\n\b\3\t\3\t\3\t\5\t\u0149\n\t\3\n\3\n\3\n\5\n\u014e\n\n\3\13\3\13\3\13"+
		"\3\13\5\13\u0154\n\13\3\f\3\f\3\f\3\f\5\f\u015a\n\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0165\n\16\3\17\3\17\3\17\6\17\u016a\n"+
		"\17\r\17\16\17\u016b\3\17\3\17\3\17\3\17\5\17\u0172\n\17\3\20\5\20\u0175"+
		"\n\20\3\20\5\20\u0178\n\20\3\20\3\20\3\20\3\21\5\21\u017e\n\21\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\5\23\u0187\n\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0193\n\26\3\27\5\27\u0196\n\27\3\27\3"+
		"\27\5\27\u019a\n\27\3\27\3\27\5\27\u019e\n\27\3\30\5\30\u01a1\n\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u01aa\n\31\3\32\3\32\5\32\u01ae\n"+
		"\32\3\32\3\32\3\32\3\32\5\32\u01b4\n\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\5\34\u01bd\n\34\3\35\3\35\5\35\u01c1\n\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\7\37\u01cb\n\37\f\37\16\37\u01ce\13\37\3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \6 \u01dc\n \r \16 \u01dd\3 \5 \u01e1\n \3!\3"+
		"!\5!\u01e5\n!\3!\3!\5!\u01e9\n!\3\"\3\"\5\"\u01ed\n\"\3\"\3\"\3\"\5\""+
		"\u01f2\n\"\3\"\3\"\3\"\5\"\u01f7\n\"\7\"\u01f9\n\"\f\"\16\"\u01fc\13\""+
		"\3\"\3\"\3#\3#\5#\u0202\n#\3#\3#\3#\5#\u0207\n#\3$\3$\5$\u020b\n$\3$\3"+
		"$\5$\u020f\n$\3%\3%\5%\u0213\n%\3%\3%\5%\u0217\n%\3&\3&\5&\u021b\n&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\5(\u0226\n(\3(\3(\3)\3)\3)\3)\3)\5)\u022f"+
		"\n)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0253\n+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\5+\u025d\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\5+\u0273\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u027e\n,\3,\3,\3,\3,"+
		"\3,\3,\5,\u0286\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u0294\n,\f,"+
		"\16,\u0297\13,\3,\3,\3,\3,\3,\3,\3,\5,\u02a0\n,\3,\3,\3,\5,\u02a5\n,\3"+
		",\3,\3,\3,\3,\3,\3,\5,\u02ae\n,\3-\3-\3.\3.\3/\3/\3/\7/\u02b7\n/\f/\16"+
		"/\u02ba\13/\3\60\3\60\5\60\u02be\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\5\61\u02cb\n\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u02d8\n\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u02e5\n\63\3\63\3\63\3\64\3\64\3\64\5\64"+
		"\u02ec\n\64\3\65\3\65\3\65\3\65\5\65\u02f2\n\65\3\66\3\66\5\66\u02f6\n"+
		"\66\3\66\7\66\u02f9\n\66\f\66\16\66\u02fc\13\66\3\66\3\66\7\66\u0300\n"+
		"\66\f\66\16\66\u0303\13\66\3\66\3\66\7\66\u0307\n\66\f\66\16\66\u030a"+
		"\13\66\3\66\3\66\7\66\u030e\n\66\f\66\16\66\u0311\13\66\3\66\3\66\3\66"+
		"\7\66\u0316\n\66\f\66\16\66\u0319\13\66\5\66\u031b\n\66\3\67\3\67\5\67"+
		"\u031f\n\67\3\67\7\67\u0322\n\67\f\67\16\67\u0325\13\67\3\67\7\67\u0328"+
		"\n\67\f\67\16\67\u032b\13\67\3\67\3\67\5\67\u032f\n\67\3\67\7\67\u0332"+
		"\n\67\f\67\16\67\u0335\13\67\3\67\7\67\u0338\n\67\f\67\16\67\u033b\13"+
		"\67\3\67\3\67\5\67\u033f\n\67\3\67\5\67\u0342\n\67\3\67\7\67\u0345\n\67"+
		"\f\67\16\67\u0348\13\67\3\67\7\67\u034b\n\67\f\67\16\67\u034e\13\67\3"+
		"\67\3\67\7\67\u0352\n\67\f\67\16\67\u0355\13\67\5\67\u0357\n\67\38\38"+
		"\58\u035b\n8\38\38\58\u035f\n8\38\38\38\78\u0364\n8\f8\168\u0367\138\3"+
		"8\38\58\u036b\n8\38\38\38\38\38\38\78\u0373\n8\f8\168\u0376\138\38\38"+
		"\58\u037a\n8\38\78\u037d\n8\f8\168\u0380\138\38\38\38\38\58\u0386\n8\3"+
		"8\78\u0389\n8\f8\168\u038c\138\38\38\38\38\38\78\u0393\n8\f8\168\u0396"+
		"\138\38\38\58\u039a\n8\38\38\38\78\u039f\n8\f8\168\u03a2\138\38\38\38"+
		"\38\78\u03a8\n8\f8\168\u03ab\138\38\38\38\78\u03b0\n8\f8\168\u03b3\13"+
		"8\38\38\38\38\78\u03b9\n8\f8\168\u03bc\138\58\u03be\n8\39\39\3:\3:\3:"+
		"\3:\3:\7:\u03c7\n:\f:\16:\u03ca\13:\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u03d5"+
		"\n;\3;\5;\u03d8\n;\3;\3;\5;\u03dc\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\5;\u03ea\n;\3;\3;\3;\3;\3;\5;\u03f1\n;\3<\3<\3<\3=\3=\3=\7=\u03f9"+
		"\n=\f=\16=\u03fc\13=\3>\3>\3?\3?\5?\u0402\n?\3@\3@\3@\5@\u0407\n@\3@\3"+
		"@\3A\3A\3A\5A\u040e\nA\3B\3B\5B\u0412\nB\3B\3B\3B\5B\u0417\nB\3B\3B\5"+
		"B\u041b\nB\3B\5B\u041e\nB\3C\3C\3C\3C\3D\3D\3E\3E\3E\3E\5E\u042a\nE\3"+
		"E\3E\3F\3F\3F\3F\3G\3G\3G\5G\u0435\nG\3H\3H\3H\5H\u043a\nH\3I\3I\3I\3"+
		"I\5I\u0440\nI\3I\5I\u0443\nI\3I\5I\u0446\nI\3J\5J\u0449\nJ\3J\3J\3J\5"+
		"J\u044e\nJ\3J\3J\3J\3J\5J\u0454\nJ\3J\3J\3J\5J\u0459\nJ\3J\3J\3J\5J\u045e"+
		"\nJ\3J\5J\u0461\nJ\3K\3K\3K\3K\3K\5K\u0468\nK\3L\3L\3L\3M\3M\3M\3N\3N"+
		"\3O\3O\3O\3O\3O\3P\3P\6P\u0479\nP\rP\16P\u047a\3P\3P\3P\3P\5P\u0481\n"+
		"P\3Q\3Q\3Q\5Q\u0486\nQ\3Q\3Q\3Q\7Q\u048b\nQ\fQ\16Q\u048e\13Q\3R\3R\3R"+
		"\3R\5R\u0494\nR\7R\u0496\nR\fR\16R\u0499\13R\3R\5R\u049c\nR\3S\3S\5S\u04a0"+
		"\nS\3S\3S\5S\u04a4\nS\3S\3S\3T\3T\3T\3T\7T\u04ac\nT\fT\16T\u04af\13T\3"+
		"T\3T\3U\3U\5U\u04b5\nU\3V\5V\u04b8\nV\3V\3V\3V\5V\u04bd\nV\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u04d8"+
		"\nW\3X\3X\5X\u04dc\nX\3X\3X\3X\3X\5X\u04e2\nX\3Y\3Y\5Y\u04e6\nY\3Y\3Y"+
		"\3Z\3Z\5Z\u04ec\nZ\3Z\3Z\3[\5[\u04f1\n[\3[\3[\3[\5[\u04f6\n[\3[\5[\u04f9"+
		"\n[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3^\3^\5^\u0505\n^\3^\3^\3_\3_\5_\u050b"+
		"\n_\3_\3_\3`\3`\3`\5`\u0512\n`\3`\3`\3a\3a\5a\u0518\na\3a\3a\3b\3b\3b"+
		"\5b\u051f\nb\3b\3b\3c\3c\5c\u0525\nc\3c\3c\3d\3d\5d\u052b\nd\3d\3d\3e"+
		"\3e\5e\u0531\ne\3e\3e\3f\3f\5f\u0537\nf\3f\3f\3g\3g\5g\u053d\ng\3g\3g"+
		"\5g\u0541\ng\3h\3h\5h\u0545\nh\3h\3h\3i\3i\5i\u054b\ni\3i\3i\3j\3j\5j"+
		"\u0551\nj\3j\3j\3k\3k\5k\u0557\nk\3k\3k\3l\3l\5l\u055d\nl\3l\3l\3m\3m"+
		"\3m\3n\3n\3n\3o\3o\5o\u0569\no\3o\3o\3o\3o\7o\u056f\no\fo\16o\u0572\13"+
		"o\3o\3o\3p\3p\3p\3p\3p\3p\5p\u057c\np\3q\3q\5q\u0580\nq\3q\5q\u0583\n"+
		"q\3q\3q\7q\u0587\nq\fq\16q\u058a\13q\3r\5r\u058d\nr\3r\3r\3r\3r\7r\u0593"+
		"\nr\fr\16r\u0596\13r\3r\3r\7r\u059a\nr\fr\16r\u059d\13r\3s\5s\u05a0\n"+
		"s\3s\3s\5s\u05a4\ns\3s\5s\u05a7\ns\3s\5s\u05aa\ns\3s\3s\7s\u05ae\ns\f"+
		"s\16s\u05b1\13s\3t\3t\5t\u05b5\nt\3t\5t\u05b8\nt\3t\3t\7t\u05bc\nt\ft"+
		"\16t\u05bf\13t\3u\5u\u05c2\nu\3u\3u\3u\5u\u05c7\nu\3u\3u\3u\3v\5v\u05cd"+
		"\nv\3v\3v\3v\3w\3w\3x\3x\5x\u05d6\nx\3y\3y\3y\3y\3y\5y\u05dd\ny\3z\3z"+
		"\3{\3{\3{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u05ee\n|\3}\3}\3}\3}\3~\3~"+
		"\3~\7~\u05f7\n~\f~\16~\u05fa\13~\3\177\3\177\5\177\u05fe\n\177\3\177\5"+
		"\177\u0601\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\6\u0081\u0608"+
		"\n\u0081\r\u0081\16\u0081\u0609\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\7\u0083\u0614\n\u0083\f\u0083\16\u0083\u0617"+
		"\13\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u061f"+
		"\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u062f\n\u0087"+
		"\3\u0088\3\u0088\3\u0088\5\u0088\u0634\n\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\5\u0089\u063a\n\u0089\3\u0089\3\u0089\5\u0089\u063e\n\u0089\3"+
		"\u0089\3\u0089\3\u0089\7\u0089\u0643\n\u0089\f\u0089\16\u0089\u0646\13"+
		"\u0089\3\u0089\7\u0089\u0649\n\u0089\f\u0089\16\u0089\u064c\13\u0089\3"+
		"\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\7\u008c\u0658\n\u008c\f\u008c\16\u008c\u065b\13\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\7\u008e\u0663\n\u008e\f\u008e"+
		"\16\u008e\u0666\13\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f"+
		"\5\u008f\u066e\n\u008f\3\u008f\7\u008f\u0671\n\u008f\f\u008f\16\u008f"+
		"\u0674\13\u008f\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\5\u0090\u067d\n\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u0682\n\u0090\f"+
		"\u0090\16\u0090\u0685\13\u0090\3\u0090\5\u0090\u0688\n\u0090\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0691\n\u0091\3"+
		"\u0091\3\u0091\3\u0091\5\u0091\u0696\n\u0091\3\u0091\2\2\u0092\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\2+\61\2\13\13\r\16\20\20\24\27\32\32\34\36  %%\'(+\60\63\63\67\679:="+
		">ADGLOPVVY[^^`bkmpqtu}}\u0081\u0082\u0084\u008d\u008f\u008f\u0092\u0093"+
		"\u0095\u0095\u0099\u009b\u009d\u00a1\u00a6\u00a7\u00a9\u00a9\u00ab\u00ac"+
		"\u00af\u00af\u00b1\u00b2\u00b4\u00b6\u00ba\u00bd\u00bf\u00c0\u00c2\u00c7"+
		"\u00cd\u00cf\u00d4\u00d4\u00d6\u00d6\u00da\u00da\u00dc\u00dc\u00de\u00df"+
		"\3\2\13\u00e0\4\2\3\3\u00e3\u00e3\3\2\u00ea\u00eb\3\2\6\7\3\2\u00e7\u00e8"+
		"\4\2\u00e7\u00e7\u00ea\u00ea\5\2]]\u0093\u0093\u0095\u0095\4\2__nn\4\2"+
		"\22\22\u00cb\u00cb\3\2\u00dd\u00de\4\2kk\u00dc\u00dc\6\2\63\63<<``bb\6"+
		"\2<<LL\u008d\u008d\u00b4\u00b4\4\2\23\23@@\6\2\31\33::\u00c6\u00c7\u00df"+
		"\u00df\7\2\34\3599zz~~\u00c8\u00c8\6\2YZtt\u0086\u0088\u00a0\u00a1\n\2"+
		"\30\30PPRSci\177\177\u0083\u0083\u00b7\u00b7\u00c9\u00c9\6\2;;QQ\u0091"+
		"\u0091\u00a5\u00a5\4\2#$\u00d8\u00d8\3\2#$\4\2\u008b\u008b\u0092\u0092"+
		"\5\2{{\u0080\u0080\u00ca\u00ca\4\2\31\31\u00d8\u00d8\4\2JJ\u00b3\u00b3"+
		"\6\2//<<GGPP\5\2<<DD\u0081\u0081\4\2\u00be\u00be\u00db\u00db\5\2\u00b5"+
		"\u00b5\u00d2\u00d2\u00e0\u00e0\3\2vw\4\2\u009c\u009c\u00e3\u00e3\4\28"+
		"8\u00b0\u00b0\5\2OOqq\u008c\u008c\7\2./<<GGPP\u00a7\u00a7\4\2<<\u00e9"+
		"\u00e9\4\2WW\u00b8\u00b8\4\2\36\36[[\4\2!!\u00ae\u00ae\5\2\u0082\u0082"+
		"\u00c4\u00c4\u00ce\u00ce\4\2==ll\u076c\2\u0123\3\2\2\2\4\u0132\3\2\2\2"+
		"\6\u0134\3\2\2\2\b\u0136\3\2\2\2\n\u0138\3\2\2\2\f\u013a\3\2\2\2\16\u0143"+
		"\3\2\2\2\20\u0145\3\2\2\2\22\u014d\3\2\2\2\24\u0153\3\2\2\2\26\u0159\3"+
		"\2\2\2\30\u015b\3\2\2\2\32\u0164\3\2\2\2\34\u0171\3\2\2\2\36\u0174\3\2"+
		"\2\2 \u017d\3\2\2\2\"\u0181\3\2\2\2$\u0186\3\2\2\2&\u0188\3\2\2\2(\u018a"+
		"\3\2\2\2*\u0192\3\2\2\2,\u0195\3\2\2\2.\u01a0\3\2\2\2\60\u01a9\3\2\2\2"+
		"\62\u01ab\3\2\2\2\64\u01b5\3\2\2\2\66\u01b9\3\2\2\28\u01be\3\2\2\2:\u01c5"+
		"\3\2\2\2<\u01c7\3\2\2\2>\u01e0\3\2\2\2@\u01e2\3\2\2\2B\u01ea\3\2\2\2D"+
		"\u01ff\3\2\2\2F\u0208\3\2\2\2H\u0210\3\2\2\2J\u0218\3\2\2\2L\u021f\3\2"+
		"\2\2N\u0223\3\2\2\2P\u0229\3\2\2\2R\u0230\3\2\2\2T\u0272\3\2\2\2V\u02ad"+
		"\3\2\2\2X\u02af\3\2\2\2Z\u02b1\3\2\2\2\\\u02b3\3\2\2\2^\u02bb\3\2\2\2"+
		"`\u02ca\3\2\2\2b\u02d7\3\2\2\2d\u02e4\3\2\2\2f\u02eb\3\2\2\2h\u02f1\3"+
		"\2\2\2j\u031a\3\2\2\2l\u0356\3\2\2\2n\u03bd\3\2\2\2p\u03bf\3\2\2\2r\u03c1"+
		"\3\2\2\2t\u03f0\3\2\2\2v\u03f2\3\2\2\2x\u03f5\3\2\2\2z\u03fd\3\2\2\2|"+
		"\u0401\3\2\2\2~\u0406\3\2\2\2\u0080\u040d\3\2\2\2\u0082\u040f\3\2\2\2"+
		"\u0084\u041f\3\2\2\2\u0086\u0423\3\2\2\2\u0088\u0425\3\2\2\2\u008a\u042d"+
		"\3\2\2\2\u008c\u0434\3\2\2\2\u008e\u0436\3\2\2\2\u0090\u043b\3\2\2\2\u0092"+
		"\u0460\3\2\2\2\u0094\u0462\3\2\2\2\u0096\u0469\3\2\2\2\u0098\u046c\3\2"+
		"\2\2\u009a\u046f\3\2\2\2\u009c\u0471\3\2\2\2\u009e\u0480\3\2\2\2\u00a0"+
		"\u0482\3\2\2\2\u00a2\u048f\3\2\2\2\u00a4\u049d\3\2\2\2\u00a6\u04a7\3\2"+
		"\2\2\u00a8\u04b4\3\2\2\2\u00aa\u04b7\3\2\2\2\u00ac\u04d7\3\2\2\2\u00ae"+
		"\u04d9\3\2\2\2\u00b0\u04e3\3\2\2\2\u00b2\u04e9\3\2\2\2\u00b4\u04f0\3\2"+
		"\2\2\u00b6\u04fc\3\2\2\2\u00b8\u0500\3\2\2\2\u00ba\u0502\3\2\2\2\u00bc"+
		"\u0508\3\2\2\2\u00be\u050e\3\2\2\2\u00c0\u0515\3\2\2\2\u00c2\u051b\3\2"+
		"\2\2\u00c4\u0522\3\2\2\2\u00c6\u0528\3\2\2\2\u00c8\u052e\3\2\2\2\u00ca"+
		"\u0534\3\2\2\2\u00cc\u053a\3\2\2\2\u00ce\u0542\3\2\2\2\u00d0\u0548\3\2"+
		"\2\2\u00d2\u054e\3\2\2\2\u00d4\u0554\3\2\2\2\u00d6\u055a\3\2\2\2\u00d8"+
		"\u0560\3\2\2\2\u00da\u0563\3\2\2\2\u00dc\u0566\3\2\2\2\u00de\u057b\3\2"+
		"\2\2\u00e0\u057d\3\2\2\2\u00e2\u058c\3\2\2\2\u00e4\u059f\3\2\2\2\u00e6"+
		"\u05b2\3\2\2\2\u00e8\u05c1\3\2\2\2\u00ea\u05cc\3\2\2\2\u00ec\u05d1\3\2"+
		"\2\2\u00ee\u05d3\3\2\2\2\u00f0\u05dc\3\2\2\2\u00f2\u05de\3\2\2\2\u00f4"+
		"\u05e0\3\2\2\2\u00f6\u05ed\3\2\2\2\u00f8\u05ef\3\2\2\2\u00fa\u05f3\3\2"+
		"\2\2\u00fc\u05fb\3\2\2\2\u00fe\u0602\3\2\2\2\u0100\u0607\3\2\2\2\u0102"+
		"\u060b\3\2\2\2\u0104\u060d\3\2\2\2\u0106\u061e\3\2\2\2\u0108\u0620\3\2"+
		"\2\2\u010a\u0624\3\2\2\2\u010c\u062e\3\2\2\2\u010e\u0630\3\2\2\2\u0110"+
		"\u0637\3\2\2\2\u0112\u064d\3\2\2\2\u0114\u064f\3\2\2\2\u0116\u0652\3\2"+
		"\2\2\u0118\u065c\3\2\2\2\u011a\u0660\3\2\2\2\u011c\u066a\3\2\2\2\u011e"+
		"\u0678\3\2\2\2\u0120\u0695\3\2\2\2\u0122\u0124\5\4\3\2\u0123\u0122\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\2\2\3\u0126"+
		"\3\3\2\2\2\u0127\u0133\5\66\34\2\u0128\u0133\5\u011a\u008e\2\u0129\u0133"+
		"\5\u009cO\2\u012a\u0133\5\u00a0Q\2\u012b\u0133\5\u00a2R\2\u012c\u0133"+
		"\5\u011c\u008f\2\u012d\u0133\5\u010e\u0088\2\u012e\u0133\5\u0110\u0089"+
		"\2\u012f\u0133\5\u011e\u0090\2\u0130\u0133\5\u0116\u008c\2\u0131\u0133"+
		"\7\27\2\2\u0132\u0127\3\2\2\2\u0132\u0128\3\2\2\2\u0132\u0129\3\2\2\2"+
		"\u0132\u012a\3\2\2\2\u0132\u012b\3\2\2\2\u0132\u012c\3\2\2\2\u0132\u012d"+
		"\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\5\3\2\2\2\u0134\u0135\t\2\2\2\u0135\7\3\2\2\2\u0136"+
		"\u0137\t\3\2\2\u0137\t\3\2\2\2\u0138\u0139\t\4\2\2\u0139\13\3\2\2\2\u013a"+
		"\u013b\5\24\13\2\u013b\r\3\2\2\2\u013c\u013d\5\f\7\2\u013d\u013e\7\4\2"+
		"\2\u013e\u013f\5\26\f\2\u013f\u0144\3\2\2\2\u0140\u0141\7\4\2\2\u0141"+
		"\u0144\5\24\13\2\u0142\u0144\5\24\13\2\u0143\u013c\3\2\2\2\u0143\u0140"+
		"\3\2\2\2\u0143\u0142\3\2\2\2\u0144\17\3\2\2\2\u0145\u0148\5\22\n\2\u0146"+
		"\u0147\7\5\2\2\u0147\u0149\5\22\n\2\u0148\u0146\3\2\2\2\u0148\u0149\3"+
		"\2\2\2\u0149\21\3\2\2\2\u014a\u014e\7\u00ea\2\2\u014b\u014e\7\u00eb\2"+
		"\2\u014c\u014e\5\"\22\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014e\23\3\2\2\2\u014f\u0154\5\30\r\2\u0150\u0154\5\6\4"+
		"\2\u0151\u0154\7\u00e9\2\2\u0152\u0154\7\u00e8\2\2\u0153\u014f\3\2\2\2"+
		"\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\25"+
		"\3\2\2\2\u0155\u015a\5\30\r\2\u0156\u015a\5\b\5\2\u0157\u015a\7\u00e9"+
		"\2\2\u0158\u015a\7\u00e8\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\27\3\2\2\2\u015b\u015c\t\5\2"+
		"\2\u015c\31\3\2\2\2\u015d\u0165\5\36\20\2\u015e\u0165\5 \21\2\u015f\u0165"+
		"\5\"\22\2\u0160\u0165\5$\23\2\u0161\u0165\7\u0090\2\2\u0162\u0165\7\u00cc"+
		"\2\2\u0163\u0165\7N\2\2\u0164\u015d\3\2\2\2\u0164\u015e\3\2\2\2\u0164"+
		"\u015f\3\2\2\2\u0164\u0160\3\2\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0164\u0163\3\2\2\2\u0165\33\3\2\2\2\u0166\u0172\5\36\20\2\u0167"+
		"\u0172\5 \21\2\u0168\u016a\5\"\22\2\u0169\u0168\3\2\2\2\u016a\u016b\3"+
		"\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0172\3\2\2\2\u016d"+
		"\u0172\5$\23\2\u016e\u0172\7\u0090\2\2\u016f\u0172\7\u00cc\2\2\u0170\u0172"+
		"\7N\2\2\u0171\u0166\3\2\2\2\u0171\u0167\3\2\2\2\u0171\u0169\3\2\2\2\u0171"+
		"\u016d\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2"+
		"\2\2\u0172\35\3\2\2\2\u0173\u0175\t\6\2\2\u0174\u0173\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0178\7\u00e9\2\2\u0177\u0176\3\2\2"+
		"\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\4\2\2\u017a\u017b"+
		"\7\u00e9\2\2\u017b\37\3\2\2\2\u017c\u017e\t\6\2\2\u017d\u017c\3\2\2\2"+
		"\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7\u00e9\2\2\u0180"+
		"!\3\2\2\2\u0181\u0182\t\7\2\2\u0182#\3\2\2\2\u0183\u0187\7\u00ea\2\2\u0184"+
		"\u0185\7\u00e7\2\2\u0185\u0187\7\u00e9\2\2\u0186\u0183\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0187%\3\2\2\2\u0188\u0189\t\b\2\2\u0189\'\3\2\2\2\u018a\u018b"+
		"\7\u00e9\2\2\u018b)\3\2\2\2\u018c\u0193\7\u00ea\2\2\u018d\u0193\5\"\22"+
		"\2\u018e\u0193\7\u00eb\2\2\u018f\u0193\7\31\2\2\u0190\u0193\7\24\2\2\u0191"+
		"\u0193\7<\2\2\u0192\u018c\3\2\2\2\u0192\u018d\3\2\2\2\u0192\u018e\3\2"+
		"\2\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193"+
		"+\3\2\2\2\u0194\u0196\7<\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0199\5\60\31\2\u0198\u019a\7\b\2\2\u0199\u0198\3"+
		"\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\5*\26\2\u019c"+
		"\u019e\5\62\32\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e-\3\2\2"+
		"\2\u019f\u01a1\7<\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a3\5\62\32\2\u01a3/\3\2\2\2\u01a4\u01aa\7%\2\2\u01a5"+
		"\u01a6\7$\2\2\u01a6\u01aa\7\u00b3\2\2\u01a7\u01a8\7#\2\2\u01a8\u01aa\7"+
		"\u00b3\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a7\3\2\2\2"+
		"\u01aa\61\3\2\2\2\u01ab\u01ad\7)\2\2\u01ac\u01ae\7\b\2\2\u01ad\u01ac\3"+
		"\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b3\3\2\2\2\u01af\u01b4\7\u00ea\2\2"+
		"\u01b0\u01b4\5\"\22\2\u01b1\u01b4\7\u00eb\2\2\u01b2\u01b4\7<\2\2\u01b3"+
		"\u01af\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2"+
		"\2\2\u01b4\63\3\2\2\2\u01b5\u01b6\7\\\2\2\u01b6\u01b7\7\u008e\2\2\u01b7"+
		"\u01b8\7M\2\2\u01b8\65\3\2\2\2\u01b9\u01ba\58\35\2\u01ba\u01bc\5<\37\2"+
		"\u01bb\u01bd\5T+\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\67\3"+
		"\2\2\2\u01be\u01c0\7\17\2\2\u01bf\u01c1\5:\36\2\u01c0\u01bf\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7\u00c1\2\2\u01c3\u01c4"+
		"\5\16\b\2\u01c49\3\2\2\2\u01c5\u01c6\t\t\2\2\u01c6;\3\2\2\2\u01c7\u01cc"+
		"\5> \2\u01c8\u01c9\7\t\2\2\u01c9\u01cb\5> \2\u01ca\u01c8\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd=\3\2\2\2"+
		"\u01ce\u01cc\3\2\2\2\u01cf\u01e1\5@!\2\u01d0\u01e1\5B\"\2\u01d1\u01e1"+
		"\5D#\2\u01d2\u01e1\5F$\2\u01d3\u01e1\5H%\2\u01d4\u01e1\5R*\2\u01d5\u01e1"+
		"\5J&\2\u01d6\u01e1\5L\'\2\u01d7\u01e1\5N(\2\u01d8\u01e1\5P)\2\u01d9\u01e1"+
		"\5,\27\2\u01da\u01dc\5\u00acW\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2"+
		"\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01e1"+
		"\5V,\2\u01e0\u01cf\3\2\2\2\u01e0\u01d0\3\2\2\2\u01e0\u01d1\3\2\2\2\u01e0"+
		"\u01d2\3\2\2\2\u01e0\u01d3\3\2\2\2\u01e0\u01d4\3\2\2\2\u01e0\u01d5\3\2"+
		"\2\2\u01e0\u01d6\3\2\2\2\u01e0\u01d7\3\2\2\2\u01e0\u01d8\3\2\2\2\u01e0"+
		"\u01d9\3\2\2\2\u01e0\u01db\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1?\3\2\2\2"+
		"\u01e2\u01e4\7\f\2\2\u01e3\u01e5\7*\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\5d\63\2\u01e7\u01e9\5f\64\2\u01e8"+
		"\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9A\3\2\2\2\u01ea\u01ec\7\f\2\2"+
		"\u01eb\u01ed\7*\2\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01f1\7\3\2\2\u01ef\u01f2\5d\63\2\u01f0\u01f2\5\u00dep"+
		"\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01fa\3\2\2\2\u01f3\u01f6"+
		"\7\t\2\2\u01f4\u01f7\5d\63\2\u01f5\u01f7\5\u00dep\2\u01f6\u01f4\3\2\2"+
		"\2\u01f6\u01f5\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f3\3\2\2\2\u01f9\u01fc"+
		"\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fd\u01fe\7\n\2\2\u01feC\3\2\2\2\u01ff\u0201\7\"\2\2"+
		"\u0200\u0202\7*\2\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0204\5b\62\2\u0204\u0206\5d\63\2\u0205\u0207\5f\64\2\u0206"+
		"\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207E\3\2\2\2\u0208\u020a\7F\2\2\u0209"+
		"\u020b\7*\2\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020e\5b\62\2\u020d\u020f\7!\2\2\u020e\u020d\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020fG\3\2\2\2\u0210\u0212\7\u0085\2\2\u0211\u0213\7*\2"+
		"\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216"+
		"\5d\63\2\u0215\u0217\5f\64\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"I\3\2\2\2\u0218\u021a\7F\2\2\u0219\u021b\7U\2\2\u021a\u0219\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\t\n\2\2\u021d\u021e\5\24"+
		"\13\2\u021eK\3\2\2\2\u021f\u0220\7F\2\2\u0220\u0221\7\u00a3\2\2\u0221"+
		"\u0222\7n\2\2\u0222M\3\2\2\2\u0223\u0225\7\u00aa\2\2\u0224\u0226\t\13"+
		"\2\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0228\5\16\b\2\u0228O\3\2\2\2\u0229\u022a\7\62\2\2\u022a\u022b\7\u00cb"+
		"\2\2\u022b\u022c\5\60\31\2\u022c\u022e\5*\26\2\u022d\u022f\5\62\32\2\u022e"+
		"\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022fQ\3\2\2\2\u0230\u0231\7\u00aa"+
		"\2\2\u0231\u0232\7*\2\2\u0232\u0233\5\24\13\2\u0233\u0234\7\u00cb\2\2"+
		"\u0234\u0235\5\24\13\2\u0235S\3\2\2\2\u0236\u0237\7\f\2\2\u0237\u0238"+
		"\7\u009c\2\2\u0238\u0273\5\n\6\2\u0239\u023a\7F\2\2\u023a\u023b\7\u009c"+
		"\2\2\u023b\u0273\5\\/\2\u023c\u023d\7\u00cd\2\2\u023d\u023e\7\u009c\2"+
		"\2\u023e\u0273\5\\/\2\u023f\u0240\7C\2\2\u0240\u0241\7\u009c\2\2\u0241"+
		"\u0242\5\\/\2\u0242\u0243\7\u00c2\2\2\u0243\u0273\3\2\2\2\u0244\u0245"+
		"\7^\2\2\u0245\u0246\7\u009c\2\2\u0246\u0247\5\\/\2\u0247\u0248\7\u00c2"+
		"\2\2\u0248\u0273\3\2\2\2\u0249\u024a\7(\2\2\u024a\u024b\7\u009c\2\2\u024b"+
		"\u0273\7\u00e9\2\2\u024c\u024d\7\u00ab\2\2\u024d\u0252\7\u009c\2\2\u024e"+
		"\u024f\5\\/\2\u024f\u0250\7j\2\2\u0250\u0251\5\n\6\2\u0251\u0253\3\2\2"+
		"\2\u0252\u024e\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0273\3\2\2\2\u0254\u0255"+
		"\7K\2\2\u0255\u0256\7\u009c\2\2\u0256\u0257\7\u00ea\2\2\u0257\u0258\7"+
		"\u00dd\2\2\u0258\u0259\7\u00c1\2\2\u0259\u025c\5\16\b\2\u025a\u025b\t"+
		"\f\2\2\u025b\u025d\7\u00d6\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2"+
		"\u025d\u0273\3\2\2\2\u025e\u025f\7\21\2\2\u025f\u0260\7\u009c\2\2\u0260"+
		"\u0273\5\\/\2\u0261\u0262\7&\2\2\u0262\u0263\7\u009c\2\2\u0263\u0273\5"+
		"\\/\2\u0264\u0265\7\u0096\2\2\u0265\u0266\7\u009c\2\2\u0266\u0273\5\\"+
		"/\2\u0267\u0268\7\u00a6\2\2\u0268\u0269\7\u009c\2\2\u0269\u0273\5\\/\2"+
		"\u026a\u026b\7\u00ac\2\2\u026b\u026c\7\u009c\2\2\u026c\u0273\5\\/\2\u026d"+
		"\u026e\7\u00a9\2\2\u026e\u0273\7\u009d\2\2\u026f\u0270\7\u00d4\2\2\u0270"+
		"\u0273\7\u009d\2\2\u0271\u0273\5\u0090I\2\u0272\u0236\3\2\2\2\u0272\u0239"+
		"\3\2\2\2\u0272\u023c\3\2\2\2\u0272\u023f\3\2\2\2\u0272\u0244\3\2\2\2\u0272"+
		"\u0249\3\2\2\2\u0272\u024c\3\2\2\2\u0272\u0254\3\2\2\2\u0272\u025e\3\2"+
		"\2\2\u0272\u0261\3\2\2\2\u0272\u0264\3\2\2\2\u0272\u0267\3\2\2\2\u0272"+
		"\u026a\3\2\2\2\u0272\u026d\3\2\2\2\u0272\u026f\3\2\2\2\u0272\u0271\3\2"+
		"\2\2\u0273U\3\2\2\2\u0274\u0275\7\f\2\2\u0275\u02ae\5\u00dep\2\u0276\u0277"+
		"\7\17\2\2\u0277\u0278\7_\2\2\u0278\u0279\5\24\13\2\u0279\u027a\t\r\2\2"+
		"\u027a\u02ae\3\2\2\2\u027b\u027d\7\17\2\2\u027c\u027e\7*\2\2\u027d\u027c"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0285\5\24\13\2"+
		"\u0280\u0281\7\u00b3\2\2\u0281\u0282\7<\2\2\u0282\u0286\5\32\16\2\u0283"+
		"\u0284\7F\2\2\u0284\u0286\7<\2\2\u0285\u0280\3\2\2\2\u0285\u0283\3\2\2"+
		"\2\u0286\u02ae\3\2\2\2\u0287\u0288\7F\2\2\u0288\u0289\7_\2\2\u0289\u02ae"+
		"\5\u00f2z\2\u028a\u028b\7B\2\2\u028b\u02ae\7o\2\2\u028c\u028d\7H\2\2\u028d"+
		"\u02ae\7o\2\2\u028e\u028f\7\u0098\2\2\u028f\u0290\7\37\2\2\u0290\u0295"+
		"\5^\60\2\u0291\u0292\7\t\2\2\u0292\u0294\5^\60\2\u0293\u0291\3\2\2\2\u0294"+
		"\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u02ae\3\2"+
		"\2\2\u0297\u0295\3\2\2\2\u0298\u02ae\7T\2\2\u0299\u029a\7C\2\2\u029a\u02ae"+
		"\7\u00c2\2\2\u029b\u029c\7^\2\2\u029c\u02ae\7\u00c2\2\2\u029d\u029f\7"+
		"\16\2\2\u029e\u02a0\7\b\2\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02ae\5X-\2\u02a2\u02a4\7x\2\2\u02a3\u02a5\7\b\2"+
		"\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02ae"+
		"\5Z.\2\u02a7\u02a8\7\u00aa\2\2\u02a8\u02a9\t\n\2\2\u02a9\u02aa\5\24\13"+
		"\2\u02aa\u02ab\7\u00cb\2\2\u02ab\u02ac\5\24\13\2\u02ac\u02ae\3\2\2\2\u02ad"+
		"\u0274\3\2\2\2\u02ad\u0276\3\2\2\2\u02ad\u027b\3\2\2\2\u02ad\u0287\3\2"+
		"\2\2\u02ad\u028a\3\2\2\2\u02ad\u028c\3\2\2\2\u02ad\u028e\3\2\2\2\u02ad"+
		"\u0298\3\2\2\2\u02ad\u0299\3\2\2\2\u02ad\u029b\3\2\2\2\u02ad\u029d\3\2"+
		"\2\2\u02ad\u02a2\3\2\2\2\u02ad\u02a7\3\2\2\2\u02aeW\3\2\2\2\u02af\u02b0"+
		"\t\16\2\2\u02b0Y\3\2\2\2\u02b1\u02b2\t\17\2\2\u02b2[\3\2\2\2\u02b3\u02b8"+
		"\5\30\r\2\u02b4\u02b5\7\t\2\2\u02b5\u02b7\5\30\r\2\u02b6\u02b4\3\2\2\2"+
		"\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9]\3"+
		"\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bd\5`\61\2\u02bc\u02be\t\20\2\2\u02bd"+
		"\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be_\3\2\2\2\u02bf\u02c0\5\24\13"+
		"\2\u02c0\u02c1\7\4\2\2\u02c1\u02c2\5\24\13\2\u02c2\u02c3\7\4\2\2\u02c3"+
		"\u02c4\5\24\13\2\u02c4\u02cb\3\2\2\2\u02c5\u02c6\5\24\13\2\u02c6\u02c7"+
		"\7\4\2\2\u02c7\u02c8\5\24\13\2\u02c8\u02cb\3\2\2\2\u02c9\u02cb\5\24\13"+
		"\2\u02ca\u02bf\3\2\2\2\u02ca\u02c5\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cba"+
		"\3\2\2\2\u02cc\u02d8\5\24\13\2\u02cd\u02ce\5\24\13\2\u02ce\u02cf\7\4\2"+
		"\2\u02cf\u02d0\5\24\13\2\u02d0\u02d8\3\2\2\2\u02d1\u02d2\5\24\13\2\u02d2"+
		"\u02d3\7\4\2\2\u02d3\u02d4\5\24\13\2\u02d4\u02d5\7\4\2\2\u02d5\u02d6\5"+
		"\24\13\2\u02d6\u02d8\3\2\2\2\u02d7\u02cc\3\2\2\2\u02d7\u02cd\3\2\2\2\u02d7"+
		"\u02d1\3\2\2\2\u02d8c\3\2\2\2\u02d9\u02e5\5\24\13\2\u02da\u02db\5\24\13"+
		"\2\u02db\u02dc\7\4\2\2\u02dc\u02dd\5\24\13\2\u02dd\u02e5\3\2\2\2\u02de"+
		"\u02df\5\24\13\2\u02df\u02e0\7\4\2\2\u02e0\u02e1\5\24\13\2\u02e1\u02e2"+
		"\7\4\2\2\u02e2\u02e3\5\24\13\2\u02e3\u02e5\3\2\2\2\u02e4\u02d9\3\2\2\2"+
		"\u02e4\u02da\3\2\2\2\u02e4\u02de\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7"+
		"\5h\65\2\u02e7e\3\2\2\2\u02e8\u02ec\7O\2\2\u02e9\u02ea\7\r\2\2\u02ea\u02ec"+
		"\5\24\13\2\u02eb\u02e8\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ecg\3\2\2\2\u02ed"+
		"\u02f2\5j\66\2\u02ee\u02f2\5l\67\2\u02ef\u02f2\5n8\2\u02f0\u02f2\5r:\2"+
		"\u02f1\u02ed\3\2\2\2\u02f1\u02ee\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f0"+
		"\3\2\2\2\u02f2i\3\2\2\2\u02f3\u02f5\t\21\2\2\u02f4\u02f6\5\u0084C\2\u02f5"+
		"\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02fa\3\2\2\2\u02f7\u02f9\5t"+
		";\2\u02f8\u02f7\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u031b\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u0301\t\22"+
		"\2\2\u02fe\u0300\5t;\2\u02ff\u02fe\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u031b\3\2\2\2\u0303\u0301\3\2\2\2\u0304"+
		"\u0308\t\23\2\2\u0305\u0307\5t;\2\u0306\u0305\3\2\2\2\u0307\u030a\3\2"+
		"\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u031b\3\2\2\2\u030a"+
		"\u0308\3\2\2\2\u030b\u030f\7m\2\2\u030c\u030e\5t;\2\u030d\u030c\3\2\2"+
		"\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u031b"+
		"\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0313\7\u00d7\2\2\u0313\u0317\5\u0084"+
		"C\2\u0314\u0316\5t;\2\u0315\u0314\3\2\2\2\u0316\u0319\3\2\2\2\u0317\u0315"+
		"\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u031a"+
		"\u02f3\3\2\2\2\u031a\u02fd\3\2\2\2\u031a\u0304\3\2\2\2\u031a\u030b\3\2"+
		"\2\2\u031a\u0312\3\2\2\2\u031bk\3\2\2\2\u031c\u031e\t\24\2\2\u031d\u031f"+
		"\5\u0084C\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0323\3\2\2"+
		"\2\u0320\u0322\5\u0086D\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2\2\2\u0323"+
		"\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0329\3\2\2\2\u0325\u0323\3\2"+
		"\2\2\u0326\u0328\5t;\2\u0327\u0326\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327"+
		"\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0357\3\2\2\2\u032b\u0329\3\2\2\2\u032c"+
		"\u032e\t\25\2\2\u032d\u032f\5\u0088E\2\u032e\u032d\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u0333\3\2\2\2\u0330\u0332\5\u0086D\2\u0331\u0330\3\2\2"+
		"\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0339"+
		"\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0338\5t;\2\u0337\u0336\3\2\2\2\u0338"+
		"\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u0357\3\2"+
		"\2\2\u033b\u0339\3\2\2\2\u033c\u033e\7E\2\2\u033d\u033f\7\u00a2\2\2\u033e"+
		"\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u0342\5\u0088"+
		"E\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0346\3\2\2\2\u0343"+
		"\u0345\5\u0086D\2\u0344\u0343\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344"+
		"\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u034c\3\2\2\2\u0348\u0346\3\2\2\2\u0349"+
		"\u034b\5t;\2\u034a\u0349\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2"+
		"\2\u034c\u034d\3\2\2\2\u034d\u0357\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0353"+
		"\7\u00b2\2\2\u0350\u0352\5t;\2\u0351\u0350\3\2\2\2\u0352\u0355\3\2\2\2"+
		"\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353"+
		"\3\2\2\2\u0356\u031c\3\2\2\2\u0356\u032c\3\2\2\2\u0356\u033c\3\2\2\2\u0356"+
		"\u034f\3\2\2\2\u0357m\3\2\2\2\u0358\u0359\7\u008a\2\2\u0359\u035b\b8\1"+
		"\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e"+
		"\t\26\2\2\u035d\u035f\5\u0084C\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2"+
		"\2\u035f\u0365\3\2\2\2\u0360\u0364\5t;\2\u0361\u0364\7 \2\2\u0362\u0364"+
		"\7\u00cf\2\2\u0363\u0360\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0362\3\2\2"+
		"\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u03be"+
		"\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u0369\7\u008a\2\2\u0369\u036b\b8\1"+
		"\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d"+
		"\t\27\2\2\u036d\u036e\7\u00d9\2\2\u036e\u0374\5\u0084C\2\u036f\u0373\5"+
		"t;\2\u0370\u0373\7 \2\2\u0371\u0373\7\u00cf\2\2\u0372\u036f\3\2\2\2\u0372"+
		"\u0370\3\2\2\2\u0372\u0371\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2"+
		"\2\2\u0374\u0375\3\2\2\2\u0375\u03be\3\2\2\2\u0376\u0374\3\2\2\2\u0377"+
		"\u0379\t\30\2\2\u0378\u037a\5\u0084C\2\u0379\u0378\3\2\2\2\u0379\u037a"+
		"\3\2\2\2\u037a\u037e\3\2\2\2\u037b\u037d\5t;\2\u037c\u037b\3\2\2\2\u037d"+
		"\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2"+
		"\2\2\u0380\u037e\3\2\2\2\u0381\u03be\b8\1\2\u0382\u0383\7\u008b\2\2\u0383"+
		"\u0385\7\u00d8\2\2\u0384\u0386\5\u0084C\2\u0385\u0384\3\2\2\2\u0385\u0386"+
		"\3\2\2\2\u0386\u038a\3\2\2\2\u0387\u0389\5t;\2\u0388\u0387\3\2\2\2\u0389"+
		"\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2"+
		"\2\2\u038c\u038a\3\2\2\2\u038d\u03be\b8\1\2\u038e\u0394\t\31\2\2\u038f"+
		"\u0393\5t;\2\u0390\u0393\7 \2\2\u0391\u0393\7\u00cf\2\2\u0392\u038f\3"+
		"\2\2\2\u0392\u0390\3\2\2\2\u0392\u0391\3\2\2\2\u0393\u0396\3\2\2\2\u0394"+
		"\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u03be\3\2\2\2\u0396\u0394\3\2"+
		"\2\2\u0397\u0399\7\u00c5\2\2\u0398\u039a\5\u0084C\2\u0399\u0398\3\2\2"+
		"\2\u0399\u039a\3\2\2\2\u039a\u03a0\3\2\2\2\u039b\u039f\5t;\2\u039c\u039f"+
		"\7 \2\2\u039d\u039f\7\u00cf\2\2\u039e\u039b\3\2\2\2\u039e\u039c\3\2\2"+
		"\2\u039e\u039d\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1"+
		"\3\2\2\2\u03a1\u03be\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03a4\5p9\2\u03a4"+
		"\u03a9\t\32\2\2\u03a5\u03a8\5t;\2\u03a6\u03a8\7\u00cf\2\2\u03a7\u03a5"+
		"\3\2\2\2\u03a7\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9"+
		"\u03aa\3\2\2\2\u03aa\u03be\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03ad\5p"+
		"9\2\u03ad\u03b1\7\u00d7\2\2\u03ae\u03b0\5t;\2\u03af\u03ae\3\2\2\2\u03b0"+
		"\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03be\3\2"+
		"\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03ba\7y\2\2\u03b5\u03b9\5t;\2\u03b6\u03b9"+
		"\7 \2\2\u03b7\u03b9\7\u00cf\2\2\u03b8\u03b5\3\2\2\2\u03b8\u03b6\3\2\2"+
		"\2\u03b8\u03b7\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb"+
		"\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u035a\3\2\2\2\u03bd"+
		"\u036a\3\2\2\2\u03bd\u0377\3\2\2\2\u03bd\u0382\3\2\2\2\u03bd\u038e\3\2"+
		"\2\2\u03bd\u0397\3\2\2\2\u03bd\u03a3\3\2\2\2\u03bd\u03ac\3\2\2\2\u03bd"+
		"\u03b4\3\2\2\2\u03beo\3\2\2\2\u03bf\u03c0\7y\2\2\u03c0q\3\2\2\2\u03c1"+
		"\u03c2\t\33\2\2\u03c2\u03c3\7\3\2\2\u03c3\u03c4\5x=\2\u03c4\u03c8\7\n"+
		"\2\2\u03c5\u03c7\5t;\2\u03c6\u03c5\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6"+
		"\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9s\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb"+
		"\u03f1\5\u0080A\2\u03cc\u03f1\5|?\2\u03cd\u03f1\5\62\32\2\u03ce\u03f1"+
		"\5\u0082B\2\u03cf\u03f1\5v<\2\u03d0\u03d1\7\u0094\2\2\u03d1\u03d7\7\u00d3"+
		"\2\2\u03d2\u03d4\7\65\2\2\u03d3\u03d5\5\u008cG\2\u03d4\u03d3\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6\u03d8\5\u008aF\2\u03d7\u03d2"+
		"\3\2\2\2\u03d7\u03d6\3\2\2\2\u03d8\u03f1\3\2\2\2\u03d9\u03db\7\u00d1\2"+
		"\2\u03da\u03dc\7n\2\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03f1"+
		"\3\2\2\2\u03dd\u03f1\7n\2\2\u03de\u03f1\7\25\2\2\u03df\u03f1\7\31\2\2"+
		"\u03e0\u03e1\7-\2\2\u03e1\u03f1\5\"\22\2\u03e2\u03e3\7,\2\2\u03e3\u03f1"+
		"\t\34\2\2\u03e4\u03e5\7\u00bd\2\2\u03e5\u03f1\t\35\2\2\u03e6\u03f1\t\36"+
		"\2\2\u03e7\u03e8\7X\2\2\u03e8\u03ea\7\20\2\2\u03e9\u03e7\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\7\22\2\2\u03ec\u03f1\5"+
		"\n\6\2\u03ed\u03f1\5\u0104\u0083\2\u03ee\u03ef\7&\2\2\u03ef\u03f1\5\n"+
		"\6\2\u03f0\u03cb\3\2\2\2\u03f0\u03cc\3\2\2\2\u03f0\u03cd\3\2\2\2\u03f0"+
		"\u03ce\3\2\2\2\u03f0\u03cf\3\2\2\2\u03f0\u03d0\3\2\2\2\u03f0\u03d9\3\2"+
		"\2\2\u03f0\u03dd\3\2\2\2\u03f0\u03de\3\2\2\2\u03f0\u03df\3\2\2\2\u03f0"+
		"\u03e0\3\2\2\2\u03f0\u03e2\3\2\2\2\u03f0\u03e4\3\2\2\2\u03f0\u03e6\3\2"+
		"\2\2\u03f0\u03e9\3\2\2\2\u03f0\u03ed\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1"+
		"u\3\2\2\2\u03f2\u03f3\7\u00a3\2\2\u03f3\u03f4\7n\2\2\u03f4w\3\2\2\2\u03f5"+
		"\u03fa\5z>\2\u03f6\u03f7\7\t\2\2\u03f7\u03f9\5z>\2\u03f8\u03f6\3\2\2\2"+
		"\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fby\3"+
		"\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u03fe\5\"\22\2\u03fe{\3\2\2\2\u03ff\u0402"+
		"\5~@\2\u0400\u0402\7\24\2\2\u0401\u03ff\3\2\2\2\u0401\u0400\3\2\2\2\u0402"+
		"}\3\2\2\2\u0403\u0404\7$\2\2\u0404\u0407\7\u00b3\2\2\u0405\u0407\7%\2"+
		"\2\u0406\u0403\3\2\2\2\u0406\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409"+
		"\5*\26\2\u0409\177\3\2\2\2\u040a\u040b\7\u008e\2\2\u040b\u040e\7\u0090"+
		"\2\2\u040c\u040e\7\u0090\2\2\u040d\u040a\3\2\2\2\u040d\u040c\3\2\2\2\u040e"+
		"\u0081\3\2\2\2\u040f\u0411\7<\2\2\u0410\u0412\7\3\2\2\u0411\u0410\3\2"+
		"\2\2\u0411\u0412\3\2\2\2\u0412\u041a\3\2\2\2\u0413\u041b\5\34\17\2\u0414"+
		"\u0416\7\65\2\2\u0415\u0417\5\u008cG\2\u0416\u0415\3\2\2\2\u0416\u0417"+
		"\3\2\2\2\u0417\u041b\3\2\2\2\u0418\u041b\5\u008aF\2\u0419\u041b\5\u008e"+
		"H\2\u041a\u0413\3\2\2\2\u041a\u0414\3\2\2\2\u041a\u0418\3\2\2\2\u041a"+
		"\u0419\3\2\2\2\u041b\u041d\3\2\2\2\u041c\u041e\7\n\2\2\u041d\u041c\3\2"+
		"\2\2\u041d\u041e\3\2\2\2\u041e\u0083\3\2\2\2\u041f\u0420\7\3\2\2\u0420"+
		"\u0421\7\u00e9\2\2\u0421\u0422\7\n\2\2\u0422\u0085\3\2\2\2\u0423\u0424"+
		"\t\37\2\2\u0424\u0087\3\2\2\2\u0425\u0426\7\3\2\2\u0426\u0429\7\u00e9"+
		"\2\2\u0427\u0428\7\t\2\2\u0428\u042a\7\u00e9\2\2\u0429\u0427\3\2\2\2\u0429"+
		"\u042a\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\7\n\2\2\u042c\u0089\3\2"+
		"\2\2\u042d\u042e\7\u008f\2\2\u042e\u042f\7\3\2\2\u042f\u0430\7\n\2\2\u0430"+
		"\u008b\3\2\2\2\u0431\u0435\5\u0084C\2\u0432\u0433\7\3\2\2\u0433\u0435"+
		"\7\n\2\2\u0434\u0431\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u008d\3\2\2\2\u0436"+
		"\u0439\t \2\2\u0437\u0438\7\3\2\2\u0438\u043a\7\n\2\2\u0439\u0437\3\2"+
		"\2\2\u0439\u043a\3\2\2\2\u043a\u008f\3\2\2\2\u043b\u043c\7\u009c\2\2\u043c"+
		"\u043d\7\37\2\2\u043d\u043f\5\u0092J\2\u043e\u0440\5\u0096L\2\u043f\u043e"+
		"\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0442\3\2\2\2\u0441\u0443\5\u0094K"+
		"\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0445\3\2\2\2\u0444\u0446"+
		"\5\u0098M\2\u0445\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0091\3\2\2"+
		"\2\u0447\u0449\7s\2\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a"+
		"\3\2\2\2\u044a\u044b\7[\2\2\u044b\u0461\5\n\6\2\u044c\u044e\7s\2\2\u044d"+
		"\u044c\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0453\7n"+
		"\2\2\u0450\u0451\7\16\2\2\u0451\u0452\7\b\2\2\u0452\u0454\7\u00e9\2\2"+
		"\u0453\u0450\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0461"+
		"\5\n\6\2\u0456\u0458\7\u00a4\2\2\u0457\u0459\7+\2\2\u0458\u0457\3\2\2"+
		"\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u0461\5\n\6\2\u045b\u045d"+
		"\7u\2\2\u045c\u045e\7+\2\2\u045d\u045c\3\2\2\2\u045d\u045e\3\2\2\2\u045e"+
		"\u045f\3\2\2\2\u045f\u0461\5\n\6\2\u0460\u0448\3\2\2\2\u0460\u044d\3\2"+
		"\2\2\u0460\u0456\3\2\2\2\u0460\u045b\3\2\2\2\u0461\u0093\3\2\2\2\u0462"+
		"\u0463\7\u00bf\2\2\u0463\u0464\7\37\2\2\u0464\u0467\5\u0092J\2\u0465\u0466"+
		"\7\u00c0\2\2\u0466\u0468\7\u00e9\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3"+
		"\2\2\2\u0468\u0095\3\2\2\2\u0469\u046a\7\u009e\2\2\u046a\u046b\7\u00e9"+
		"\2\2\u046b\u0097\3\2\2\2\u046c\u046d\7\3\2\2\u046d\u046e\5\u009aN\2\u046e"+
		"\u0099\3\2\2\2\u046f\u0470\t!\2\2\u0470\u009b\3\2\2\2\u0471\u0472\7\17"+
		"\2\2\u0472\u0473\t\"\2\2\u0473\u0474\5\24\13\2\u0474\u0475\5\u009eP\2"+
		"\u0475\u009d\3\2\2\2\u0476\u0479\5,\27\2\u0477\u0479\5.\30\2\u0478\u0476"+
		"\3\2\2\2\u0478\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u0478\3\2\2\2\u047a"+
		"\u047b\3\2\2\2\u047b\u0481\3\2\2\2\u047c\u047d\7\u00d4\2\2\u047d\u047e"+
		"\7\67\2\2\u047e\u047f\7A\2\2\u047f\u0481\7\u0089\2\2\u0480\u0478\3\2\2"+
		"\2\u0480\u047c\3\2\2\2\u0481\u009f\3\2\2\2\u0482\u0483\7\64\2\2\u0483"+
		"\u0485\t\"\2\2\u0484\u0486\5\64\33\2\u0485\u0484\3\2\2\2\u0485\u0486\3"+
		"\2\2\2\u0486\u0487\3\2\2\2\u0487\u048c\5\24\13\2\u0488\u048b\5,\27\2\u0489"+
		"\u048b\5.\30\2\u048a\u0488\3\2\2\2\u048a\u0489\3\2\2\2\u048b\u048e\3\2"+
		"\2\2\u048c\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u00a1\3\2\2\2\u048e"+
		"\u048c\3\2\2\2\u048f\u049b\5\u00a4S\2\u0490\u0497\5\u00a6T\2\u0491\u0493"+
		"\5\u00acW\2\u0492\u0494\7\t\2\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2"+
		"\2\u0494\u0496\3\2\2\2\u0495\u0491\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0495"+
		"\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049c\3\2\2\2\u0499\u0497\3\2\2\2\u049a"+
		"\u049c\5\u00aaV\2\u049b\u0490\3\2\2\2\u049b\u049a\3\2\2\2\u049c\u00a3"+
		"\3\2\2\2\u049d\u049f\7\64\2\2\u049e\u04a0\7\u00c3\2\2\u049f\u049e\3\2"+
		"\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a3\7\u00c1\2\2\u04a2"+
		"\u04a4\5\64\33\2\u04a3\u04a2\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3"+
		"\2\2\2\u04a5\u04a6\5\16\b\2\u04a6\u00a5\3\2\2\2\u04a7\u04a8\7\3\2\2\u04a8"+
		"\u04ad\5\u00a8U\2\u04a9\u04aa\7\t\2\2\u04aa\u04ac\5\u00a8U\2\u04ab\u04a9"+
		"\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04b0\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b1\7\n\2\2\u04b1\u00a7\3\2"+
		"\2\2\u04b2\u04b5\5d\63\2\u04b3\u04b5\5\u00dep\2\u04b4\u04b2\3\2\2\2\u04b4"+
		"\u04b3\3\2\2\2\u04b5\u00a9\3\2\2\2\u04b6\u04b8\7\3\2\2\u04b7\u04b6\3\2"+
		"\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\7r\2\2\u04ba"+
		"\u04bc\5\16\b\2\u04bb\u04bd\7\n\2\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3"+
		"\2\2\2\u04bd\u00ab\3\2\2\2\u04be\u04d8\5\u00aeX\2\u04bf\u04d8\5\u00b0"+
		"Y\2\u04c0\u04d8\5\u00b2Z\2\u04c1\u04d8\5\u00b4[\2\u04c2\u04d8\5\u00b6"+
		"\\\2\u04c3\u04d8\5\u00b8]\2\u04c4\u04d8\5\u00ba^\2\u04c5\u04d8\5\u00bc"+
		"_\2\u04c6\u04d8\5\u00be`\2\u04c7\u04d8\5\u00c0a\2\u04c8\u04d8\5\u00c2"+
		"b\2\u04c9\u04d8\5\u00c4c\2\u04ca\u04d8\5\u00c6d\2\u04cb\u04d8\5\u00c8"+
		"e\2\u04cc\u04d8\5\u00caf\2\u04cd\u04d8\5\u00ccg\2\u04ce\u04d8\5\u00ce"+
		"h\2\u04cf\u04d8\5\u00d0i\2\u04d0\u04d8\5\u00d2j\2\u04d1\u04d8\5\u00d4"+
		"k\2\u04d2\u04d8\5\u00d6l\2\u04d3\u04d8\5\u00d8m\2\u04d4\u04d8\5\u00da"+
		"n\2\u04d5\u04d8\5\u00dco\2\u04d6\u04d8\5\u0090I\2\u04d7\u04be\3\2\2\2"+
		"\u04d7\u04bf\3\2\2\2\u04d7\u04c0\3\2\2\2\u04d7\u04c1\3\2\2\2\u04d7\u04c2"+
		"\3\2\2\2\u04d7\u04c3\3\2\2\2\u04d7\u04c4\3\2\2\2\u04d7\u04c5\3\2\2\2\u04d7"+
		"\u04c6\3\2\2\2\u04d7\u04c7\3\2\2\2\u04d7\u04c8\3\2\2\2\u04d7\u04c9\3\2"+
		"\2\2\u04d7\u04ca\3\2\2\2\u04d7\u04cb\3\2\2\2\u04d7\u04cc\3\2\2\2\u04d7"+
		"\u04cd\3\2\2\2\u04d7\u04ce\3\2\2\2\u04d7\u04cf\3\2\2\2\u04d7\u04d0\3\2"+
		"\2\2\u04d7\u04d1\3\2\2\2\u04d7\u04d2\3\2\2\2\u04d7\u04d3\3\2\2\2\u04d7"+
		"\u04d4\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d6\3\2\2\2\u04d8\u00ad\3\2"+
		"\2\2\u04d9\u04db\7I\2\2\u04da\u04dc\7\b\2\2\u04db\u04da\3\2\2\2\u04db"+
		"\u04dc\3\2\2\2\u04dc\u04e1\3\2\2\2\u04dd\u04e2\5\30\r\2\u04de\u04e2\5"+
		"\"\22\2\u04df\u04e2\7\u0081\2\2\u04e0\u04e2\7\u0082\2\2\u04e1\u04dd\3"+
		"\2\2\2\u04e1\u04de\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e0\3\2\2\2\u04e2"+
		"\u00af\3\2\2\2\u04e3\u04e5\7\25\2\2\u04e4\u04e6\7\b\2\2\u04e5\u04e4\3"+
		"\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\5(\25\2\u04e8"+
		"\u00b1\3\2\2\2\u04e9\u04eb\7\26\2\2\u04ea\u04ec\7\b\2\2\u04eb\u04ea\3"+
		"\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\5(\25\2\u04ee"+
		"\u00b3\3\2\2\2\u04ef\u04f1\7<\2\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1\3\2"+
		"\2\2\u04f1\u04f5\3\2\2\2\u04f2\u04f3\7$\2\2\u04f3\u04f6\7\u00b3\2\2\u04f4"+
		"\u04f6\7%\2\2\u04f5\u04f2\3\2\2\2\u04f5\u04f4\3\2\2\2\u04f6\u04f8\3\2"+
		"\2\2\u04f7\u04f9\7\b\2\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u04fa\3\2\2\2\u04fa\u04fb\5*\26\2\u04fb\u00b5\3\2\2\2\u04fc\u04fd\7\'"+
		"\2\2\u04fd\u04fe\7\b\2\2\u04fe\u04ff\5(\25\2\u04ff\u00b7\3\2\2\2\u0500"+
		"\u0501\5.\30\2\u0501\u00b9\3\2\2\2\u0502\u0504\7-\2\2\u0503\u0505\7\b"+
		"\2\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"\u0507\5\"\22\2\u0507\u00bb\3\2\2\2\u0508\u050a\7\60\2\2\u0509\u050b\7"+
		"\b\2\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2\u050c"+
		"\u050d\5\"\22\2\u050d\u00bd\3\2\2\2\u050e\u050f\7\67\2\2\u050f\u0511\7"+
		"A\2\2\u0510\u0512\7\b\2\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"\u0513\3\2\2\2\u0513\u0514\5\"\22\2\u0514\u00bf\3\2\2\2\u0515\u0517\7"+
		">\2\2\u0516\u0518\7\b\2\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518"+
		"\u0519\3\2\2\2\u0519\u051a\5(\25\2\u051a\u00c1\3\2\2\2\u051b\u051c\7_"+
		"\2\2\u051c\u051e\7A\2\2\u051d\u051f\7\b\2\2\u051e\u051d\3\2\2\2\u051e"+
		"\u051f\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521\5\"\22\2\u0521\u00c3\3"+
		"\2\2\2\u0522\u0524\7a\2\2\u0523\u0525\7\b\2\2\u0524\u0523\3\2\2\2\u0524"+
		"\u0525\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\t#\2\2\u0527\u00c5\3\2"+
		"\2\2\u0528\u052a\7p\2\2\u0529\u052b\7\b\2\2\u052a\u0529\3\2\2\2\u052a"+
		"\u052b\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\5(\25\2\u052d\u00c7\3\2"+
		"\2\2\u052e\u0530\7}\2\2\u052f\u0531\7\b\2\2\u0530\u052f\3\2\2\2\u0530"+
		"\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\5(\25\2\u0533\u00c9\3\2"+
		"\2\2\u0534\u0536\7\u0084\2\2\u0535\u0537\7\b\2\2\u0536\u0535\3\2\2\2\u0536"+
		"\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\5(\25\2\u0539\u00cb\3\2"+
		"\2\2\u053a\u053c\7\u0099\2\2\u053b\u053d\7\b\2\2\u053c\u053b\3\2\2\2\u053c"+
		"\u053d\3\2\2\2\u053d\u0540\3\2\2\2\u053e\u0541\5(\25\2\u053f\u0541\7<"+
		"\2\2\u0540\u053e\3\2\2\2\u0540\u053f\3\2\2\2\u0541\u00cd\3\2\2\2\u0542"+
		"\u0544\7\u009f\2\2\u0543\u0545\7\b\2\2\u0544\u0543\3\2\2\2\u0544\u0545"+
		"\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\5\"\22\2\u0547\u00cf\3\2\2\2"+
		"\u0548\u054a\7\u00af\2\2\u0549\u054b\7\b\2\2\u054a\u0549\3\2\2\2\u054a"+
		"\u054b\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054d\t$\2\2\u054d\u00d1\3\2"+
		"\2\2\u054e\u0550\7\u00ba\2\2\u054f\u0551\7\b\2\2\u0550\u054f\3\2\2\2\u0550"+
		"\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553\t%\2\2\u0553\u00d3\3\2"+
		"\2\2\u0554\u0556\7\u00bb\2\2\u0555\u0557\7\b\2\2\u0556\u0555\3\2\2\2\u0556"+
		"\u0557\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\t%\2\2\u0559\u00d5\3\2"+
		"\2\2\u055a\u055c\7\u00bc\2\2\u055b\u055d\7\b\2\2\u055c\u055b\3\2\2\2\u055c"+
		"\u055d\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\7\u00e9\2\2\u055f\u00d7"+
		"\3\2\2\2\u0560\u0561\7\u00bd\2\2\u0561\u0562\t\35\2\2\u0562\u00d9\3\2"+
		"\2\2\u0563\u0564\7\u00c2\2\2\u0564\u0565\5&\24\2\u0565\u00db\3\2\2\2\u0566"+
		"\u0568\7\u00d0\2\2\u0567\u0569\7\b\2\2\u0568\u0567\3\2\2\2\u0568\u0569"+
		"\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\7\3\2\2\u056b\u0570\5\24\13\2"+
		"\u056c\u056d\7\t\2\2\u056d\u056f\5\24\13\2\u056e\u056c\3\2\2\2\u056f\u0572"+
		"\3\2\2\2\u0570\u056e\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0573\3\2\2\2\u0572"+
		"\u0570\3\2\2\2\u0573\u0574\7\n\2\2\u0574\u00dd\3\2\2\2\u0575\u057c\5\u00e0"+
		"q\2\u0576\u057c\5\u00e2r\2\u0577\u057c\5\u00e4s\2\u0578\u057c\5\u00e6"+
		"t\2\u0579\u057c\5\u00e8u\2\u057a\u057c\5\u00eav\2\u057b\u0575\3\2\2\2"+
		"\u057b\u0576\3\2\2\2\u057b\u0577\3\2\2\2\u057b\u0578\3\2\2\2\u057b\u0579"+
		"\3\2\2\2\u057b\u057a\3\2\2\2\u057c\u00df\3\2\2\2\u057d\u057f\5\u00ecw"+
		"\2\u057e\u0580\5\u00f2z\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2\2\2\u0580"+
		"\u0582\3\2\2\2\u0581\u0583\5\u00f4{\2\u0582\u0581\3\2\2\2\u0582\u0583"+
		"\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0588\5\u00f8}\2\u0585\u0587\5\u00f6"+
		"|\2\u0586\u0585\3\2\2\2\u0587\u058a\3\2\2\2\u0588\u0586\3\2\2\2\u0588"+
		"\u0589\3\2\2\2\u0589\u00e1\3\2\2\2\u058a\u0588\3\2\2\2\u058b\u058d\5\u00ee"+
		"x\2\u058c\u058b\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058e\3\2\2\2\u058e"+
		"\u058f\7\u00a3\2\2\u058f\u0594\7n\2\2\u0590\u0593\5\u00f4{\2\u0591\u0593"+
		"\5\u00f2z\2\u0592\u0590\3\2\2\2\u0592\u0591\3\2\2\2\u0593\u0596\3\2\2"+
		"\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0594"+
		"\3\2\2\2\u0597\u059b\5\u00f8}\2\u0598\u059a\5\u00f6|\2\u0599\u0598\3\2"+
		"\2\2\u059a\u059d\3\2\2\2\u059b\u0599\3\2\2\2\u059b\u059c\3\2\2\2\u059c"+
		"\u00e3\3\2\2\2\u059d\u059b\3\2\2\2\u059e\u05a0\5\u00eex\2\u059f\u059e"+
		"\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3\7\u00d1\2"+
		"\2\u05a2\u05a4\5\u00ecw\2\u05a3\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4"+
		"\u05a6\3\2\2\2\u05a5\u05a7\5\u00f2z\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7"+
		"\3\2\2\2\u05a7\u05a9\3\2\2\2\u05a8\u05aa\5\u00f4{\2\u05a9\u05a8\3\2\2"+
		"\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05af\5\u00f8}\2\u05ac"+
		"\u05ae\5\u00f6|\2\u05ad\u05ac\3\2\2\2\u05ae\u05b1\3\2\2\2\u05af\u05ad"+
		"\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u00e5\3\2\2\2\u05b1\u05af\3\2\2\2\u05b2"+
		"\u05b4\t&\2\2\u05b3\u05b5\5\u00ecw\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3"+
		"\2\2\2\u05b5\u05b7\3\2\2\2\u05b6\u05b8\5\u00f2z\2\u05b7\u05b6\3\2\2\2"+
		"\u05b7\u05b8\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05bd\5\u00f8}\2\u05ba"+
		"\u05bc\5\u00f6|\2\u05bb\u05ba\3\2\2\2\u05bc\u05bf\3\2\2\2\u05bd\u05bb"+
		"\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u00e7\3\2\2\2\u05bf\u05bd\3\2\2\2\u05c0"+
		"\u05c2\5\u00eex\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3"+
		"\3\2\2\2\u05c3\u05c4\7U\2\2\u05c4\u05c6\7n\2\2\u05c5\u05c7\5\u00f2z\2"+
		"\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9"+
		"\5\u00f8}\2\u05c9\u05ca\5\u0104\u0083\2\u05ca\u00e9\3\2\2\2\u05cb\u05cd"+
		"\5\u00eex\2\u05cc\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\3\2\2"+
		"\2\u05ce\u05cf\7&\2\2\u05cf\u05d0\5\n\6\2\u05d0\u00eb\3\2\2\2\u05d1\u05d2"+
		"\t\n\2\2\u05d2\u00ed\3\2\2\2\u05d3\u05d5\7\61\2\2\u05d4\u05d6\5\u00f0"+
		"y\2\u05d5\u05d4\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u00ef\3\2\2\2\u05d7"+
		"\u05dd\5\24\13\2\u05d8\u05d9\5\24\13\2\u05d9\u05da\7\4\2\2\u05da\u05db"+
		"\5\24\13\2\u05db\u05dd\3\2\2\2\u05dc\u05d7\3\2\2\2\u05dc\u05d8\3\2\2\2"+
		"\u05dd\u00f1\3\2\2\2\u05de\u05df\5\24\13\2\u05df\u00f3\3\2\2\2\u05e0\u05e1"+
		"\7\u00d5\2\2\u05e1\u05e2\t\'\2\2\u05e2\u00f5\3\2\2\2\u05e3\u05e4\7p\2"+
		"\2\u05e4\u05e5\7\b\2\2\u05e5\u05ee\7\u00e9\2\2\u05e6\u05ee\5\u00f4{\2"+
		"\u05e7\u05e8\7\u00dd\2\2\u05e8\u05e9\7\u009a\2\2\u05e9\u05ee\5\24\13\2"+
		"\u05ea\u05eb\7-\2\2\u05eb\u05ee\5\"\22\2\u05ec\u05ee\t\r\2\2\u05ed\u05e3"+
		"\3\2\2\2\u05ed\u05e6\3\2\2\2\u05ed\u05e7\3\2\2\2\u05ed\u05ea\3\2\2\2\u05ed"+
		"\u05ec\3\2\2\2\u05ee\u00f7\3\2\2\2\u05ef\u05f0\7\3\2\2\u05f0\u05f1\5\u00fa"+
		"~\2\u05f1\u05f2\7\n\2\2\u05f2\u00f9\3\2\2\2\u05f3\u05f8\5\u00fc\177\2"+
		"\u05f4\u05f5\7\t\2\2\u05f5\u05f7\5\u00fc\177\2\u05f6\u05f4\3\2\2\2\u05f7"+
		"\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u00fb\3\2"+
		"\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05fd\5\24\13\2\u05fc\u05fe\5\u00fe\u0080"+
		"\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0600\3\2\2\2\u05ff\u0601"+
		"\5\u0102\u0082\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u00fd\3"+
		"\2\2\2\u0602\u0603\7\3\2\2\u0603\u0604\5\u0100\u0081\2\u0604\u0605\7\n"+
		"\2\2\u0605\u00ff\3\2\2\2\u0606\u0608\7\u00e9\2\2\u0607\u0606\3\2\2\2\u0608"+
		"\u0609\3\2\2\2\u0609\u0607\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u0101\3\2"+
		"\2\2\u060b\u060c\t\20\2\2\u060c\u0103\3\2\2\2\u060d\u060e\7\u00a8\2\2"+
		"\u060e\u060f\5\16\b\2\u060f\u0615\5\u00f8}\2\u0610\u0614\5\u0106\u0084"+
		"\2\u0611\u0614\5\u0108\u0085\2\u0612\u0614\5\u010a\u0086\2\u0613\u0610"+
		"\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0612\3\2\2\2\u0614\u0617\3\2\2\2\u0615"+
		"\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0105\3\2\2\2\u0617\u0615\3\2"+
		"\2\2\u0618\u0619\7|\2\2\u0619\u061f\7V\2\2\u061a\u061b\7|\2\2\u061b\u061f"+
		"\7\u009b\2\2\u061c\u061d\7|\2\2\u061d\u061f\7\u00b6\2\2\u061e\u0618\3"+
		"\2\2\2\u061e\u061a\3\2\2\2\u061e\u061c\3\2\2\2\u061f\u0107\3\2\2\2\u0620"+
		"\u0621\7\u0094\2\2\u0621\u0622\7?\2\2\u0622\u0623\5\u010c\u0087\2\u0623"+
		"\u0109\3\2\2\2\u0624\u0625\7\u0094\2\2\u0625\u0626\7\u00d3\2\2\u0626\u0627"+
		"\5\u010c\u0087\2\u0627\u010b\3\2\2\2\u0628\u062f\7\u00ae\2\2\u0629\u062f"+
		"\7!\2\2\u062a\u062b\7\u00b3\2\2\u062b\u062f\7\u0090\2\2\u062c\u062d\7"+
		"\u008c\2\2\u062d\u062f\7\13\2\2\u062e\u0628\3\2\2\2\u062e\u0629\3\2\2"+
		"\2\u062e\u062a\3\2\2\2\u062e\u062c\3\2\2\2\u062f\u010d\3\2\2\2\u0630\u0631"+
		"\7F\2\2\u0631\u0633\t\"\2\2\u0632\u0634\5\u0114\u008b\2\u0633\u0632\3"+
		"\2\2\2\u0633\u0634\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636\5\24\13\2\u0636"+
		"\u010f\3\2\2\2\u0637\u0639\7F\2\2\u0638\u063a\7\u00c3\2\2\u0639\u0638"+
		"\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063d\7\u00c1\2"+
		"\2\u063c\u063e\5\u0114\u008b\2\u063d\u063c\3\2\2\2\u063d\u063e\3\2\2\2"+
		"\u063e\u063f\3\2\2\2\u063f\u0644\5\16\b\2\u0640\u0641\7\t\2\2\u0641\u0643"+
		"\5\16\b\2\u0642\u0640\3\2\2\2\u0643\u0646\3\2\2\2\u0644\u0642\3\2\2\2"+
		"\u0644\u0645\3\2\2\2\u0645\u064a\3\2\2\2\u0646\u0644\3\2\2\2\u0647\u0649"+
		"\5\u0112\u008a\2\u0648\u0647\3\2\2\2\u0649\u064c\3\2\2\2\u064a\u0648\3"+
		"\2\2\2\u064a\u064b\3\2\2\2\u064b\u0111\3\2\2\2\u064c\u064a\3\2\2\2\u064d"+
		"\u064e\t(\2\2\u064e\u0113\3\2\2\2\u064f\u0650\7\\\2\2\u0650\u0651\7M\2"+
		"\2\u0651\u0115\3\2\2\2\u0652\u0653\7\u00aa\2\2\u0653\u0654\7\u00c1\2\2"+
		"\u0654\u0659\5\u0118\u008d\2\u0655\u0656\7\t\2\2\u0656\u0658\5\u0118\u008d"+
		"\2\u0657\u0655\3\2\2\2\u0658\u065b\3\2\2\2\u0659\u0657\3\2\2\2\u0659\u065a"+
		"\3\2\2\2\u065a\u0117\3\2\2\2\u065b\u0659\3\2\2\2\u065c\u065d\5\16\b\2"+
		"\u065d\u065e\7\u00cb\2\2\u065e\u065f\5\16\b\2\u065f\u0119\3\2\2\2\u0660"+
		"\u0664\7\17\2\2\u0661\u0663\5\u0120\u0091\2\u0662\u0661\3\2\2\2\u0663"+
		"\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0667\3\2"+
		"\2\2\u0666\u0664\3\2\2\2\u0667\u0668\7\u00da\2\2\u0668\u0669\5\24\13\2"+
		"\u0669\u011b\3\2\2\2\u066a\u066d\7\64\2\2\u066b\u066c\7\u0097\2\2\u066c"+
		"\u066e\7\u00ad\2\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0672"+
		"\3\2\2\2\u066f\u0671\5\u0120\u0091\2\u0670\u066f\3\2\2\2\u0671\u0674\3"+
		"\2\2\2\u0672\u0670\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0675\3\2\2\2\u0674"+
		"\u0672\3\2\2\2\u0675\u0676\7\u00da\2\2\u0676\u0677\5\24\13\2\u0677\u011d"+
		"\3\2\2\2\u0678\u0679\7F\2\2\u0679\u067c\7\u00da\2\2\u067a\u067b\7\\\2"+
		"\2\u067b\u067d\7M\2\2\u067c\u067a\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e"+
		"\3\2\2\2\u067e\u0683\5\24\13\2\u067f\u0680\7\t\2\2\u0680\u0682\5\24\13"+
		"\2\u0681\u067f\3\2\2\2\u0682\u0685\3\2\2\2\u0683\u0681\3\2\2\2\u0683\u0684"+
		"\3\2\2\2\u0684\u0687\3\2\2\2\u0685\u0683\3\2\2\2\u0686\u0688\t(\2\2\u0687"+
		"\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u011f\3\2\2\2\u0689\u068a\7\16"+
		"\2\2\u068a\u068b\7\b\2\2\u068b\u0696\t)\2\2\u068c\u068d\7=\2\2\u068d\u0690"+
		"\7\b\2\2\u068e\u0691\5\20\t\2\u068f\u0691\7\66\2\2\u0690\u068e\3\2\2\2"+
		"\u0690\u068f\3\2\2\2\u0691\u0696\3\2\2\2\u0692\u0693\7\u00b9\2\2\u0693"+
		"\u0694\7\u00b1\2\2\u0694\u0696\t*\2\2\u0695\u0689\3\2\2\2\u0695\u068c"+
		"\3\2\2\2\u0695\u0692\3\2\2\2\u0696\u0121\3\2\2\2\u00d5\u0123\u0132\u0143"+
		"\u0148\u014d\u0153\u0159\u0164\u016b\u0171\u0174\u0177\u017d\u0186\u0192"+
		"\u0195\u0199\u019d\u01a0\u01a9\u01ad\u01b3\u01bc\u01c0\u01cc\u01dd\u01e0"+
		"\u01e4\u01e8\u01ec\u01f1\u01f6\u01fa\u0201\u0206\u020a\u020e\u0212\u0216"+
		"\u021a\u0225\u022e\u0252\u025c\u0272\u027d\u0285\u0295\u029f\u02a4\u02ad"+
		"\u02b8\u02bd\u02ca\u02d7\u02e4\u02eb\u02f1\u02f5\u02fa\u0301\u0308\u030f"+
		"\u0317\u031a\u031e\u0323\u0329\u032e\u0333\u0339\u033e\u0341\u0346\u034c"+
		"\u0353\u0356\u035a\u035e\u0363\u0365\u036a\u0372\u0374\u0379\u037e\u0385"+
		"\u038a\u0392\u0394\u0399\u039e\u03a0\u03a7\u03a9\u03b1\u03b8\u03ba\u03bd"+
		"\u03c8\u03d4\u03d7\u03db\u03e9\u03f0\u03fa\u0401\u0406\u040d\u0411\u0416"+
		"\u041a\u041d\u0429\u0434\u0439\u043f\u0442\u0445\u0448\u044d\u0453\u0458"+
		"\u045d\u0460\u0467\u0478\u047a\u0480\u0485\u048a\u048c\u0493\u0497\u049b"+
		"\u049f\u04a3\u04ad\u04b4\u04b7\u04bc\u04d7\u04db\u04e1\u04e5\u04eb\u04f0"+
		"\u04f5\u04f8\u0504\u050a\u0511\u0517\u051e\u0524\u052a\u0530\u0536\u053c"+
		"\u0540\u0544\u054a\u0550\u0556\u055c\u0568\u0570\u057b\u057f\u0582\u0588"+
		"\u058c\u0592\u0594\u059b\u059f\u05a3\u05a6\u05a9\u05af\u05b4\u05b7\u05bd"+
		"\u05c1\u05c6\u05cc\u05d5\u05dc\u05ed\u05f8\u05fd\u0600\u0609\u0613\u0615"+
		"\u061e\u062e\u0633\u0639\u063d\u0644\u064a\u0659\u0664\u066d\u0672\u067c"+
		"\u0683\u0687\u0690\u0695";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}