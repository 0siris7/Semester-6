PRINT MACRO M
	MOV DX,OFFSET M
	MOV AH,09H
	INT 21H
ENDM
ASSUME CS:CODE,DS:DATA
DATA SEGMENT
	STR1 DB 80 DUP('$')
	STR2 DB 80 DUP('$')
	MS1 DB 'enter STRING',0AH,0DH,'$'
	MS2 DB 'REVERSE STRING',0AH,0DH,'$'
	MS3 DB 'ORIGINAL STRING',0AH,0DH,'$'
DATA ENDS
CODE SEGMENT
	START:
	MOV AX,DATA
	MOV DS,AX
	MOV CL,0H
	PRINT MS1
	MOV SI,OFFSET STR1
LA1: 	MOV AH,01H
	INT 21H
	CMP AL,0DH
	JZ LA2
	MOV [SI],AL
	INC CL
	INC SI
	JMP LA1
LA2: 	MOV BL,CL
	MOV DI,OFFSET STR2
LA6:	DEC SI
	MOV AL,[SI]
	MOV [DI],AL
	INC DI
	DEC CL
	JZ LA3
	JMP LA6
LA3: 	PRINT MS2
	JMP LA4
LA4: 	PRINT STR2
	JMP LA5
LA5:	PRINT MS3
	PRINT STR1
	MOV AH,01H
	INT 21H
	MOV AH,4CH
	INT 21H
CODE ENDS
END START
	