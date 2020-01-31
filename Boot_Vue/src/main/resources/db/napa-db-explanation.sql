CREATE DATABASE IF NOT EXISTS `NAPAONLINE`	/*!40100 DEFAULT CHARACTER SET latin1 */;

/*!40100 DEFAULT CHARACTER SET latin1 */; EXPLANATION

It's a conditional comment that can be interpreted by MySQL

The code 40100 means only these versions of MySQL>=4.1.0 (4.01.00) will interpret the conditional comment.

The ! is here to force MySQL to parse the code between the /* ... */

It sets the value of the parameter DEFAULT CHARACTER = 'latin1' so that the 
data in an SQL dump can be intepreted correctly during import. 
It doesn't affect the database structure, but merely helps the export/import process to work right.