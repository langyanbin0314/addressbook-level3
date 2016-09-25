package seedu.addressbook.storage;
import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;
/**
 * 
 * public interface to store storage of addressbook
 *
 */
public interface Storage {
	/**
	 * 
	 * load data from storage
	 * throws StorageOperationException if there's error importing data
	 */
	AddressBook load() throws StorageOperationException;
	
	/**
	 * 
	 * get the path of the storage
	 */
	String getPath();
	
    /**
     * Saves all data to this storage file.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to file.
     */	
	void save(AddressBook addressBook) throws StorageOperationException;
	
}
