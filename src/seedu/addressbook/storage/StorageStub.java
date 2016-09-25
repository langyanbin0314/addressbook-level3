package seedu.addressbook.storage;

import seedu.addressbook.storage.StorageFile.StorageOperationException;
import seedu.addressbook.data.AddressBook;

/**
 * storageStub for the test case
 * @author langyanbin0314
 *
 */
public class StorageStub implements Storage {
	/**
	 * constructor
	 */
	public StorageStub() {}
	
	@Override
	public AddressBook load() throws StorageOperationException {
		return new AddressBook();
	}
	
	@Override
	public String getPath() {
		return "";
	}
	
	@Override
	public void save(AddressBook addressBook) throws StorageOperationException {
		//do nothing
	}
	
	

}
