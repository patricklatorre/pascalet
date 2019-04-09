program Input;

var actualMark: Integer;
var possibleMark: Integer;
var percentageMark: Integer;

function f1(x:string):string;
var someVar1: Integer;
var someVar2: String;
var somevar3: Integer;
begin
    WriteLn(x, someVar1, someVar2, somevar3);
end;


begin {Input}
    writeln('Pass or fail checker');
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