PRINT MACRO M
MOV DX,OFFSET M
MOV AH,09H
INT 21H
ENDM

ASSUME CS:CODE,DS:DATA
DATA SEGMENT
MSG1 DB 'ENTER CHARACTER',0ah,0dh,'$'	
DATA ENDS

CODE SEGMENT
START:
MOV AX,DATA
MOV DS,AX
PRINT MSG1
MOV AH,01H
INT 21H
MOV DL,AL
MOV AH,02H
INT 21H
MOV AH,4CH
INT 21H
CODE ENDS
END START	