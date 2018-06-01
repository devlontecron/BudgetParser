# BudgetParser
A simple parser and tagging system to identify and group Banking transactions and return sums.

### Key Ideologies: 
* General use for specific formats or other sources.
* Granular control for tagging and identification.
* No outside resources required (database, server, api's)

### Key Features:
* Uses no database but does have persisting data for tags and identification.
* Prompts user for unidentifiable tags
* Formatting and parsing specific formats to general CSV

### Breakdown
On start, the program will request a text file to be given. The formatting is only tested for Bank of America's current text output from transaction history. But current implementation logic should generalize data from most sources. 

The program will remove, and reformate text file to CSV. 

From here, the program will read entries looking for key strings that are defined in the "database.csv" file. after identifying, grouping, and processing, the program will output total cash amounts, total transactions, and any remaining or unidentifiable entries. 

The remaining entries will prompt the user to identify the entry and what tag to associate it.

### Future Implementations:
* Outsource tagging to an api for more global tagging.
