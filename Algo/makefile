# Please don't just copy that! (But have a look at example of Tutor)
# Seems to work for me, but not necessarily for you...

JC = javac
JCFLAGS = -g
JBINDIR = bin

JAVA = java
JAVAFLAGS = -cp

JDOC = javadoc
JDOCDIR = java-doc

# Make JUnit4-Tests work...
# these jar's have to be in same directory as makefile
# I found them in: /usr/share/java/ (Ubuntu)
JUNIT = ./junit4-4.11.jar
HAM = ./hamcrest-core-1.3.jar

# TestLinkedLists.java is my only JUnit-Test-class (your entry/ entries may be different)
TESTSOURCE = ./src/main/TestLinkedLists.java
TESTCLASS = main.TestLinkedLists

# Prog1Tools-folder (not .zip!) has to be in same directory as makefile
# (only if you make use of IOTools)
IOTOOLS = ./Prog1Tools

MAINCLASS= main/Main

# your sources will be different!
SOURCES = ./src/main/Main.java \
	  ./src/data/Student.java \
	  ./src/data/StudyPath.java \
	  ./src/destroy/MatriculationNumberDelete.java \
	  ./src/listable/Listable.java \
	  ./src/listable/DoublyLinkedList.java \
	  ./src/listable/SinglyLinkedList.java \
	  ./src/search/MatriculationNumberSequSearch.java \
	  ./src/search/PrenameSequSearch.java \
	  ./src/search/Searchable.java \
	  ./src/search/StudyPathSequSearch.java \
	  ./src/search/SurnameSequSearch.java \
	  ./src/sort/BubbleSort.java \
	  ./src/sort/Comparator.java \
	  ./src/sort/MatriculationNumberComparator.java \
	  ./src/sort/PrenameComparator.java \
	  ./src/sort/SelectionSort.java \
	  ./src/sort/Sortable.java \
	  ./src/sort/StudyPathComparator.java \
	  ./src/sort/SurnameComparator.java \


# Added line 4 of default to compile JUnit-Sourcefile as well (see above)
# (Remove last line of default if you don't use IOTools)
default:
	echo 'Run target default'
	mkdir -p $(JBINDIR)
	$(JC) $(JCFLAGS) $(SOURCES) -d $(JBINDIR)
	$(JC) $(JAVAFLAGS) $(JUNIT):$(JBINDIR) $(TESTSOURCE) -d $(JBINDIR)
	-cp -r $(IOTOOLS) $(JBINDIR)

run-app:
	@echo 'Run target run-app'
	cd $(JBINDIR); $(JAVA) $(JAVAFLAGS) . $(MAINCLASS)

# This JUnit test should work now if you adjusted entries above:
run-test:
	@echo 'Run target run-test'
	cd $(JBINDIR); $(JAVA) $(JAVAFLAGS) .:.$(JUNIT):.$(HAM) org.junit.runner.JUnitCore $(TESTCLASS)

doc:
	@echo 'Run target doc' 
	$(JDOC) -version -author -d $(JDOCDIR) $(SOURCES)

clean:
	@echo 'Run target clean'
	$(RM) -r $(JBINDIR)

distclean: clean
	@echo 'Run target distclean'
	$(RM) -r $(JDOCDIR)

release: distclean default doc
