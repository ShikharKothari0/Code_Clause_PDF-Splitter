# Code_Clause_PDF-Splitter
A java project created by me during my internship at CodeClause which is used  to split a PDF into multiple pdf(s).
in this project I tried to create a simple GUI program which could be used to split a single PDF into multiple pdf(s).
This can be done in two ways:-<br>
&emsp;&emsp;1. &emsp; Either you can slip a PDF to multiple PDFs where every PDF contains a single page of the selected PDF.<br>
 &emsp;&emsp;2. &emsp; Or we can mention the starting and ending page in the GUI of the program and the program will create a new PDF that <br> &emsp;&emsp;&emsp;&emsp; will  consist of the pages that lie between the starting and the ending pages mention by the user.<br>
&emsp;&emsp;&emsp;&emsp;<b>(the starting and ending pages are also included in the pdf).</b> <br>
The user can select between these two modes of operation by selecting the radio button which if enabled will cause the program to perform the splitting of PDF into all its constituent pages else it will require a number to be entered in the starting and ending page textfields. <br>
It is also programmed to show the corresponding error messages if the user selects the radio button and leaves the "start page" or "end page" blank.
To achieve the fuctionality of PDF reading and writing, I made use of a Third Party Library called "iTextPdf" which enables us to read and write the pages of a PDF file
