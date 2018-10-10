package com.zendesk.maxwell.schema.ddl;

import com.zendesk.maxwell.schema.Table;
import com.zendesk.maxwell.schema.columndef.ColumnDef;

class RenameColumnMod extends ColumnMod {

	private String newName;

	public RenameColumnMod(String oldName, String newName) {
		super(oldName);
		this.newName = newName;
	}

	@Override
	public void apply(Table table) throws InvalidSchemaError {
		int idx = originalIndex(table);
		table.renameColumn(idx, this.name, this.newName);
	}
}
