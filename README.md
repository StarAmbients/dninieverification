Calculation of the control digit of the NIF/NIE

Article 11 of Royal Decree 1553/2005, of December 23, establishes that the National Identity Document will include the personal number of the DNI and the verification character corresponding to the Tax Identification number.

     To verify the NIF of Spanish residents of legal age, the check digit calculation algorithm is as follows:

The number is divided by 23 and the remainder is replaced by a letter that is determined by inspection using the following table:
OTHER 0 1 2 3 4 5 6 7 8 9 10 11
LETTER T R W A G M Y F P D X B

 
REST 12 13 14 15 16 17 18 19 20 21 22
LETTER N J Z S Q V H L C K E

 

For example, if the ID number is 12345678, divided by 23, with a remainder of 14, then the letter would be Z: 12345678Z.

 

     The NIE's of foreigners residing in Spain have a letter (X, Y, Z), 7 numbers and a control digit.

To calculate the check digit, replace:

     X → 0
     Y → 1
     Z → 2

and the same algorithm is applied as for the NIF.

[# dninieverification](https://www.interior.gob.es/opencms/ca/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/)
