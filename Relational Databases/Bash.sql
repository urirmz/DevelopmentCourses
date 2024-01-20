-- Bash terminal

-- The first thing you need to do is start the terminal. Do that by clicking the "hamburger" menu at the top left of the screen, going to the "terminal" section, and clicking "new terminal"
-- The echo command lets you print anything to the terminal. Type "echo Hello terminal!". You can print to a file instead of the terminal with echo text >> filename
-- Type pwd into the terminal and press enter to see the path of the folder. pwd stands for "print working directory".
-- Type ls into the terminal to see what's in this folder. ls stands for "list".
-- You can use cd <folder_name> to go into a folder. cd stands for "change directory".
-- You can use cd .. to go back a folder level. The two dots will take you back one level. 
-- You can see what's in a file with more <filename>
-- You can empty the terminal with clear
-- You can add a flag to a command to use it different ways like this: ls <flag>. List the contents of the node_modules folder in "long list format". Do that by adding the -l flag to the "list" command.
-- You can go back two folders with cd ../... Each set of dots represents another folder level. 
-- You can make a new folder with mkdir <folder_name>. mkdir stands for "make directory".
-- You can use touch <filename> to create a new file.
-- You might turn this into a git repository. Create .gitignore in the folder with the touch method.
-- Most commands have a --help flag to show what the command can do
-- Using ls -a you can look the hidden items in the folder.The . takes you to the folder you are in, and .. takes you back, or up, a folder
-- You can copy a file with cp <file> <destination>. cp stands for "copy". 
-- You can remove a file with rm <filename>. There's a -r flag that says, remove directories and their contents recursively. That will remove the folder and everything in it.
--  You can rename files with mv like this: mv <filename> <new_filename>. mv stands for "move", it can rename or move something.
-- You can use find to find things or view a file tree. A single dot represents the actual folder.  You can use find <folder_name> to display the tree of a different folder.
--  You can search for something with find -name <filename>
-- You can use rmdir <directory_name> to remove a folder. rmdir stands for "remove directory".