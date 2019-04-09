program Input;

var actualMark: Integer;
var possibleMark: Integer;
var percentageMark: Real;

begin {Input}
    writeln('Pass or fail checker', wowparameter);
    writeln('Please type your score: ');
    readln(actualMark);
    
    writeln('Please type the total number of items in the exam: ');
    readln(possibleMark);
    
    percentageMark := (actualMark / possibleMark) * 100;
    
    if (percentageMark >= 60) then
        begin
            writeln('Pass');
        end
    else 
        begin
            writeln('Fail');
        end;
    {endif}

end. {Input}